package com.chinacaring.hmsrmyy.dao.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
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

}
