package com.chinacaring.hmsrmyy.dao.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
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

    @Column(columnDefinition = "TEXT")
    private String alipayRefundUrl;
}
