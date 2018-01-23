package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.his2.CreateProfileRequestHis;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_patientinfo.InsertPatientInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno.PatientCardNo1;

public interface BaseInfoService {

    PatientCardNo1 getExistProfile(String idCard, String name) throws CommonException;

    InsertPatientInfo createProfile(CreateProfileRequestHis createProfileRequestHis) throws CommonException;

    Object insertDepts() throws CommonException;

    Object getDepts();
}
