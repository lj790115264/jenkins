package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.request.ScheduleRequest;
import com.chinacaring.hmsrmyy.dto.his.request.appointment.AppointmentRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.registerState.RegisterStateRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.schedule.ScheduleRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.appointment.AppointmentResponseHis;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;
import java.util.Objects;

public interface AppointmentService {

    Object getSchedule(ScheduleRequest scheduleRequest) throws CommonException;

    Object createAppointmentOrder(AppointmentInfoRequest appointmentInfoRequest, User user) throws CommonException, ParseException;

    AppointmentResponseHis doAppointment(AppointmentRequestHis appointmentRequestHis) throws CommonException;

    Object doRegister(String orderNo) throws CommonException;

    //判断挂号是否成功 （向his回写成功？）
    Object getRegisterStatus(Integer id) throws CommonException;

    //查看 挂号 在 医院的状态 已看诊 已退号 未看诊
    Object getRegisterStatus(RegisterStateRequestHis registerStateRequestHis) throws CommonException;
}
