package com.chinacaring.hmsrmyy.dto.front.request;

import lombok.Data;

@Data
public class InbalanceInfoRequest {

    private String patientName;

    private String idCard;

    private String payChannel;

    //缴费金额
    private String cost;

    //押金余额
    private String inbalance;

    // yyyy-MM-dd HH:mm:ss
    private String inhostime;

    private String inpatientCode;

    private String openId;

    private String operCode;

    private String deptName;
}
