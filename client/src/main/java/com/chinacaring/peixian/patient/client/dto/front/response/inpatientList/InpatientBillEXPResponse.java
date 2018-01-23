package com.chinacaring.peixian.patient.client.dto.front.response.inpatientList;

import lombok.Data;

import java.util.List;

/**
 * @author zyc77
 */
@Data
public class InpatientBillEXPResponse {

    private String date;

    private double total;

    private List<InpatientBillResponse> bills;

    public InpatientBillEXPResponse(String date, List<InpatientBillResponse> bills) {
        this.date = date;
        this.bills = bills;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<InpatientBillResponse> getBills() {
        return bills;
    }

    public void setBills(List<InpatientBillResponse> bills) {
        this.bills = bills;
    }
}
