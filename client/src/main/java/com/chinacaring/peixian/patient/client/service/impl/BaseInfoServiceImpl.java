package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.Dept;
import com.chinacaring.peixian.patient.client.dao.repository.DeptRepository;
import com.chinacaring.peixian.patient.client.dto.front.response.DeptResponse;
import com.chinacaring.peixian.patient.client.dto.his2.CreateProfileRequestHis;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.service.BaseInfoService;
import com.chinacaring.peixian.patient.client.wsdl.reponse.dept_info.DeptSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_patientinfo.InsertPatientInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_patientinfo.InsertPatientInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno.GetPatientCardNo1Soap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno.PatientCardNo1;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNoSoap;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Autowired
    private DeptRepository deptRepository;

    @Autowired
    private QuyiServiceNo soap;

    @Override
    public PatientCardNo1 getExistProfile(String idCard, String name) throws MyException {

        String res = soap.getQuyiServiceNoSoap().getPatientCardNo1(name, null, idCard);
        GetPatientCardNo1Soap getPatientCardNo1Soap = JaxbXmlUtil.convertToJavaBean(res, GetPatientCardNo1Soap.class);
        if (!Objects.equals("1", getPatientCardNo1Soap.getResult().getReturnCode())) {
            throw new MyException("暂时没有数据哦～", getPatientCardNo1Soap.getResult().getReturnDesc());
        }
        return getPatientCardNo1Soap.getData().getPatientCardNo1();
    }

    @Override
    public InsertPatientInfo createProfile(CreateProfileRequestHis createProfileRequestHis) throws CommonException, MyException {

        String res = soap.getQuyiServiceNoSoap().insertPatientInfo(createProfileRequestHis.mixed());
        InsertPatientInfoSoap insertPatientInfoSoap = JaxbXmlUtil.convertToJavaBean(res, InsertPatientInfoSoap.class);
        if (!Objects.equals("1", insertPatientInfoSoap.getResult().getReturnCode())) {
            throw new MyException("操作失败", insertPatientInfoSoap.getResult().getReturnDesc());
        }
        return insertPatientInfoSoap.getData().getInsertPatientInfo();
    }

    @Override
    public Object insertDepts() throws CommonException {
        QuyiServiceNo no = new QuyiServiceNo();
        String soap = no.getQuyiServiceNoSoap().getDeptInfo("ALL");
        DeptSoap deptSoap = JaxbXmlUtil.convertToJavaBean(soap, DeptSoap.class);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, deptSoap.getResult().getReturnCode())) {
            throw new CommonException("暂时没有数据哦～");
        }

        List<Dept> depts = BeanMapperUtil.mapList(deptSoap.getData().getDept().stream().filter
                        (item -> "1".equals(item.getVALIDSTATE()) && "1".equals(item.getREGFLAG()))
                        .collect(Collectors.toList()), Dept.class);
        deptRepository.deleteAll();
        deptRepository.save(depts);
        return "ok";
    }

    @Override
    public Object getDepts() {
        List<Dept> depts = deptRepository.findByRegFlag(Constant.REG_FLAG_SHI_GUA_HAO_KE_SHI);
        List<DeptResponse> res = BeanMapperUtil.mapList(depts, DeptResponse.class);
        return res;
    }

}

