package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.async.AppointRecord;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.Appointment;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.repository.AppointmentRepository;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.dto.front.request.AppointmentInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.request.ScheduleRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.AppointmentRecord.AppointmentRecord;
import com.chinacaring.peixian.patient.client.dto.front.response.AppointmentRecord.AppointmentRecordsResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.OrderResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.Schedule;
import com.chinacaring.peixian.patient.client.dto.front.response.ScheduleResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.RegisterPayment;
import com.chinacaring.peixian.patient.client.dto.his2.AppointmentRequestHis;
import com.chinacaring.peixian.patient.client.dto.his2.RegisterRequestHis;
import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeRequest;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import com.chinacaring.peixian.patient.client.wsdl.reponse.get_regstate.GetRegStateSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_booking.InsertBookingSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_registertemp.InsertRegisterTemp;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_registertemp.InsertRegisterTempSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.schea_info.ShemaInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.schea_info.ShemaInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
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

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
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

    @Resource(name = "proxy")
    private RestTemplate restTemplateProxy;

    @Autowired
    private QuyiServiceNo service;

    @Autowired
    private AppointRecord appointRecord;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static DecimalFormat df = new DecimalFormat("#0.00");

    @Override
    public ScheduleResponse getSchedule(ScheduleRequest scheduleRequest) throws CommonException, ParseException {

        String soap = service.getQuyiServiceNoSoap().getShemaInfoNew(
                scheduleRequest.getBeginTime(),
                scheduleRequest.getEndTime(),
                scheduleRequest.getDeptCode());
        ShemaInfoSoap shemaInfoSoap;
        try {
            shemaInfoSoap = JaxbXmlUtil.convertToJavaBean(soap, ShemaInfoSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", soap, scheduleRequest.getBeginTime() + "-" + scheduleRequest
                    .getEndTime() + "-" + scheduleRequest.getDeptCode());
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, shemaInfoSoap.getResult().getReturnCode())) {
            throw new SoapException("暂时没有数据哦～", shemaInfoSoap.getResult().getReturnDesc(), scheduleRequest.getBeginTime
                    () + "-" + scheduleRequest.getEndTime() + "-" + scheduleRequest.getDeptCode());
        }

        List<ShemaInfo> shemaInfos = shemaInfoSoap.getData().getShemaInfo();
        if (shemaInfos.size() == 0) {
            throw new SoapException("暂时没有数据哦～", shemaInfoSoap.getResult().getReturnDesc(), scheduleRequest.getBeginTime
                    () + "-" + scheduleRequest.getEndTime() + "-" + scheduleRequest.getDeptCode());
        }
        List<Schedule> schedules = BeanMapperUtil.mapList(shemaInfos, Schedule.class);
        List<Schedule> normal = new ArrayList<>();
        List<Schedule> expert = new ArrayList<>();

        for (Schedule schedule : schedules) {

            schedule.setSeeDate(ValidateUtils.soapTime(schedule.getSeeDate(), "yyyy-MM-dd"));
            schedule.setBeginTime(ValidateUtils.soapTime(schedule.getBeginTime()));
            schedule.setEndTime(ValidateUtils.soapTime(schedule.getEndTime()));

//            if (Objects.equals(schedule.getSchemaType(), Constant.SHEEMA_TYPE_EXPERT)) {
                expert.add(schedule);
                schedule.setSchemaType(Constant.SHEEMA_EXPERT);
//            } else {
//                normal.add(schedule);
//                schedule.setSchemaType(Constant.SHEEMA_COMMON);
//            }
        }

        return new ScheduleResponse(normal, expert);
    }

    @Override
    public OrderResponse createAppointmentOrder(AppointmentInfoRequest appointmentInfoRequest, User user) throws
            CommonException, ParseException {
//        appointmentInfoRequest.setCost("1");

        Appointment appointment = new Appointment();

        //查看是否需要先去预约
        if (Objects.equals(Constant.TYPE_YU_YUE_HAO, appointmentInfoRequest.getType())) {

            AppointmentRequestHis appointmentRequestHis = new AppointmentRequestHis();
            appointmentRequestHis.setBookingNO(appointmentInfoRequest.getScheduleId());
            appointmentRequestHis.setBookingTime(appointmentInfoRequest.getAppointmentTime());
            appointmentRequestHis.setBookingType(Constant.APPOINTMENT_TYPE_DO);
            appointmentRequestHis.setOperCode(appointmentInfoRequest.getOperCode());
            appointmentRequestHis.setPatientNO(appointmentInfoRequest.getPatientCode());
            appointmentRequestHis.setCancelAppoint(false);
            appointmentRequestHis.setPaid(false);

            InsertBookingSoap insertBookingSoap = doAppointment(appointmentRequestHis);

            appointment.setAppointmentId(insertBookingSoap.getData().getInsertBooking().getBOOKINGNO());
        } else {

            appointment.setAppointmentId("0000");
        }

        //状态 未挂号
        appointment.setRegState(Constant.REG_STATE_WEI_GUA_HAO);
        //转换时间
        appointment.setRegisterLevelName(appointmentInfoRequest.getRegisterLevelName());

        // appointTime废除了， 使用showTime，原因不解释
        appointment.setAppointmentTime(sdf.parse(appointmentInfoRequest.getShowTime()));
        appointment.setShowTime(sdf.parse(appointmentInfoRequest.getShowTime()));

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
        appointment.setRegisterLevelCode(appointmentInfoRequest.getRegisterLevelCode());
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
//        httpHeaders.add("Proxy-Authorization", "Basic Y2FyaW5nOmNoaW5hY2FyaW5n");

        String param = gson.toJson(chargeRequest);
        HttpEntity<String> httpEntity = null;
        String payResult = null;
        try {
            httpEntity = new HttpEntity<>(param, httpHeaders);
            payResult = restTemplate.postForObject(Constant.PAY_URL, httpEntity, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //保存  返回的所有数据
        appointmentWithID.setPayData(payResult);
        Map payMap = gson.fromJson(payResult, Map.class);
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

    public InsertBookingSoap doAppointment(AppointmentRequestHis appointmentRequestHis) throws CommonException {

        String soap = service.getQuyiServiceNoSoap().insertBooking(appointmentRequestHis.mixed());

        InsertBookingSoap insertBookingSoap;
        try {
            insertBookingSoap = JaxbXmlUtil.convertToJavaBean(soap, InsertBookingSoap.class);
        } catch (Exception e) {
            throw new SoapException("预约号失败", soap, appointmentRequestHis.mixed());
        }
        if (null == insertBookingSoap) {
            throw new SoapException("预约号失败", soap, appointmentRequestHis.mixed());
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, insertBookingSoap.getResult().getReturnCode())) {
            throw new SoapException("预约号失败", insertBookingSoap.getResult().getReturnDesc(), appointmentRequestHis
                    .mixed());
        }

        return insertBookingSoap;
    }

    synchronized Appointment checkOrder(String orderNo) {
        Appointment appointment = appointmentRepository.findOneByOrderNo(orderNo);
        if (!Constant.ORDERS_NOT_PAY.equals(appointment.getPayState())) {
            return null;
        }
        //进入此方法时已经支付成功  设置状态为 已支付
        appointment.setPayState(Constant.ORDERS_PAID);
        appointmentRepository.saveAndFlush(appointment);
        return appointment;
    }


    @Override
    public  Boolean doRegister(String orderNo) throws CommonException {

        Appointment appointment = checkOrder(orderNo);
        if (null == appointment) {
            return false;
        }

        RegisterRequestHis registerRequestHis = BeanMapperUtil.map(appointment, RegisterRequestHis.class);
        registerRequestHis.setMedicare(false);
        //挂号金额  单位由 分 变为 元
//        String yuan = df.format(appointment.getCost().divide(new BigDecimal(100)));
//        registerRequestHis.setClinicFee(yuan);
//        registerRequestHis.setIsReg("0");
//        registerRequestHis.setPreRegTime(sdf.format(appointment.getAppointmentTime()));
//        registerRequestHis.setBookRegTime(sdf.format(appointment.getAppointmentTime()));
//        String idCard = appointment.getIdCard();
//        Integer sexInteger = Integer.valueOf(idCard.substring(idCard.length() - 2, idCard.length() - 1)) % 2;
//        String sex = (sexInteger == 1) ? "男" : "女";
//        registerRequestHis.setSex(sex);
//        registerRequestHis.setBookingFlag(String.valueOf(appointment.getType()));

        //去his挂号
        String soap = service.getQuyiServiceNoSoap().insertRegisterTemp(registerRequestHis.mixed());

        InsertRegisterTempSoap insertRegisterTempSoap;

        try {
            insertRegisterTempSoap = JaxbXmlUtil.convertToJavaBean(soap, InsertRegisterTempSoap.class);
        } catch (Exception e) {
            appointment.setRegState(Constant.REG_STATE_GUA_HAO_SHI_BAI);
            appointment.setHisResult(soap);
            appointmentRepository.saveAndFlush(appointment);
            throw new SoapException("挂号失败!!", soap, registerRequestHis.mixed());
        }


        //挂号成功 需要修改 信息表中的状态 为 一挂号  失败则要 通知支付服务器
        //预约状态  1 -- 未挂号
        // 2 -- 已挂号成功
        // 3--已取消
        // 4 -- 挂号失败
        if (Objects.equals(Constant.RETURN_CODE_SUCCESS, insertRegisterTempSoap.getResult().getReturnCode())) {
            //挂号成功
            appointment.setRegState(Constant.REG_STATE_GUA_HAO_CHENG_GONG);
            InsertRegisterTemp insertRegisterTemp = insertRegisterTempSoap.getData().getInsertRegisterTemp();

            appointment.setRegisterId(insertRegisterTemp.getCLINICNO());
            appointment.setHisResult(soap);
            //发票号 和 收据号 单独保存
            appointment.setInvoiceNo(insertRegisterTemp.getINVOICENO());
            appointment.setReceiptNo(insertRegisterTemp.getINVOICENO());
            appointment.setSeeNo(Integer.valueOf(insertRegisterTemp.getSEENO()));
            appointmentRepository.saveAndFlush(appointment);
            return true;
        } else {
            //挂号失败
            appointment.setRegState(Constant.REG_STATE_GUA_HAO_SHI_BAI);
            appointment.setHisResult(soap);
            appointmentRepository.saveAndFlush(appointment);
            throw new SoapException("挂号失败!", insertRegisterTempSoap.getResult().getReturnDesc(), registerRequestHis
                    .mixed());
        }
    }

    @Override
    public RegisterPayment getRegisterStatus(Integer id) throws CommonException {
        Appointment appointment = appointmentRepository.findOne(id);
        if (Objects.isNull(appointment)) {
            throw new CommonException("没有对应记录");
        }

        RegisterPayment registerPayment = new RegisterPayment();
        registerPayment.setRegisterLevelName(appointment.getRegisterLevelName());
        registerPayment.setId(appointment.getId());
        registerPayment.setPayState(appointment.getPayState());
        registerPayment.setRegState(appointment.getRegState());
        registerPayment.setRefundTime(appointment.getRefundTime());
        String doctorName = appointment.getDoctorName();
//        registerPayment.setAppointmentTime(appointment.getAppointmentTime());
        // 这里是因为沛县做的特殊处理，一般使用上面那个
        registerPayment.setAppointmentTime(appointment.getShowTime());
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

//    //查看 挂号 在 医院的状态 已看诊 已退号 未看诊
//    public RegisterStateResponseHis getRegisterStatus(RegisterStateRequestHis registerStateRequestHis) throws
// CommonException {
//
//        String soap = RequestUtil.soap(InterfaceName.getClinicState.name(), JaxbXmlUtil.convertToXml
// (registerStateRequestHis));
//        RegisterStateResponseHis registerStateResponseHis = JaxbXmlUtil.convertToJavaBean(soap,
// RegisterStateResponseHis.class);
//
//        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, registerStateResponseHis.getReturnCode())){
//            throw new CommonException("查询挂号状态失败：" + registerStateResponseHis.getReturnDesc());
//        }
//        return registerStateResponseHis;
//    }

    @Override
    public AppointmentRecordsResponse getAppointRecords(String patientCode, User user) throws CommonException, ExecutionException, InterruptedException {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        List<Appointment> appointments = appointmentRepository
                .findAllByPatientCodeAndUserIdAndPayStateAndRegisterIdNotNull(patientCode, user.getId(), Constant
                        .ORDERS_PAID, sort);

        List<AppointmentRecord> paied = new ArrayList<>();
        List<AppointmentRecord> treated = new ArrayList<>();
        List<AppointmentRecord> canceled = new ArrayList<>();

        DecimalFormat df = new DecimalFormat("#0.00");
        List<Future<String>> futures = new ArrayList<>();
        for (Appointment appointment : appointments) {
            futures.add(appointRecord.state(appointment));
        }
        while (true) {
            boolean tag = true;
            for (Future future: futures) {
                if (!future.isDone()) {
                    tag = false;
                    break;
                }
            }
            Thread.sleep(3);
            if (tag) {
                break;
            }
        }
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            AppointmentRecord appointmentRecord = new AppointmentRecord();
            appointmentRecord.setId(appointment.getId());
            appointmentRecord.setState(String.valueOf(appointment.getRegState()));
            appointmentRecord.setPatientName(appointment.getPatientName());
            String doctorName = appointment.getDoctorName();
            if (Objects.isNull(doctorName) || doctorName.isEmpty()) {
                doctorName = "普通号";
            }
            appointmentRecord.setDoctorName(doctorName);
            appointmentRecord.setPayTime(appointment.getCreateTime());
            //分 -> 元
            appointmentRecord.setCost(df.format(appointment.getCost().divide(new BigDecimal(100))));
            Integer seeNo = (null == (appointment.getSeeNo())) ? 0 : appointment.getSeeNo();
            appointmentRecord.setSeeNo(seeNo);
            appointmentRecord.setDeptName(appointment.getDeptName());
            appointmentRecord.setAppointmentTime(appointment.getShowTime());
            String registerStatus = futures.get(i).get();
//            try {
//                String soap = service.getQuyiServiceNoSoap().getRegState(appointment.getRegisterId());
//                GetRegStateSoap regSoap;
//                try {
//                    regSoap = JaxbXmlUtil.convertToJavaBean(soap, GetRegStateSoap.class);
//                    registerStatus = regSoap.getData().getGetRegState().getState();
//                } catch (Exception e) {
//                    throw new SoapException("获取挂号状态失败", soap, appointment.getRegisterId());
//                }
//
//                if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, regSoap.getResult().getReturnCode())) {
//                    throw new SoapException("获取挂号状态失败", regSoap.getResult().getReturnDesc(), appointment
//                            .getRegisterId());
//                }
//
//            } catch (CommonException e) {
//                logger.error("获取挂号状态失败" + appointment.getRegisterId());
//                continue;
//            }
            if (null == registerStatus) {
                continue;
            }
            switch (registerStatus) {
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

