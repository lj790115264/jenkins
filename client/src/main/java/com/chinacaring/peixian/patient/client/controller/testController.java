package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PriceService priceService;

    @GetMapping("/test/price")
    public Object testPrice() throws CommonException {
        return priceService.insertDb();
    }

    @GetMapping("/test2")
    public Object Test(String id) throws CommonException {
        return appointmentService.doRegister(id);
    }
}
