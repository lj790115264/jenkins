package com.chinacaring.hmsrmyy.controller;

import com.chinacaring.hmsrmyy.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @GetMapping(value = "depts")
    public Object getDepts(){
        return baseInfoService.getDepts();
    }

}
