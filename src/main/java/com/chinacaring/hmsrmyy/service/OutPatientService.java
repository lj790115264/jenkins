package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.ClinicRecordRequest;
import com.chinacaring.hmsrmyy.dto.front.request.OutpatientInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.request.PrescriptionRequest;
import com.chinacaring.hmsrmyy.dto.front.request.UnpaidOutpatientRequest;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;
import java.util.Objects;

public interface OutPatientService {

    Object getOutpatientRecords(ClinicRecordRequest clinicRecordRequest) throws CommonException, ParseException;

    Object getMedicalRecords(String registerId) throws CommonException;

    Object getUnpaidClinicRecords(UnpaidOutpatientRequest unpaidOutpatientRequest) throws CommonException, ParseException;

    Object getPrescription(PrescriptionRequest prescriptionRequest) throws CommonException, ParseException;

    Object createOutpatientOrder(OutpatientInfoRequest outpatientInfoRequest, User user) throws CommonException;

    Object doOutpatientConfirm(String orderNo) throws CommonException;

    Object getOutpatientStatus(Integer id) throws CommonException;
}
