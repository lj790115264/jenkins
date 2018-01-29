package com.chinacaring.peixian.patient.client.dto.his2;

import com.chinacaring.peixian.patient.client.config.Constant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterRequestHis {

    private String idCard;
    private String idType;
    // 预约标记 0现场挂号1预约挂号
    private Integer type;
    private String doctorCode;
    // 挂号等级名称 （普通:0 专家:1）
    private String registerLevelName;
    private String registerLevelCode;
    //午别 1 ：表示上午 2 ：表示下午
    private String noonCode;
    private String deptCode;
    //创建时间
    private Date createTime;
    //预约时间
    private Date appointmentTime;
    //患者病例号（门诊患者编号）
    private String patientCode;
    //预约唯一号
    private String appointmentId;
    //支付方式 遵循ping++规则
    //alipay 支付宝 APP 支付
    //alipay_wap 支付宝手机网页支付
    //wx 微信 APP 支付
    //wx_pub 微信公众号支付
    //wx_wap 微信 H5 支付
    //offline 线下支付
    private String payChannel;
    //排班id
    private String scheduleId;
    private boolean isMedicare;



    //﻿   第一字段：设备ID
//            默认为quyi
//    第二字段：身份证
//    第三字段：身份标示卡类别，默认01
//    第四字段：当天是否已挂号，默认0
//    第五字段：预约标记 0现场挂号1预约挂号
//    第六字段：医保自费标记 0自费1医保
//    第七字段：挂号来源，默认4
//    第八字段：医生编号，如没有编号传0000
//    第九字段：挂号等级编码
//    第十字段：午别编码
//    第十一字段：科室编码
//    第十二字段：挂号等级名称
//    第十三字段：当前挂号时间 2015-11-20 13:28:55
//    第十四字段：预约挂号时间点，2015-11-20 13:28:55
//    第十五字段：患者病历号
//    第十六字段：预约唯一号 如果不是预约传0000
//    第十七字段：看诊序号 默认传0000
//    第十八字段: 支付方式（WX/ZFB）
//    第十九字段: 排班id
    public String mixed() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String noonCode;

        if (null == getNoonCode()) {
            noonCode = "3";
        } else {
            switch (getNoonCode()) {
                case "上午": noonCode = "1"; break;
                case "下午": noonCode = "2"; break;
                default: noonCode = "3";
            }
        }

        return "quyi|" + getIdCard() + "|01|0|" + getType() + "|" + (isMedicare() ? "1" : "0") + "|4|" +
                (getDoctorCode() == null ? "0000" : getDoctorCode()) + "|" +
                getRegisterLevelCode() + "|" +
                noonCode + "|" + getDeptCode() + "|" + getRegisterLevelName() + "|" + sdf.format(getCreateTime()) + "|" +
                sdf.format(getAppointmentTime()) + "|" + getPatientCode() + "|" + getAppointmentId() + "|0000|" +
                getPayChannel() + "|" + getScheduleId();
    }

    public String getRegisterLevelCode() {
        return registerLevelCode;
    }

    public void setRegisterLevelCode(String registerLevelCode) {
        this.registerLevelCode = registerLevelCode;
    }

    public boolean isMedicare() {
        return isMedicare;
    }

    public void setMedicare(boolean medicare) {
        isMedicare = medicare;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getRegisterLevelName() {
        return registerLevelName;
    }

    public void setRegisterLevelName(String registerLevelName) {
        this.registerLevelName = registerLevelName;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }
}
