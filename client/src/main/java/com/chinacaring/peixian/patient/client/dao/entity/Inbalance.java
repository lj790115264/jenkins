package com.chinacaring.peixian.patient.client.dao.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Inbalance {

    @Id
    @GeneratedValue
    private Integer id;

    private String patientName;

    private String idCard;

    private String payChannel;

    //充值金额
    private BigDecimal cost;

    private String inpatientCode;

    //1：未充值 2：充值成功 3：充值失败
    private Integer confirmState;

    @Column(columnDefinition = "TEXT")
    private String payData;

    //ping++订单号
    private String orderNo;

    //发票号
    private String invoiceNo;

    //收据号
    private String receiptNo;

    //1--已支付，0--未支付  2 -- 已退款成功 3--退款正在处理   4 -- 退款失败
    private Integer payState;

    //用户表中的用户id
    private Integer userId;

    private Date inhosTime;

    private String deptName;

    //押金余额
    private BigDecimal inbalance;

    private Date createTime;

    private String operCode;

    @Column(columnDefinition = "TEXT")
    private String refundRes;

    private String refundNo;

    private Date refundTime;

    @Column(columnDefinition = "TEXT")
    private String alipayRefundUrl;

    @Column(columnDefinition = "TEXT")
    private String hisResult;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getInpatientCode() {
        return inpatientCode;
    }

    public void setInpatientCode(String inpatientCode) {
        this.inpatientCode = inpatientCode;
    }

    public Integer getConfirmState() {
        return confirmState;
    }

    public void setConfirmState(Integer confirmState) {
        this.confirmState = confirmState;
    }

    public String getPayData() {
        return payData;
    }

    public void setPayData(String payData) {
        this.payData = payData;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getInhosTime() {
        return inhosTime;
    }

    public void setInhosTime(Date inhosTime) {
        this.inhosTime = inhosTime;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BigDecimal getInbalance() {
        return inbalance;
    }

    public void setInbalance(BigDecimal inbalance) {
        this.inbalance = inbalance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getHisResult() {
        return hisResult;
    }

    public void setHisResult(String hisResult) {
        this.hisResult = hisResult;
    }
}
