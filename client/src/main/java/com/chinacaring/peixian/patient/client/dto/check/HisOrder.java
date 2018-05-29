package com.chinacaring.peixian.patient.client.dto.check;

import com.chinacaring.peixian.patient.client.enumeration.PayWay;
import com.chinacaring.peixian.patient.client.enumeration.TradeType;

import java.util.Date;

public class HisOrder {

    private Integer fee;
    // 支付方式
    private PayWay payWay;
    private String recipe;
    private String name;
    private Date tradeTime;
    // 交易类型
    private TradeType tradeType;

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public PayWay getPayWay() {
        return payWay;
    }

    public void setPayWay(PayWay payWay) {
        this.payWay = payWay;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TradeType getTradeType() {
        return tradeType;
    }

    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }
}
