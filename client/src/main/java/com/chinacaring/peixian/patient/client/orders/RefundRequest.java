package com.chinacaring.peixian.patient.client.orders;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * Author       : Gaof
 * Date         : 2017/10/30
 * Time         : 15:43
 * Description  :
 */
public class RefundRequest {

    @NotBlank(message = "description（退款描述）不能为空")
    private String description;
    @NotNull(message = "amount（退款金额）不能为空")
    private Integer amount;
    @NotBlank(message = "order_no（订单号）不能为空")
    private String order_no;

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

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getFunding_source() {
        return funding_source;
    }

    public void setFunding_source(String funding_source) {
        this.funding_source = funding_source;
    }
}
