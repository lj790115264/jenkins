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

    //支付方式 weChat：微信，aliPay：支付宝，icbcCard：工商银行网银
    private String payChannel;

    //类型，0：当天挂号，1：预约挂号
    private Integer type;

    //挂号金额
    private String cost;

    //身份证号码
    private String idCard;

    //身份标识卡类别
    private String idType;

    //医保自费标记
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
    
}
