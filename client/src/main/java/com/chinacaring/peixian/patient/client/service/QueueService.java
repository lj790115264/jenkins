package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.response.QueuePatientResponse;
import com.chinacaring.peixian.patient.client.exception.SoapException;

import java.util.List;

public interface QueueService {

     Object getQueueDept() throws CommonException, SoapException;

    List<QueuePatientResponse> getQueuePatient(String patientCode) throws CommonException, SoapException;
}
