package com.chinacaring.hmsrmyy.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue
    private Integer id;

    //订单号
    private String orderNo;

    //下单时间
    private Timestamp createTime;

    //订单更新时间
    private Timestamp updateTime;

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

}
