package com.chinacaring.peixian.patient.client.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.request.ScheduleRequest;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.concurrent.ExecutionException;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @ApiOperation("查询对应科室的排班信息")
    @GetMapping("/schedule/dept/{dept_code}")
    public Object getSchedule(@RequestParam("begin_time") String beginTime,
                              @RequestParam("end_time") String endTime,
                              @PathVariable("dept_code") String deptCode) throws CommonException, ParseException {

        beginTime = ValidateUtils.time(beginTime) + "000000";
        endTime = ValidateUtils.time(endTime) + "000000";

        return new Result<>(appointmentService.getSchedule(new ScheduleRequest(beginTime, endTime, deptCode)));
    }

    @ApiOperation("创建挂号订单")
    @PostMapping("/register")
    public Object createAppointmentOrder(@RequestBody AppointmentInfoRequest appointmentInfoRequest, @CurrentUser User user) throws CommonException, ParseException {
        return new Result<>(appointmentService.createAppointmentOrder(appointmentInfoRequest, user));
    }

    @ApiOperation("查询挂号状态")
    @GetMapping("/register_status/{id}")
    public Object getRegisterStatus(@PathVariable("id") Integer id) throws CommonException {
        return new Result<>(appointmentService.getRegisterStatus(id));
    }

    @ApiOperation("挂号记录")
    @GetMapping("/register/{patient_code}")
    public Object getAppointmentRecords(@PathVariable("patient_code") String patientCode ,@CurrentUser User user) throws CommonException, ExecutionException, InterruptedException {
        return new Result<>(appointmentService.getAppointRecords(patientCode, user));
    }

}
