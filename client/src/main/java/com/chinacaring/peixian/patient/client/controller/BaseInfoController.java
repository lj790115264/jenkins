package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.service.BaseInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @GetMapping(value = "/deptList")
    public Object shedule() throws CommonException {

        return baseInfoService.insertDepts();
    }

    @ApiOperation("科室列表")
    @GetMapping(value = "/dept")
    public Object getDepts(){
        return new Result<>(baseInfoService.getDepts());
    }

}
