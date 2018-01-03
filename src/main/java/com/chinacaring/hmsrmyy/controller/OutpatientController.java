package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dto.front.request.ClinicRecordRequest;
import com.chinacaring.hmsrmyy.dto.front.request.OutpatientInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.request.PrescriptionRequest;
import com.chinacaring.hmsrmyy.dto.front.request.UnpaidOutpatientRequest;
import com.chinacaring.hmsrmyy.service.OutPatientService;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Objects;

@RestController
public class OutpatientController {

    @Autowired
    private OutPatientService outPatientService;

    @ApiOperation("历次门诊记录")
    @GetMapping("/clinic/record")
    public Object getClinicRecords(@RequestParam("begin_time") String beginTime,
                                   @RequestParam("end_time") String endTime,
                                   @RequestParam("patient_code") String patientCode) throws CommonException, ParseException {

        return new Result<>(outPatientService.getOutpatientRecords(new ClinicRecordRequest(patientCode, beginTime, endTime)));
    }

    @ApiOperation("门诊用药记录")
    @GetMapping("/clinic/medicine/record")
    public Object getOutpatientMedicalRecords(@RequestParam("register_id") String registerId) throws CommonException {
        return new Result<>(outPatientService.getMedicalRecords(registerId));
    }

    @ApiOperation("未缴费处方的门诊记录")
    @GetMapping("/clinic/bills")
    public Object getOutpatientUnpaidRecords(@RequestParam("begin_time") String beginTime,
                                             @RequestParam("end_time") String endTime,
                                             @RequestParam("patient_code") String patientCode) throws CommonException, ParseException {

        return new Result<>(outPatientService.getUnpaidClinicRecords(new UnpaidOutpatientRequest(patientCode, beginTime, endTime)));
    }

    @ApiOperation("门诊处方信息")
    @GetMapping("/clinic/recipe")
    public Object getPrescription(@RequestParam("register_id") String registerId,
                                  @RequestParam("is_fee") String isFee) throws CommonException, ParseException {
        return new Result<>(outPatientService.getPrescription(new PrescriptionRequest(registerId, isFee)));
    }

    @ApiOperation("创建门诊支付订单")
    @PostMapping("/clinic/recipe/charge")
    public Object createOutpatientOrder(@RequestBody OutpatientInfoRequest outpatientInfoRequest,
                                        @CurrentUser User user) throws CommonException {
        return new Result<>(outPatientService.createOutpatientOrder(outpatientInfoRequest, user));
    }

    @ApiOperation("查询门诊缴费状态")
    @GetMapping("/clinic/{id}")
    public Object getClinicStatus(@PathVariable("id") Integer id) throws CommonException {
        return new Result<>(outPatientService.getOutpatientStatus(id));
    }
}
