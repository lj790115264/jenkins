package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.request.ScheduleRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.AppointmentRecord.AppointmentRecordsResponse;
import com.chinacaring.peixian.patient.client.dto.his.request.appointment.AppointmentRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.registerState.RegisterStateRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.response.appointment.AppointmentResponseHis;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_booking.InsertBookingSoap;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;
import java.util.concurrent.ExecutionException;

public interface AppointmentService {

    Object getSchedule(ScheduleRequest scheduleRequest) throws CommonException, ParseException, MyException;

    Object createAppointmentOrder(AppointmentInfoRequest appointmentInfoRequest, User user) throws CommonException, ParseException, SoapException;

    Boolean doRegister(String orderNo) throws CommonException, SoapException;

    //判断挂号是否成功 （向his回写成功？）
    Object getRegisterStatus(Integer id) throws CommonException;

    AppointmentRecordsResponse getAppointRecords(String patientCode, User user) throws CommonException, ExecutionException, InterruptedException, SoapException;

}
