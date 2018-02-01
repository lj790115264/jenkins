package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.request.ClinicRecordRequest;
import com.chinacaring.peixian.patient.client.dto.front.request.OutpatientInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.request.PrescriptionRequest;
import com.chinacaring.peixian.patient.client.dto.front.request.UnpaidOutpatientRequest;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;

public interface OutPatientService {

    Object getOutpatientRecords(ClinicRecordRequest clinicRecordRequest) throws CommonException, ParseException;

    Object getMedicalRecords(String registerId) throws CommonException;

    Object getUnpaidClinicRecords(UnpaidOutpatientRequest unpaidOutpatientRequest) throws CommonException, ParseException;

    Object getPrescription(PrescriptionRequest prescriptionRequest) throws CommonException, ParseException;

    Object createOutpatientOrder(OutpatientInfoRequest outpatientInfoRequest, User user) throws CommonException;

    Boolean doOutpatientConfirm(String orderNo) throws CommonException;

    Object getOutpatientStatus(Integer id) throws CommonException;


}
