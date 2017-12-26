package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.ClinicRecordRequest;
import com.chinacaring.hmsrmyy.dto.front.request.OutpatientInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.request.PrescriptionRequest;
import com.chinacaring.hmsrmyy.dto.front.request.UnpaidOutpatientRequest;
import com.chinacaring.hmsrmyy.service.OutPatientService;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class OutpatientController {

    @Autowired
    private OutPatientService outPatientService;

    @GetMapping("/outpatient/records")
    public Object getClinicRecords(@RequestParam("begin_time") String beginTime,
                                   @RequestParam("end_time") String endTime,
                                   @RequestParam("patient_code") String patientCode) throws CommonException, ParseException {

        return outPatientService.getOutpatientRecords(new ClinicRecordRequest(patientCode, beginTime, endTime));
    }

    @GetMapping("/outpatient/medical/records/{register_id}")
    public Object getOutpatientMedicalRecords(@PathVariable("register_id") String registerId) throws CommonException {
        return outPatientService.getMedicalRecords(registerId);
    }

    @GetMapping("/outpatient/unpaid/records")
    public Object getOutpatientUnpaidRecords(@RequestParam("begin_time") String beginTime,
                                             @RequestParam("end_time") String endTime,
                                             @RequestParam("patient_code") String patientCode) throws CommonException, ParseException {

        return outPatientService.getUnpaidClinicRecords(new UnpaidOutpatientRequest(patientCode, beginTime, endTime));
    }

    @GetMapping("/outpatient/prescription")
    public Object getPrescription(@RequestParam("register_id") String registerId,
                                  @RequestParam("is_fee") String isFee) throws CommonException, ParseException {
        return outPatientService.getPrescription(new PrescriptionRequest(registerId, isFee));
    }


    @PostMapping("/outpatient/order")
    public Object createOutpatientOrder(@RequestBody OutpatientInfoRequest outpatientInfoRequest, @CurrentUser User user){
        return null;
    }
}
