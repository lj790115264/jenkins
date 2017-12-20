package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.his.request.createProfile.CreateProfileRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.getExistProfile.GetExistProfileRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.createProfile.CreateProfileResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.getExistProfile.GetExistProfileResponseHis;

import java.util.Objects;

public interface BaseInfoService {

    GetExistProfileResponseHis getExistProfile(String idCard) throws CommonException;

    CreateProfileResponseHis createProfile(CreateProfileRequestHis createProfileRequestHis) throws CommonException;

    Object insertDepts() throws CommonException;

    Object getDepts();
}
