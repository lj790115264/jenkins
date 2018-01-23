package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class InbalanceInfoRequest {

    private String patientName;

    private String idCard;

    private String payChannel;

    //缴费金额
    private String cost;

    //押金余额
    private String inbalance;

    // yyyy-MM-dd HH:mm:ss
    private String inhostime;

    private String inpatientCode;

    private String openId;

    private String operCode;

    private String deptName;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getInbalance() {
        return inbalance;
    }

    public void setInbalance(String inbalance) {
        this.inbalance = inbalance;
    }

    public String getInhostime() {
        return inhostime;
    }

    public void setInhostime(String inhostime) {
        this.inhostime = inhostime;
    }

    public String getInpatientCode() {
        return inpatientCode;
    }

    public void setInpatientCode(String inpatientCode) {
        this.inpatientCode = inpatientCode;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
