package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dao.entity.Appointment;
import com.chinacaring.hmsrmyy.dao.entity.Orders;
import com.chinacaring.hmsrmyy.dao.repository.AppointmentRepository;
import com.chinacaring.hmsrmyy.dao.repository.OrdersRepository;
import com.chinacaring.hmsrmyy.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.request.ScheduleRequest;
import com.chinacaring.hmsrmyy.dto.front.response.AppointmentRecord.AppointmentRecord;
import com.chinacaring.hmsrmyy.dto.front.response.AppointmentRecord.AppointmentRecordsResponse;
import com.chinacaring.hmsrmyy.dto.his.request.register.RegisterRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.registerState.RegisterStateRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.register.RegisterResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.registerState.RegisterStateResponseHis;
import com.chinacaring.hmsrmyy.dto.pingpp.ChargeRequest;
import com.chinacaring.hmsrmyy.dto.pingpp.PayMsg;
import com.chinacaring.hmsrmyy.dto.front.response.OrderResponse;
import com.chinacaring.hmsrmyy.dto.front.response.Schedule;
import com.chinacaring.hmsrmyy.dto.front.response.ScheduleResponse;
import com.chinacaring.hmsrmyy.dto.front.response.payments.RegisterPayment;
import com.chinacaring.hmsrmyy.dto.his.request.appointment.AppointmentRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.schedule.ScheduleRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.appointment.AppointmentResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.schedule.ScheduleResponseHis;
import com.chinacaring.hmsrmyy.service.AppointmentService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import com.chinacaring.util.TextUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private Gson gson;

    @Autowired
    private RestTemplate restTemplate;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");

    private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

    private static DecimalFormat df = new DecimalFormat("#0.00");

    @Override
    public ScheduleResponse getSchedule(ScheduleRequest scheduleRequest) throws CommonException, ParseException {

        ScheduleRequestHis scheduleRequestHis = BeanMapperUtil.map(scheduleRequest, ScheduleRequestHis.class);
        String soap = RequestUtil.soap(InterfaceName.GetSchemaInfo.name(), JaxbXmlUtil.convertToXml(scheduleRequestHis));
        ScheduleResponseHis scheduleResponseHis = JaxbXmlUtil.convertToJavaBean(soap, ScheduleResponseHis.class);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, scheduleResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }

        List<Schedule> schedules = BeanMapperUtil.mapList(scheduleResponseHis.getItems().getItem(), Schedule.class);
        List<Schedule> normal = new ArrayList<>();
        List<Schedule> expert = new ArrayList<>();

        for (Schedule schedule : schedules){

            String seeDate = schedule.getSeeDate();
            seeDate = sdf2.format(sdf1.parse(seeDate));
            schedule.setSeeDate(seeDate);

            if (Objects.equals(schedule.getRegLevelName(), "专家")){
                expert.add(schedule);
            }else {
                normal.add(schedule);
            }
        }

        return new ScheduleResponse(normal, expert);
    }

    @Override
    public OrderResponse createAppointmentOrder(AppointmentInfoRequest appointmentInfoRequest, User user) throws CommonException, ParseException {
        Appointment appointment = new Appointment();

        //查看是否需要先去预约
        if (Objects.equals(Constant.TYPE_YU_YUE_HAO, appointmentInfoRequest.getType()) ){

            AppointmentRequestHis appointmentRequestHis = new AppointmentRequestHis();
            appointmentRequestHis.setBookingNO(appointmentInfoRequest.getScheduleId());
            appointmentRequestHis.setBookingTime(appointmentInfoRequest.getAppointmentTime());
            appointmentRequestHis.setBookingType(Constant.APPOINTMENT_TYPE_DO);
            appointmentRequestHis.setOperCode(appointmentInfoRequest.getOperCode());
            appointmentRequestHis.setPatientNO(appointmentInfoRequest.getPatientCode());

            AppointmentResponseHis appointmentResponseHis = doAppointment(appointmentRequestHis);

            appointment.setAppointmentId(appointmentResponseHis.getBookingID());
        }else {
            appointment.setAppointmentId("0000");
        }

        //状态 未挂号
        appointment.setRegState(Constant.REG_STATE_WEI_GUA_HAO);
        //转换时间
        appointment.setRegisterLevelName(appointmentInfoRequest.getRegisterLevelName());
        appointment.setAppointmentTime(sdf.parse(appointmentInfoRequest.getAppointmentTime()));
        appointment.setOpenid(appointmentInfoRequest.getOpenId());
        appointment.setCost(BigDecimal.valueOf(TextUtil.getDouble(appointmentInfoRequest.getCost())));
        appointment.setCreateTime(new Date());
        appointment.setDeptCode(appointmentInfoRequest.getDeptCode());
        appointment.setDeptName(appointmentInfoRequest.getDeptName());
        appointment.setDoctorCode(appointmentInfoRequest.getDoctorCode());
        appointment.setDoctorName(appointmentInfoRequest.getDoctorName());
        appointment.setNoonCode(appointmentInfoRequest.getNoonCode());
        appointment.setPatientCode(appointmentInfoRequest.getPatientCode());
        appointment.setPatientName(appointmentInfoRequest.getPatientName());
        appointment.setPayChannel(appointmentInfoRequest.getPayChannel());
        appointment.setType(appointmentInfoRequest.getType());
        appointment.setUserId(user.getId());
        appointment.setIdCard(appointmentInfoRequest.getIdCard());
        appointment.setIdType(appointmentInfoRequest.getIdType());
        appointment.setMedicareType(appointmentInfoRequest.getMedicareType());
        appointment.setOperCode(appointmentInfoRequest.getOperCode());
        //未支付标识
        appointment.setPayState(Constant.ORDERS_NOT_PAY);
        appointment.setScheduleId(appointmentInfoRequest.getScheduleId());
        Appointment appointmentWithID = appointmentRepository.save(appointment);

        ChargeRequest chargeRequest = new ChargeRequest();
        chargeRequest.setAmount(TextUtil.getInt(appointmentInfoRequest.getCost()));
        chargeRequest.setChannel(appointmentInfoRequest.getPayChannel());
        //订单信息 做处理
        chargeRequest.setSubject(Constant.CHARGE_SUBJECT_APPOINTMENT);
        chargeRequest.setBody(Constant.CHARGE_SUBJECT_APPOINTMENT);
        chargeRequest.setOpen_id(appointmentInfoRequest.getOpenId());
        //获取支付信息
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        httpHeaders.setContentType(type);
        httpHeaders.add("Authorization", Constant.PAY_BASE64_STRING);

        String param = gson.toJson(chargeRequest);
        HttpEntity<String> httpEntity = new HttpEntity<>(param,httpHeaders);

        String payResult = restTemplate.postForObject(Constant.PAY_URL, httpEntity, String.class);

        //保存  返回的所有数据
        appointmentWithID.setPayData(payResult);
        Map payMap= gson.fromJson(payResult, Map.class);
        //更新  order no
        appointmentWithID.setOrderNo(payMap.get("order_no") + "");
        appointmentRepository.save(appointmentWithID);

        //将订单信息保存到 订单主表
        Orders orders = new Orders();
        orders.setOrderNo(appointmentWithID.getOrderNo());
        orders.setCreateTime(new Date());
        orders.setUpdateTime(new Date());
        orders.setUserId(user.getId());
        orders.setUsername(user.getUsername());
        orders.setPayChannel(appointmentWithID.getPayChannel());
        orders.setAmount(Integer.valueOf(appointmentInfoRequest.getCost()));
        orders.setType(Constant.ORDERS_APPOINTMENT);
        orders.setTypeNo(String.valueOf(appointmentWithID.getId()));
        ordersRepository.save(orders);

        return new OrderResponse(appointmentWithID.getId(), payResult);
    }

    @Override
    public AppointmentResponseHis doAppointment(AppointmentRequestHis appointmentRequestHis) throws CommonException {

        String soap = RequestUtil.soap(InterfaceName.insertBooking.name(), JaxbXmlUtil.convertToXml(appointmentRequestHis));
        AppointmentResponseHis appointmentResponseHis = JaxbXmlUtil.convertToJavaBean(soap, AppointmentResponseHis.class);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, appointmentResponseHis.getReturnCode())){
            throw new CommonException("预约号失败 " + appointmentResponseHis.getReturnDesc());
        }

        return appointmentResponseHis;
    }

    @Override
    public Object doRegister(String orderNo) throws CommonException {
        Appointment appointment = appointmentRepository.findOneByOrderNo(orderNo);
        //进入此方法时已经支付成功  设置状态为 已支付
        appointment.setPayState(Constant.ORDERS_PAID);
        RegisterRequestHis registerRequestHis = BeanMapperUtil.map(appointment, RegisterRequestHis.class);
        //挂号金额  单位由 分 变为 元
        String yuan = df.format(appointment.getCost().divide(new BigDecimal(100)));
        registerRequestHis.setClinicFee(yuan);
        registerRequestHis.setIsReg("0");
        registerRequestHis.setPreRegTime(sdf.format(appointment.getAppointmentTime()));
        registerRequestHis.setBookRegTime(sdf.format(appointment.getAppointmentTime()));
        String idCard = appointment.getIdCard();
        Integer sexInteger = Integer.valueOf(idCard.substring(idCard.length() - 2, idCard.length() - 1)) % 2;
        String sex = (sexInteger == 1) ? "男" : "女";
        registerRequestHis.setSex(sex);
        registerRequestHis.setBookingFlag(String.valueOf(appointment.getType()));

        //去his挂号
        String xmlString = RequestUtil.soap(InterfaceName.insertRegisterInfo.name(), JaxbXmlUtil.convertToXml(registerRequestHis));
        RegisterResponseHis registerResponseHis = JaxbXmlUtil.convertToJavaBean(xmlString, RegisterResponseHis.class);

        //挂号成功 需要修改 信息表中的状态 为 一挂号  失败则要 通知支付服务器
        //预约状态  1 -- 未挂号
        // 2 -- 已挂号成功
        // 3--已取消
        // 4 -- 挂号失败
        if (Objects.equals(Constant.RETURN_CODE_SUCCESS, registerResponseHis.getReturnCode())){
            //挂号成功
            appointment.setRegState(Constant.REG_STATE_GUA_HAO_CHENG_GONG);
            appointment.setRegisterId(registerResponseHis.getRegNO());
            appointment.setHisResult(xmlString);
            //发票号 和 收据号 单独保存
            appointment.setInvoiceNo(registerResponseHis.getInvoiceNo());
            appointment.setReceiptNo(registerResponseHis.getReceiptNo());
            appointment.setSeeNo(Integer.valueOf(registerResponseHis.getSeeNO()));
            appointmentRepository.saveAndFlush(appointment);
            return true;
        }else {
            //挂号失败
            appointment.setRegState(Constant.REG_STATE_GUA_HAO_SHI_BAI);
            appointment.setHisResult(xmlString);
            appointmentRepository.saveAndFlush(appointment);
            throw new CommonException(registerResponseHis.getReturnDesc());
        }
    }

    @Override
    public RegisterPayment getRegisterStatus(Integer id) throws CommonException {
        Appointment appointment = appointmentRepository.findOne(id);
        if (Objects.isNull(appointment)){
            throw new CommonException("没有对应记录");
        }

        RegisterPayment registerPayment = new RegisterPayment();
        registerPayment.setRegisterLevelName(appointment.getRegisterLevelName());
        registerPayment.setId(appointment.getId());
        registerPayment.setPayState(appointment.getPayState());
        registerPayment.setRegState(appointment.getRegState());
        registerPayment.setRefundTime(appointment.getRefundTime());
        String doctorName = appointment.getDoctorName();
        registerPayment.setAppointmentTime(appointment.getAppointmentTime());
        registerPayment.setDeptName(appointment.getDeptName());
        registerPayment.setSeeNo(appointment.getSeeNo());
        registerPayment.setDoctorName(doctorName);
        registerPayment.setPayTime(appointment.getCreateTime());
        //分 --> 元
        registerPayment.setCost(df.format(appointment.getCost().divide(new BigDecimal(100))));
        registerPayment.setReceiptNo(appointment.getInvoiceNo());
        registerPayment.setPayChannel(appointment.getPayChannel());
        registerPayment.setPatientName(appointment.getPatientName());
        return registerPayment;
    }

    @Override
    public RegisterStateResponseHis getRegisterStatus(RegisterStateRequestHis registerStateRequestHis) throws CommonException {

        String soap = RequestUtil.soap(InterfaceName.getClinicState.name(), JaxbXmlUtil.convertToXml(registerStateRequestHis));
        RegisterStateResponseHis registerStateResponseHis = JaxbXmlUtil.convertToJavaBean(soap, RegisterStateResponseHis.class);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, registerStateResponseHis.getReturnCode())){
            throw new CommonException("查询挂号状态失败：" + registerStateResponseHis.getReturnDesc());
        }
        return registerStateResponseHis;
    }

    @Override
    public AppointmentRecordsResponse getAppointRecords(String patientCode, User user) throws CommonException {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        List<Appointment> appointments = appointmentRepository.findAllByPatientCodeAndUserIdAndPayStateAndRegisterIdNotNull(patientCode, user.getId(), Constant.ORDERS_PAID, sort);

        List<AppointmentRecord> paied = new ArrayList<>();
        List<AppointmentRecord> treated = new ArrayList<>();
        List<AppointmentRecord> canceled = new ArrayList<>();

        DecimalFormat df = new DecimalFormat("#0.00");
        for (Appointment appointment : appointments){

            AppointmentRecord appointmentRecord = new AppointmentRecord();
            appointmentRecord.setId(appointment.getId());
            appointmentRecord.setState(String.valueOf(appointment.getRegState()));
            appointmentRecord.setPatientName(appointment.getPatientName());
            String doctorName = appointment.getDoctorName();
            if (Objects.isNull(doctorName) || doctorName.isEmpty()){
                doctorName = "普通号";
            }
            appointmentRecord.setDoctorName(doctorName);
            appointmentRecord.setPayTime(appointment.getCreateTime());
            //分 -> 元
            appointmentRecord.setCost(df.format(appointment.getCost().divide(new BigDecimal(100))));
            Integer seeNo = (null == (appointment.getSeeNo())) ? 0 : appointment.getSeeNo();
            appointmentRecord.setSeeNo(seeNo);
            appointmentRecord.setDeptName(appointment.getDeptName());
            appointmentRecord.setAppointmentTime(appointment.getAppointmentTime());
            String registerStatus = Constant.REGISTER_STATUS_HIS_TUI_HAO;
            try {
                RegisterStateRequestHis registerStateRequestHis = new RegisterStateRequestHis();
                registerStateRequestHis.setRegNO(appointment.getRegisterId());
                RegisterStateResponseHis registerStateResponseHis = getRegisterStatus(registerStateRequestHis);
                registerStatus = registerStateResponseHis.getState();
            } catch (CommonException e) {
                logger.info("获取挂号状态失败" + appointment.getRegisterId());
                continue;
            }
            switch (registerStatus){
                case Constant.REGISTER_STATUS_HIS_TUI_HAO:
                    canceled.add(appointmentRecord);
                    break;
                case Constant.REGISTER_STATUS_HIS_WEI_KAN_ZHEN:
                    paied.add(appointmentRecord);
                    break;
                case Constant.REGISTER_STATUS_HIS_YI_KAN_ZHEN:
                    treated.add(appointmentRecord);
                    break;
            }

        }

        return new AppointmentRecordsResponse(paied, treated, canceled);
    }

}

