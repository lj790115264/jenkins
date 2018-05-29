package com.chinacaring.peixian.patient.client.dao.entity;

import com.chinacaring.util.TimeUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue
    private Integer id;

    //订单号
    private String orderNo;
    private String chargeId;

    //下单时间
    @JsonFormat(pattern = TimeUtil.FORMAT_LONG, timezone = "GMT+8")
    private Date createTime;
    //订单更新时间
    @JsonFormat(pattern = TimeUtil.FORMAT_LONG, timezone = "GMT+8")
    private Date updateTime;
    //订单支付时间
    @JsonFormat(pattern = TimeUtil.FORMAT_LONG, timezone = "GMT+8")
    private Date payTime;

    //用户id
    private Integer userId;

    //下单用户名
    private String username;

    //支付方式 遵循ping++规则
    //alipay 支付宝 APP 支付
    //alipay_wap 支付宝手机网页支付
    //wx 微信 APP 支付
    //wx_pub 微信公众号支付
    //wx_wap 微信 H5 支付
    //offline 线下支付
    private String payChannel;

    //实际总金额（进行各种折扣之后的金额）
    private Integer amount;

    //订单类型，预约挂号appointment，
    // 门诊缴费clinic，
    // 住院预缴费inhos_pre_charge，
    // 就诊卡充值visit_card_charge
    private String type;
    //订单类型关联的id
    private String typeNo;
    //是否已支付。1为支付，0为未支付
    private Integer isPaid;
    //退款原因
    private String refundReason;
    //是否退款，0否，1是
    private Integer isRefund;
    private Integer amountRefunded; //已退金额

    @Transient
    //his 是否退款 0 未退款 1 部分退款 2全部退款
    private Integer offlineRefundStatus;
    @Transient
    //线下退款金额
    private Double offlineRefundAmount;

    //发票号
    private String invoiceNo;



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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public Integer getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Integer isPaid) {
        this.isPaid = isPaid;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getOfflineRefundStatus() {
        return offlineRefundStatus;
    }

    public void setOfflineRefundStatus(Integer offlineRefundStatus) {
        this.offlineRefundStatus = offlineRefundStatus;
    }

    public Double getOfflineRefundAmount() {
        return offlineRefundAmount;
    }

    public void setOfflineRefundAmount(Double offlineRefundAmount) {
        this.offlineRefundAmount = offlineRefundAmount;
    }

    public Integer getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(Integer amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}
