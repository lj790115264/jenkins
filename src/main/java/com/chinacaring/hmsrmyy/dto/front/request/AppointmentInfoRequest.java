package com.chinacaring.hmsrmyy.dto.front.request;

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
    
}
