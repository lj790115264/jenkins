package com.chinacaring.hmsrmyy.controller;

import com.chinacaring.common.vo.Result;
import com.chinacaring.hmsrmyy.service.BaseInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @ApiOperation("科室列表")
    @GetMapping(value = "/dept")
    public Object getDepts(){
        return new Result<>(baseInfoService.getDepts());
    }

}
