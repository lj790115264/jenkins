package com.chinacaring.peixian.patient.client.dto.front.response.inpatientList;

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

    public String getInhosTime() {
        return inhosTime;
    }

    public void setInhosTime(String inhosTime) {
        this.inhosTime = inhosTime;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getInbalance() {
        return inbalance;
    }

    public void setInbalance(String inbalance) {
        this.inbalance = inbalance;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public List<InpatientBillDateAndClass> getBills() {
        return bills;
    }

    public void setBills(List<InpatientBillDateAndClass> bills) {
        this.bills = bills;
    }
}
