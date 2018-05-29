package com.chinacaring.peixian.patient.client.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    private QueueService queueService;


    @GetMapping("/dept")
    public Object getQueueDept() throws CommonException {
        return new Result<>(queueService.getQueueDept());
    }

    @GetMapping("/{patient_code}")
    public Object getQueuePatient(@PathVariable("patient_code") String patientCode) throws CommonException {
        return new Result<>(queueService.getQueuePatient(patientCode));
    }
}
