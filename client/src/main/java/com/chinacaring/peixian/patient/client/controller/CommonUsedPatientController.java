package com.chinacaring.peixian.patient.client.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.dto.front.request.CommonUsedPatientRequest;
import com.chinacaring.peixian.patient.client.service.CommonUsedPatientService;
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
    @PostMapping("/patient")
    public Object bindCommonUsedPatient(@RequestBody CommonUsedPatientRequest commonUsedPatientRequest, @CurrentUser User user) throws CommonException, ParseException {

        return new Result<>(commonUsedPatientService.bindCommonUsedPatient(commonUsedPatientRequest, user));

    }

    @ApiOperation("删除常用就诊人")
    @DeleteMapping("/patient")
    public Object deleteCommonUsedPatient(@RequestParam("id_card") String idCard, @CurrentUser User user) throws CommonException {

        return new Result<>(commonUsedPatientService.deleteCommonUsedPatient(idCard, user));

    }

    @ApiOperation("查询常用就诊人")
    @GetMapping("/patient")
    public Object getCommonUsedPatient(@CurrentUser User user) throws CommonException {

        return new Result<>(commonUsedPatientService.getCommonUsedPatient(user));

    }


    @ApiOperation("修改常用就诊人的手机号")
    @PutMapping("/patient")
    public Object modifyPhoneCommonUsedPatient(@RequestBody CommonUsedPatientRequest commonUsedPatientRequest, @CurrentUser User user) throws CommonException {

        return new Result<>(commonUsedPatientService.modifyPhone(commonUsedPatientRequest, user));

    }

}
