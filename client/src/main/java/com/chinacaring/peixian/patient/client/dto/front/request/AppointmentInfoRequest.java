package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class AppointmentInfoRequest {

    //门诊患者编号
    private String patientCode;

    //患者姓名
    private String patientName;


    private String deptCode;

    private String deptName;

    private String doctorCode;

    private String doctorName;

    //预约时间
    private String appointmentTime;

    // 上面那个废除了，下面的才是预约时间
    private String showTime;

    //午别 1 ：表示上午 2 ：表示下午
    private String noonCode;

    //支付方式 遵循ping++规则
    //alipay 支付宝 APP 支付
    //alipay_wap 支付宝手机网页支付
    //wx 微信 APP 支付
    //wx_pub 微信公众号支付
    //wx_wap 微信 H5 支付
    private String payChannel;

    //类型，0：当天挂号，1：预约挂号
    private Integer type;

    //挂号金额
    private String cost;

    //身份证号码
    private String idCard;

    //身份标识卡类别
    //默认01，表示身份证
    private String idType;

    //医保自费标记
    //0：表示自费
    //1：表示医保

    private String medicareType;

    //排班id
    private String scheduleId;

    //微信支付 的  openid
    private String openId;

    //操作员代码  operCode
    //operCode 为 chinacaring_app，表示来自app操作；
    //operCode 为 chinacaring_gzh，表示来自微信公众号操作；
    //operCode 为 chinacaring_shh，表示来自支付宝生活号操作；

    private String operCode;

    private String registerLevelName;

    // 0代表 普通 1代码专家
    private String registerLevelCode;


    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getMedicareType() {
        return medicareType;
    }

    public void setMedicareType(String medicareType) {
        this.medicareType = medicareType;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getRegisterLevelName() {
        return registerLevelName;
    }

    public void setRegisterLevelName(String registerLevelName) {
        this.registerLevelName = registerLevelName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getRegisterLevelCode() {
        return registerLevelCode;
    }

    public void setRegisterLevelCode(String registerLevelCode) {
        this.registerLevelCode = registerLevelCode;
    }
}
