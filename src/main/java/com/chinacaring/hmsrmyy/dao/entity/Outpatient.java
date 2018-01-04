package com.chinacaring.hmsrmyy.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
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
}
