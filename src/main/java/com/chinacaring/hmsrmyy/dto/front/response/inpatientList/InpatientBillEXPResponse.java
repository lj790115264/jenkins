package com.chinacaring.hmsrmyy.dto.front.response.inpatientList;

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

}
