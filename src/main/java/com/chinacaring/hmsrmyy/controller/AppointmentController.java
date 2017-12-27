package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.request.ScheduleRequest;
import com.chinacaring.hmsrmyy.service.AppointmentService;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/schedule")
    public Object getSchedule(@RequestParam("begin_time") String beginTime,
                              @RequestParam("end_time") String endTime,
                              @RequestParam("dept_code") String deptCode) throws CommonException {
        return new Result<>(appointmentService.getSchedule(new ScheduleRequest(beginTime, endTime, deptCode)));
    }

    @PostMapping("/appointment/order")
    public Object createAppointmentOrder(@RequestBody AppointmentInfoRequest appointmentInfoRequest, @CurrentUser User user) throws CommonException, ParseException {
        return new Result<>(appointmentService.createAppointmentOrder(appointmentInfoRequest, user));
    }

    @GetMapping("/registerstatus/{id}")
    public Object getRegisterStatus(@PathVariable("id") Integer id) throws CommonException {
        return new Result<>(appointmentService.getRegisterStatus(id));
    }

}
