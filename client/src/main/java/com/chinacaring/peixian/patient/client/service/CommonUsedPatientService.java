package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.request.CommonUsedPatientRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.BindCommonUsedPatientResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.CommonUsedPatientResponse;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;
import java.util.List;

public interface CommonUsedPatientService {


    BindCommonUsedPatientResponse bindCommonUsedPatient(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException, ParseException;

    boolean deleteCommonUsedPatient(String idCard, User user) throws CommonException;

    List<CommonUsedPatientResponse> getCommonUsedPatient(User user) throws CommonException;

    //修改常用就诊人的手机号
    boolean modifyPhone(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException, MyException;
}
