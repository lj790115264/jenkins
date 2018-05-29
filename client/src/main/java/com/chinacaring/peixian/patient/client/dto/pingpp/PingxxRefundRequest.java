package com.chinacaring.peixian.patient.client.dto.pingpp;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * Author       : Gaof
 * Date         : 2017/10/30
 * Time         : 15:43
 * Description  :
 */
public class PingxxRefundRequest {

    @NotBlank(message = "description（退款描述）不能为空")
    private String description;
    @NotNull(message = "amount（退款金额）不能为空")
    private Integer amount;
    @NotBlank(message = "amount（订单ID）不能为空")
    private String charge_id;

    // 微信退款资金来源取值范围： unsettled_funds ：使用未结算资金退款； recharge_funds ：
    // 使用可用余额退款。注：默认值  unsettled_funds ，该参数仅适用于所有微信渠道老资金流商户使用，
    // 包括 wx ，  wx_pub ，  wx_pub_qr ，  wx_lite ，  wx_wap 五个渠道；
    // 新资金流退款资金默认从基本账户中扣除。该参数仅在请求退款，传入该字段时返回。
    private String funding_source;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCharge_id() {
        return charge_id;
    }

    public void setCharge_id(String charge_id) {
        this.charge_id = charge_id;
    }

    public String getFunding_source() {
        return funding_source;
    }

    public void setFunding_source(String funding_source) {
        this.funding_source = funding_source;
    }
}
