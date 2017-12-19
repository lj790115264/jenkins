package com.chinacaring.hmsrmyy.config;

public class Constant {

    public static final String URL_WEBSERVICE = "http://172.17.10.233:18088/AppServiceCommon.asmx";

    public static final String ALL = "ALL";

    //常用就诊人状态
    // 1：正在使用   2：已删除
    public static final Integer STATE_COMMON_USED_PATIENT_IN_USE = 1;
    public static final Integer STATE_COMMON_USED_PATIENT_DELETED = 2;

    //订单总表中的状态
    //是否已支付   1--已支付，0--未支付  2 -- 已退款成功 3--退款失败
    public static final Integer ORDERS_REFUND_FAILED = 3;
    public static final Integer ORDERS_REFUNDED = 2;
    public static final Integer ORDERS_PAID = 1;
    public static final Integer ORDERS_NOT_PAY = 0;

    //预约状态  1 -- 未挂号  2 -- 已挂号成功  3--已取消 4 -- 挂号失败 5 -- 取消失败
    public static final Integer REG_STATE_WEI_GUA_HAO = 1;
    public static final Integer REG_STATE_GUA_HAO_CHENG_GONG = 2;
    public static final Integer REG_STATE_YI_QU_XIAO = 3;
    public static final Integer REG_STATE_GUA_HAO_SHI_BAI = 4;
    public static final Integer REG_STATE_QU_XIAO_SHI_BAI = 5;

    //操作员工号
    public static final String OPER_CODE = "CARING";

    //类型，0：表示现场当天挂号，1：表示预约挂号
    public static final Integer TYPE_DANG_TIAN_HAO = 0;
    public static final Integer TYPE_YU_YUE_HAO = 1;

    //订单类型，预约挂号appointment，
    // 门诊缴费clinic，
    // 住院预缴费inhos_pre_charge，
    // 就诊卡充值visit_card_charge
    public static final String ORDERS_APPOINTMENT = "appointment";
    public static final String ORDERS_CLINIC = "clinic";
    public static final String ORDERS_INHOS_PRE_CHARGE = "inhos_pre_charge";
    public static final String ORDERS_VISIT_CARD_CHARGE = "visit_card_charge";

}
