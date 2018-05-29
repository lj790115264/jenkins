package com.chinacaring.peixian.patient.client.dto.front.response;

public class QueuePatientResponse {

    protected String deptCode;
    protected String deptName;
    protected String seeNo;
    protected String showNo;
    protected String nextNo;
    protected String waitQuantity;

    public QueuePatientResponse() {
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getShowNo() {
        return showNo;
    }

    public void setShowNo(String showNo) {
        this.showNo = showNo;
    }

    public String getNextNo() {
        return nextNo;
    }

    public void setNextNo(String nextNo) {
        this.nextNo = nextNo;
    }

    public String getWaitQuantity() {
        return waitQuantity;
    }

    public void setWaitQuantity(String waitQuantity) {
        this.waitQuantity = waitQuantity;
    }

    @Override
    public String toString() {
        return "QueuePatientResponse{" +
                "deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", seeNo='" + seeNo + '\'' +
                ", showNo='" + showNo + '\'' +
                ", nextNo='" + nextNo + '\'' +
                ", waitQuantity='" + waitQuantity + '\'' +
                '}';
    }
}
