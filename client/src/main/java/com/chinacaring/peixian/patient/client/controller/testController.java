package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.service.OutPatientService;
import com.chinacaring.peixian.patient.client.service.PriceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private OutPatientService outPatientService;
    @Autowired
    private PriceService priceService;

    @GetMapping("/test/price")
    public Object testPrice() throws CommonException {
        return priceService.insertDb();
    }

    @ApiOperation("测门诊缴费")
    @GetMapping("/test2")
    public Object Test2(String id) throws CommonException {
        return appointmentService.doRegister(id);
    }

    @ApiOperation("测门诊缴费")
    @GetMapping("/test3")
    public Object Test3(String id) throws CommonException {
        return outPatientService.doOutpatientConfirm(id);
    }
}
