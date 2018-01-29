package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.dto.front.response.DoctorInfoResponse;
import com.chinacaring.peixian.patient.client.service.BaseInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/doctor/{id}")
    public Object doctor(@PathVariable("id") String id) {

        DoctorInfoResponse doctorInfoResponse = new DoctorInfoResponse();
        doctorInfoResponse.setBrief("暂无数据");
        doctorInfoResponse.setIntroduce("暂无数据");
        doctorInfoResponse.setName("暂无数据");
        return new Result(doctorInfoResponse);
    }
}
