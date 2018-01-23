package com.chinacaring.peixian.patient.client.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Integer id;

    //ping++订单号
    private String orderNo;

    //门诊患者编号
    private String patientCode;

    //患者姓名
    private String patientName;

    //预约唯一号
    private String appointmentId;


    private String deptCode;

    private String deptName;

    private String doctorCode;

    private String doctorName;

    //用户表中的用户id
    private Integer userId;

    //预约状态
    // 1 -- 未挂号
    // 2 -- 已挂号成功
    // 3 -- 已取消
    // 4 -- 挂号失败
    // 5 -- 已预约
    private Integer regState;

    //预约时间
    private Date appointmentTime;

    //午别 1 ：表示上午 2 ：表示下午
    private String noonCode;

    //支付方式 遵循ping++规则
    //alipay 支付宝 APP 支付
    //alipay_wap 支付宝手机网页支付
    //wx 微信 APP 支付
    //wx_pub 微信公众号支付
    //wx_wap 微信 H5 支付
    //offline 线下支付
    private String payChannel;

    //类型，0：表示现场当天挂号，1：表示预约挂号
    //对应  bookingFlag
    private Integer type;

    //挂号金额
    private BigDecimal cost;

    //创建时间
    private Date createTime;

    //身份证号码
    private String idCard;

    //身份标识卡类别
    private String idType;

    //医保自费标记
    //0：表示自费
    //1：表示医保
    private String medicareType;

    //挂号唯一号
    private String registerId;

    //排班id
    private String scheduleId;

    @Column(columnDefinition = "TEXT")
    private String hisResult;

    @Column(columnDefinition = "TEXT")
    private String payData;

    private String openid;

    //发票号
    private String invoiceNo;

    //收据号
    private String receiptNo;

    private Integer seeNo;

    // 0 -- 未支付
    // 1 -- 已支付，
    // 2 -- 已退款成功
    // 3 -- 退款失败
    private Integer payState;

    //operCode
    private String operCode;

    @Column(columnDefinition = "TEXT")
    private String refundRes;

    private String refundNo;

    private Date refundTime;

    @Column(columnDefinition = "TEXT")
    private String alipayRefundUrl;

    private String registerLevelName;

    private String registerLevelCode;

    public String getRegisterLevelCode() {
        return registerLevelCode;
    }

    public void setRegisterLevelCode(String registerLevelCode) {
        this.registerLevelCode = registerLevelCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

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

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRegState() {
        return regState;
    }

    public void setRegState(Integer regState) {
        this.regState = regState;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getHisResult() {
        return hisResult;
    }

    public void setHisResult(String hisResult) {
        this.hisResult = hisResult;
    }

    public String getPayData() {
        return payData;
    }

    public void setPayData(String payData) {
        this.payData = payData;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Integer getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(Integer seeNo) {
        this.seeNo = seeNo;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getRefundRes() {
        return refundRes;
    }

    public void setRefundRes(String refundRes) {
        this.refundRes = refundRes;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getAlipayRefundUrl() {
        return alipayRefundUrl;
    }

    public void setAlipayRefundUrl(String alipayRefundUrl) {
        this.alipayRefundUrl = alipayRefundUrl;
    }

    public String getRegisterLevelName() {
        return registerLevelName;
    }

    public void setRegisterLevelName(String registerLevelName) {
        this.registerLevelName = registerLevelName;
    }
}
