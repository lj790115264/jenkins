package com.chinacaring.hmsrmyy.config;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Constant {

    public static final String URL_WEBSERVICE = "http://192.168.21.77:9090/Webservice.asmx";

    public static final String ALL = "ALL";

    //his接口调用成功returnCode
    public static final String RETURN_CODE_SUCCESS = "1";

    //常用就诊人状态
    // 1：正在使用   2：已删除
    public static final Integer STATE_COMMON_USED_PATIENT_IN_USE = 1;
    public static final Integer STATE_COMMON_USED_PATIENT_DELETED = 2;

    //订单总表中的状态
    //是否已支付   1--已支付，0--未支付  2 -- 已退款成功 3--退款失败
    public static final Integer ORDERS_REFUND_FAILED = 4;
    public static final Integer ORDERS_REFUND_PENDING = 3;
    public static final Integer ORDERS_REFUNDED = 2;
    public static final Integer ORDERS_PAID = 1;
    public static final Integer ORDERS_NOT_PAY = 0;

    //预约状态  1 -- 未挂号  2 -- 已挂号成功  3--已取消 4 -- 挂号失败 5 -- 取消失败
    public static final Integer REG_STATE_WEI_GUA_HAO = 1;
    public static final Integer REG_STATE_GUA_HAO_CHENG_GONG = 2;
    public static final Integer REG_STATE_YI_QU_XIAO = 3;
    public static final Integer REG_STATE_GUA_HAO_SHI_BAI = 4;
    public static final Integer REG_STATE_QU_XIAO_SHI_BAI = 5;

    //门诊确认状态
    // 1 -- 未确认
    // 2 -- 确认成功
    // 3 -- 确认失败
    // 4 -- 部分确认成功
    public static final Integer OUTPATIENT_CONFIRM_NOT_YET = 1;
    public static final Integer OUTPATIENT_CONFIRM_SUCCESS = 2;
    public static final Integer OUTPATIENT_CONFIRM_FAIL = 3;
    public static final Integer OUTPATIENT_CONFIRM_PARTLY_SUCCESS = 4;

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

    //科室挂号标记
    public static final String REG_FLAG_SHI_GUA_HAO_KE_SHI = "1";

    public static final String NOON_CODE_HIS_MORNING = "1";

    //预约类型
    //预约传0，取消传1
    public static final String APPOINTMENT_TYPE_DO = "0";
    public static final String APPOINTMENT_TYPE_CANCEL = "1";

    //ping++ 支付相关
    public static final String CHARGE_SUBJECT_APPOINTMENT = "海门市人民医院预约挂号";
    public static final String CHARGE_SUBJECT_OUTPATIENT = "海门市人民医院门诊缴费";

    //支付basic认证
    public static final String PAY_BASE64_STRING = "Basic cGF5OnBheWNhcmluZzIwMTc=";
    public static final String PAY_URL =  "http://121.196.219.153:8780/charge";
    public static final String REFUND_URL = "http://121.196.219.153:8780/refund";

    //企业号推送相关
    public static final String BASIC_HEADER_WECHAT_PUSH = "Basic d2VjaGF0cHVzaDp3ZWNoYXRwdXNoc2VjcmV0";
    public static final String WECHAT_CP_NEWS_PUSH_URL = "http://121.196.219.153:8090/cp/news";
    public static final Integer AGENT_ID_TUI_KUAN_TONG_ZHI = 1000003;
    public static final Integer HOSPITAL_ID_CHU_ZHOU_YI_YUAN = 1200;

    //退款来源
    //微信未结算 unsettled_funds
    public static final String REFUND_FUNDING_SOURCE_WX_UNSETTLED_FUNDS = "unsettled_funds";



}
