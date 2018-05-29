package com.chinacaring.peixian.patient.client.orders;

/**
 * @author fandong
 */
public class TotalResponse {

    private String total;

    private Integer quantity;

    public TotalResponse() {
    }

    public TotalResponse(String total, Integer quantity) {
        this.total = total;
        this.quantity = quantity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
