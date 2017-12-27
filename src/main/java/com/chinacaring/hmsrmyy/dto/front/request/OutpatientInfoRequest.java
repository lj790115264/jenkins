package com.chinacaring.hmsrmyy.dto.front.request;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OutpatientInfoRequest {

    private String registerId;

    //操作员代码  operCode
    //operCode 为 chinacaring_app，表示来自app操作；
    //operCode 为 chinacaring_gzh，表示来自微信公众号操作；
    //operCode 为 chinacaring_shh，表示来自支付宝生活号操作；
    private String operCode;

    private String payChannel;

    private String openId;

    private String idCard;

    private List<Prescription> prescriptions;

    //总金额
    private String totalCost;

}