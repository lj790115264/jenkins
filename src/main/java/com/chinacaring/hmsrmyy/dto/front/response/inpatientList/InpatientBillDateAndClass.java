package com.chinacaring.hmsrmyy.dto.front.response.inpatientList;

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

}
