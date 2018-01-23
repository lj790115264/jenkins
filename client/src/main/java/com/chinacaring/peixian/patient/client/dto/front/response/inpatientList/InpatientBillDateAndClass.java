package com.chinacaring.peixian.patient.client.dto.front.response.inpatientList;

import lombok.Data;

import java.util.List;

/**
 * @author zyc77
 */
@Data
public class InpatientBillDateAndClass {

    private String date;

    private double total;

    private List<InpatientBillWithClass> billWithClasses;

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

    public List<InpatientBillWithClass> getBillWithClasses() {
        return billWithClasses;
    }

    public void setBillWithClasses(List<InpatientBillWithClass> billWithClasses) {
        this.billWithClasses = billWithClasses;
    }
}
