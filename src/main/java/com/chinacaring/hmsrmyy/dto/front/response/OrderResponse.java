package com.chinacaring.hmsrmyy.dto.front.response;

public class OrderResponse {

    private Integer id;

    private String pay_data;

    public OrderResponse() {
    }

    public OrderResponse(Integer id, String pay_data) {
        this.id = id;
        this.pay_data = pay_data;
    }

    public String getPay_data() {
        return pay_data;
    }

    public void setPay_data(String pay_data) {
        this.pay_data = pay_data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
