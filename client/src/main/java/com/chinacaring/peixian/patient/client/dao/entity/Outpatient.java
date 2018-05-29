package com.chinacaring.peixian.patient.client.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zyc77
 */

@Entity
@Data
public class Outpatient {

    @Id
    @GeneratedValue
    private Integer id;

    private String registerId;

    private String prescriptionNo;

    private String operCode;

    private String payChannel;

    private BigDecimal cost;

    private String orderNo;

    @Column(columnDefinition = "TEXT")
    private String payData;

    private String openId;

    private String idCard;

    private Integer userId;

    //发票号
    private String invoiceNo;

    //收据号
    private String receiptNo;


    // 1 -- 未确认
    // 2 -- 确认成功
    // 3 -- 确认失败
    // 4 -- 部分确认成功
    private Integer confirmState;

    // 1--已支付，0--未支付
    private Integer payState;

    private Date createTime;

    @Column(columnDefinition = "TEXT")
    private String refundRes;

    private String refundNo;

    private Date refundTime;

    @Column(columnDefinition = "TEXT")
    private String alipayRefundUrl;

    private BigDecimal refundCost;

    private String failConfirmedPrescription;

    private String deptName;

    private String doctorName;

    //号别
    private String regLevelName;

    //就诊时间
    private String regDate;

    private String patientName;

    // 窗口名字
    private String windowName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayData() {
        return payData;
    }

    public void setPayData(String payData) {
        this.payData = payData;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getConfirmState() {
        return confirmState;
    }

    public void setConfirmState(Integer confirmState) {
        this.confirmState = confirmState;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public BigDecimal getRefundCost() {
        return refundCost;
    }

    public void setRefundCost(BigDecimal refundCost) {
        this.refundCost = refundCost;
    }

    public String getFailConfirmedPrescription() {
        return failConfirmedPrescription;
    }

    public void setFailConfirmedPrescription(String failConfirmedPrescription) {
        this.failConfirmedPrescription = failConfirmedPrescription;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRegLevelName() {
        return regLevelName;
    }

    public void setRegLevelName(String regLevelName) {
        this.regLevelName = regLevelName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }
}
