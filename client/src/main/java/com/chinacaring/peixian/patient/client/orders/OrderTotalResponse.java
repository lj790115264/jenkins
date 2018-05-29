package com.chinacaring.peixian.patient.client.orders;

/**
 * @author fandong
 */
public class OrderTotalResponse {

    private TotalResponse total;
    private TotalResponse paid;
    private TotalResponse refunded;

    public OrderTotalResponse() {
    }

    public OrderTotalResponse(TotalResponse total, TotalResponse paid, TotalResponse refunded) {
        this.total = total;
        this.paid = paid;
        this.refunded = refunded;
    }

    public TotalResponse getTotal() {
        return total;
    }

    public void setTotal(TotalResponse total) {
        this.total = total;
    }

    public TotalResponse getPaid() {
        return paid;
    }

    public void setPaid(TotalResponse paid) {
        this.paid = paid;
    }

    public TotalResponse getRefunded() {
        return refunded;
    }

    public void setRefunded(TotalResponse refunded) {
        this.refunded = refunded;
    }
}
