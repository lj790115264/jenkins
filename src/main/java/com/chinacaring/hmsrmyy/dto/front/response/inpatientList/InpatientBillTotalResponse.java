package com.chinacaring.hmsrmyy.dto.front.response.inpatientList;

import lombok.Data;

import java.util.List;

/**
 * @author zyc77
 */
@Data
public class InpatientBillTotalResponse {

    private String inhosTime;

    private String deptName;

    private String inbalance;

    private String totalCost;

    private List<InpatientBillDateAndClass> bills;

}
