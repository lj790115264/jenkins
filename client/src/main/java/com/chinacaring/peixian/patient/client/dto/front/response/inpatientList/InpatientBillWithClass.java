package com.chinacaring.peixian.patient.client.dto.front.response.inpatientList;

import lombok.Data;

import java.util.List;

/**
 * @author zyc77
 */
@Data
public class InpatientBillWithClass {

    private String itemClass;

    private Double totalCost;

    private List<InpatientBillResponse> billResponses;

    public InpatientBillWithClass(String itemClass, List<InpatientBillResponse> billResponses) {
        this.itemClass = itemClass;
        this.billResponses = billResponses;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public List<InpatientBillResponse> getBillResponses() {
        return billResponses;
    }

    public void setBillResponses(List<InpatientBillResponse> billResponses) {
        this.billResponses = billResponses;
    }
}
