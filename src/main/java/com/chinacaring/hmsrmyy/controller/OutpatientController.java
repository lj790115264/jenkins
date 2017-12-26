package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.ClinicRecordRequest;
import com.chinacaring.hmsrmyy.service.OutPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class OutpatientController {

    @Autowired
    private OutPatientService outPatientService;

    @GetMapping("/outpatient/records")
    public Object getClinicRecords(@RequestParam("begin_time") String beginTime,
                                   @RequestParam("end_time") String endTime,
                                   @RequestParam("patient_code") String patientCode) throws CommonException, ParseException {

        return outPatientService.getClinicRecords(new ClinicRecordRequest(patientCode, beginTime, endTime));
    }

    @GetMapping("/outpatient/medical/records/{register_id}")
    public Object getOutpatientMedicalRecords(@PathVariable("register_id") String registerId) throws CommonException {
        return outPatientService.getMedicalRecords(registerId);
    }
}
