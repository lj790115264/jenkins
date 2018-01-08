package com.chinacaring.hmsrmyy.dto.front.response.inpatientList;

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

}
