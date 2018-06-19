package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.service.BaseInfoService;
import com.chinacaring.peixian.patient.client.service.OutPatientService;
import com.chinacaring.peixian.patient.client.service.PriceService;
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
    @Autowired
    private BaseInfoService baseInfoService;

    @GetMapping("/chufaqi")
    public Object chufaqi() throws CommonException {
        baseInfoService.insertDepts();
        return "chufaqi";
    }

    @GetMapping("/test/price")
    public Object testPrice() throws CommonException, SoapException {
        return priceService.insertDb();
    }

    @GetMapping("/test2")
    public Object Test(String id) throws CommonException, InterruptedException, SoapException {
        return appointmentService.doRegister(id);
    }

    @GetMapping("/test3")
    public Object Test3(String id) throws CommonException, MyException {
        return outPatientService.doOutpatientConfirm(id);
    }
}
