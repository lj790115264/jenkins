package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.service.CheckService;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@Api("检查接口")
public class CheckController {

    @Autowired
    private CheckService checkService;

    @GetMapping("clinic_check")
    public Object getClinicChecks(@RequestParam("card_no") String cardNo,
                                  @RequestParam("begin_time") String beginTime,
                                  @RequestParam("end_time") String endTime) throws CommonException, ParseException {

        beginTime = ValidateUtils.time(beginTime) + "000000";
        endTime = ValidateUtils.time(endTime) + "235959";
        return new Result<>(checkService.getCheck(cardNo, beginTime, endTime));
    }

}
