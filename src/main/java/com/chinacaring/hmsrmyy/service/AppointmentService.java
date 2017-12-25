package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.hmsrmyy.dto.his.request.appointment.AppointmentRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.schedule.ScheduleRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.appointment.AppointmentResponseHis;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;

public interface AppointmentService {

    Object getSchedule(ScheduleRequestHis scheduleRequestHis) throws CommonException;

    Object createAppointmentOrder(AppointmentInfoRequest appointmentInfoRequest, User user) throws CommonException, ParseException;

    AppointmentResponseHis doAppointment(AppointmentRequestHis appointmentRequestHis) throws CommonException;

    Object doRegister(String orderNo) throws CommonException;

    //判断挂号是否成功 （向his回写成功？）
    Object getRegisterStatus(Integer id) throws CommonException;
}
