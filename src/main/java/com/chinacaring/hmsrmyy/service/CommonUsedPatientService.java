package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.CommonUsedPatientRequest;
import com.chinacaring.hmsrmyy.dto.front.response.BindCommonUsedPatientResponse;
import com.chinacaring.hmsrmyy.dto.front.response.CommonUsedPatientResponse;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;
import java.util.List;

public interface CommonUsedPatientService {


    BindCommonUsedPatientResponse bindCommonUsedPatient(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException, ParseException;

    boolean deleteCommonUsedPatient(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException;

    List<CommonUsedPatientResponse> getCommonUsedPatient(User user) throws CommonException;

    //修改常用就诊人的手机号
    boolean modifyPhone(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException;
}
