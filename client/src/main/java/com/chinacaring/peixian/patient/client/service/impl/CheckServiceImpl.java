package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dto.front.response.CheckResponse;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.CheckService;
import com.chinacaring.peixian.patient.client.wsdl.reponse.pacs_resultinfo.PacsResultInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.pacs_resultinfo.PacsResultInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
            throw new SoapException("检查无相关数据", res, cardNo + "-" + beginDate + "-" + endDate);
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())){
            throw new SoapException("检查无相关数据", soap.getResult().getReturnDesc(), cardNo + "-" + beginDate + "-" + endDate);
        } else if (soap.getData().getPacsResultInfo().isEmpty()){
            throw new MyException("检查无相关数据", cardNo + "-" + beginDate + "-" + endDate);
        }
        List<CheckResponse> responseList = new ArrayList<>();
        for (PacsResultInfo department: soap.getData().getPacsResultInfo()) {
            CheckResponse response = new CheckResponse();
            response.setDescript(department.getREPORTDESCRIBE());
            response.setDiagnose(department.getREPORTDIAGNOSE());
            response.setTime(department.getSTUDYTIME());
            response.setDocName(department.getDOCNAME());
            response.setDevice(department.getDEVICENAME());
            response.setDescript(department.getSTUDYSCRIPTION());
            responseList.add(response);
        }

        return null;
    }
}
