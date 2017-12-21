package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.hmsrmyy.dto.front.request.CommonUsedPatientRequest;
import com.chinacaring.hmsrmyy.service.CommonUsedPatientService;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@Api("常用就诊人接口")
public class CommonUsedPatientController {

    @Autowired
    private CommonUsedPatientService commonUsedPatientService;


    @ApiOperation("绑定常用就诊人")
    @PostMapping("common_userd_patient")
    public Object bindCommonUsedPatient(@RequestBody CommonUsedPatientRequest commonUsedPatientRequest, @CurrentUser User user) throws CommonException, ParseException {

        return new Result<>(commonUsedPatientService.bindCommonUsedPatient(commonUsedPatientRequest, user));

    }

    @ApiOperation("删除常用就诊人")
    @PutMapping("common_userd_patient")
    public Object deleteCommonUsedPatient(@RequestBody CommonUsedPatientRequest commonUsedPatientRequest, @CurrentUser User user) throws CommonException {

        return new Result<>(commonUsedPatientService.deleteCommonUsedPatient(commonUsedPatientRequest, user));

    }

    @ApiOperation("查询常用就诊人")
    @GetMapping("common_userd_patient")
    public Object getCommonUsedPatient(@CurrentUser User user) throws CommonException {

        return new Result<>(commonUsedPatientService.getCommonUsedPatient(user));

    }


    @ApiOperation("修改常用就诊人的手机号")
    @PatchMapping("common_userd_patient")
    public Object modifyPhoneCommonUsedPatient(@RequestBody CommonUsedPatientRequest commonUsedPatientRequest, @CurrentUser User user) throws CommonException {

        return new Result<>(commonUsedPatientService.modifyPhone(commonUsedPatientRequest, user));

    }


}