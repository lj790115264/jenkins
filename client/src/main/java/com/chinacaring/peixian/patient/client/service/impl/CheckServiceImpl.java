package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dto.front.response.CheckList;
import com.chinacaring.peixian.patient.client.dto.front.response.CheckResponse;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.CheckService;
import com.chinacaring.peixian.patient.client.utils.ListUtils;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import com.chinacaring.peixian.patient.client.wsdl.reponse.pacs_resultinfo.PacsResultInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.pacs_resultinfo.PacsResultInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private QuyiServiceNo service;
    @Override
    public Object getCheck(String cardNo, String beginDate, String endDate) throws MyException {

        String res = service.getQuyiServiceNoSoap().getPacsResultInfo(cardNo, beginDate, endDate);

        PacsResultInfoSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, PacsResultInfoSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, cardNo + "-" + beginDate + "-" + endDate);
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())){
            throw new SoapException("暂时没有数据哦～", soap.getResult().getReturnDesc(), cardNo + "-" + beginDate + "-" + endDate);
        } else if (soap.getData().getPacsResultInfo().isEmpty()){
            throw new MyException("暂时没有数据哦～", cardNo + "-" + beginDate + "-" + endDate);
        }
        List<CheckResponse> responseList = new ArrayList<>();
        for (PacsResultInfo department: soap.getData().getPacsResultInfo()) {
            CheckResponse response = new CheckResponse();
            response.setDescript(department.getReportdescribe());
            response.setCheckId(department.getCheckserialnum());
            response.setDiagnose(department.getReportdiagnose());
            response.setTime(ValidateUtils.soapTime(department.getStudytime(), "yyyy-MM-dd"));
            response.setDocName(department.getDocname());
            response.setDevice(department.getDevicename());
            response.setScription(department.getStudyscription());
            response.setCheckId(department.getCheckserialnum());
            responseList.add(response);
        }
        ListUtils<CheckResponse> listUtils = new ListUtils<>(responseList);

        Map<String, List<CheckResponse>> map = listUtils.groupBy(CheckResponse.class,
                "getCheckId");

        List<CheckList> checkLists = new ArrayList<>();
        for (List<CheckResponse> list: map.values()) {
            CheckList checkList = new CheckList();
            checkList.setDetail(list);
            checkList.setCheckId(list.get(0).getCheckId());
            checkList.setScription(list.get(0).getScription());
            checkList.setTime(list.get(0).getTime());
            checkLists.add(checkList);
        }
        return checkLists;
    }
}
