package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dto.front.response.QueuePatientResponse;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.QueueService;
import com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_by_dept.Item;
import com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_by_dept.Response;
import com.chinacaring.peixian.patient.client.wsdl.request.WebServiceCallInterface;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class QueueServiceImpl implements QueueService {

    @Autowired
    private WebServiceCallInterface service;

    String request(String patientCode) {
        return "<request><patient_code>" + patientCode + "</patient_code></request>";
    }

    @Override
    public Object getQueueDept() throws CommonException, SoapException {
        String res = service.getWebServiceCallInterfaceSoap().getQueueByDept();
        Response soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, Response.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, "排队叫号数据出错");
        }
        if (!Objects.equals("0", soap.getCode())) {
            throw new SoapException("暂时没有数据哦～", soap.getMessage(), "排队叫号数据出错");
        }
        List<Item> origin = soap.getData().getItem();
        List<QueuePatientResponse> list = new ArrayList<>();
        for (Item item: origin) {

            QueuePatientResponse response = new QueuePatientResponse();
            response.setDeptCode(item.getDeptCode());
            response.setDeptName(item.getDeptName());
            response.setNextNo(item.getNextNo());
            response.setShowNo(item.getShowNo());
            response.setWaitQuantity(item.getWaitNum());
            list.add(response);
        }
        return list;
    }

    @Override
    public List<QueuePatientResponse> getQueuePatient(String patientCode) throws CommonException, SoapException {
        String res = service.getWebServiceCallInterfaceSoap().getQueueForPatient(request(patientCode));
        com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_for_patient.Response soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_for_patient.Response.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, "排队叫号数据出错");
        }
        if (!Objects.equals("0", soap.getCode())) {
            throw new SoapException("暂时没有数据哦～", soap.getMessage(), "排队叫号数据出错");
        }
        List<com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_for_patient.Item> origin = soap.getData().getItem();
        List<QueuePatientResponse> list = new ArrayList<>();
        for (com.chinacaring.peixian.patient.client.wsdl.reponse.get_queue_for_patient.Item item: origin) {

            QueuePatientResponse response = new QueuePatientResponse();
            response.setDeptCode(item.getDeptCode());
            response.setDeptName(item.getDeptName());
            response.setNextNo(item.getNextNo());
            response.setSeeNo(item.getSeeNo());
            response.setShowNo(item.getShowNo());
            response.setWaitQuantity(item.getWaitNum());
            list.add(response);
        }
        return list;
    }

}
