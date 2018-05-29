package com.chinacaring.peixian.patient.client.dto.front.response;


public class InbalanceResponse {

    private String patientId;
    private String inpatientNo;
    private String inpatientSeq;
    private String deptCode;
    private String deptName;

    private String inhosTime;

    //押金余额，不做
    private String inbalance;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getInpatientSeq() {
        return inpatientSeq;
    }

    public void setInpatientSeq(String inpatientSeq) {
        this.inpatientSeq = inpatientSeq;
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

    public String getInhosTime() {
        return inhosTime;
    }

    public void setInhosTime(String inhosTime) {
        this.inhosTime = inhosTime;
    }

    public String getInbalance() {
        return inbalance;
    }

    public void setInbalance(String inbalance) {
        this.inbalance = inbalance;
    }
}
