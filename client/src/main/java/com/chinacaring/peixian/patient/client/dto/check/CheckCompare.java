package com.chinacaring.peixian.patient.client.dto.check;

import com.chinacaring.peixian.patient.client.enumeration.PayWay;
import com.chinacaring.peixian.patient.client.enumeration.TradeType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CheckCompare {

    // 瞰聆交易号
    private String chargeId;
    // 姓名
    private String name;
    // 交易时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tradeTime;
    // 交易类型
    private TradeType tradeType;
    // 交易金额
    private Integer tradeMoney;
    // 支付方式
    private PayWay payWay;
    // 订单号
    private String orderNo;
    // 收据号
    private String invoiceNo;
    // -----以下为his提供
    // 收据号
    private String hisInvoiceNo;
    // 姓名
    private String hisName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    // 交易时间
    private Date hisTradeTime;
    // 交易类型
    private TradeType hisTradeType;
    // 支付金额
    private Integer hisTradeMoney;

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

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TradeType getTradeType() {
        return tradeType;
    }

    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(Integer tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public PayWay getPayWay() {
        return payWay;
    }

    public void setPayWay(PayWay payWay) {
        this.payWay = payWay;
    }

    public String getHisInvoiceNo() {
        return hisInvoiceNo;
    }

    public void setHisInvoiceNo(String hisInvoiceNo) {
        this.hisInvoiceNo = hisInvoiceNo;
    }

    public String getHisName() {
        return hisName;
    }

    public void setHisName(String hisName) {
        this.hisName = hisName;
    }

    public Date getHisTradeTime() {
        return hisTradeTime;
    }

    public void setHisTradeTime(Date hisTradeTime) {
        this.hisTradeTime = hisTradeTime;
    }

    public TradeType getHisTradeType() {
        return hisTradeType;
    }

    public void setHisTradeType(TradeType hisTradeType) {
        this.hisTradeType = hisTradeType;
    }

    public Integer getHisTradeMoney() {
        return hisTradeMoney;
    }

    public void setHisTradeMoney(Integer hisTradeMoney) {
        this.hisTradeMoney = hisTradeMoney;
    }
}
