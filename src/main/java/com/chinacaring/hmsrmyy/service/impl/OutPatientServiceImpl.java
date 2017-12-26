package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dto.front.request.ClinicRecordRequest;
import com.chinacaring.hmsrmyy.dto.front.response.ClinicRecordResponse;
import com.chinacaring.hmsrmyy.dto.front.response.OutpatientMedicalRecordsResponse;
import com.chinacaring.hmsrmyy.dto.his.request.clinicRecords.ClinicRecordsRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.outPatientMedicalRecords.OutpatientMedicalRecordsRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.clinicRecords.ClinicRecordsResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.outPatientMedicalRecords.ItemType;
import com.chinacaring.hmsrmyy.dto.his.response.outPatientMedicalRecords.OutpatientMedicalRecordsResponseHis;
import com.chinacaring.hmsrmyy.service.OutPatientService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

@Service
public class OutPatientServiceImpl implements OutPatientService{

    @Override
    public Object getClinicRecords(ClinicRecordRequest clinicRecordRequest) throws CommonException, ParseException {

        ClinicRecordsRequestHis clinicRecordsRequestHis = BeanMapperUtil.map(clinicRecordRequest, ClinicRecordsRequestHis.class);
        String soap = RequestUtil.soap(InterfaceName.getClinicRecordsInfo.name(), JaxbXmlUtil.convertToXml(clinicRecordsRequestHis));
        ClinicRecordsResponseHis clinicRecordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap, ClinicRecordsResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, clinicRecordsResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }
        if (Objects.isNull(clinicRecordsResponseHis.getItems()) || clinicRecordsResponseHis.getItems().getItem().isEmpty() ){
            throw new CommonException("暂无相关信息");
        }

        List<ClinicRecordResponse> clinicRecordResponses = BeanMapperUtil.mapList(clinicRecordsResponseHis.getItems().getItem(), ClinicRecordResponse.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        for (ClinicRecordResponse clinicRecordResponse : clinicRecordResponses){
            clinicRecordResponse.setAppointmentTime(sdf.parse(clinicRecordResponse.getRegDate()));
            //普通号 医生信息处理
            if (StringUtils.isEmpty(clinicRecordResponse.getDoctorCode())){
                clinicRecordResponse.setDoctorCode("普通号");
                clinicRecordResponse.setDoctorName("普通号");
            }
        }
        return clinicRecordResponses;
    }

    @Override
    public Object getMedicalRecords(String registerId) throws CommonException {

        OutpatientMedicalRecordsRequestHis outpatientMedicalRecordsRequestHis = new OutpatientMedicalRecordsRequestHis();
        outpatientMedicalRecordsRequestHis.setRegNO(registerId);
        String soap = RequestUtil.soap(InterfaceName.GetOrderInfo.name(), JaxbXmlUtil.convertToXml(outpatientMedicalRecordsRequestHis));
        OutpatientMedicalRecordsResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap, OutpatientMedicalRecordsResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, recordsResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }
        List<ItemType> itemTypes = recordsResponseHis.getItems().getItem();
        if (Objects.isNull(recordsResponseHis.getItems()) || itemTypes.isEmpty() ){
            throw new CommonException("暂无相关信息");
        }

        return BeanMapperUtil.mapList(itemTypes, OutpatientMedicalRecordsResponse.class);
    }
}

