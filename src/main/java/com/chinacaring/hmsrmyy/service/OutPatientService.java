package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.ClinicRecordRequest;

import java.text.ParseException;

public interface OutPatientService {

    Object getClinicRecords(ClinicRecordRequest clinicRecordRequest) throws CommonException, ParseException;

    Object getMedicalRecords(String registerId) throws CommonException;
}
