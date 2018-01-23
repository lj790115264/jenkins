package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

@Data
public class Schedule {

    protected String scheduleId;
    protected String seeDate;
    protected String week;
    protected String noonCode;
    protected String beginTime;
    protected String endTime;
    protected String supDeptCode;
    protected String supDeptName;
    protected String deptCode;
    protected String deptName;
    protected String doctorCode;
    protected String doctorName;
    protected String totalLimit;
    protected String registered;
    protected String regLevelCode;
    protected String regLevelName;
    protected String regCost;
    protected String schemaType;

    public String getSchemaType() {
        return schemaType;
    }

    public void setSchemaType(String schemaType) {
        this.schemaType = schemaType;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(String seeDate) {
        this.seeDate = seeDate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSupDeptCode() {
        return supDeptCode;
    }

    public void setSupDeptCode(String supDeptCode) {
        this.supDeptCode = supDeptCode;
    }

    public String getSupDeptName() {
        return supDeptName;
    }

    public void setSupDeptName(String supDeptName) {
        this.supDeptName = supDeptName;
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

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(String totalLimit) {
        this.totalLimit = totalLimit;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getRegLevelCode() {
        return regLevelCode;
    }

    public void setRegLevelCode(String regLevelCode) {
        this.regLevelCode = regLevelCode;
    }

    public String getRegLevelName() {
        return regLevelName;
    }

    public void setRegLevelName(String regLevelName) {
        this.regLevelName = regLevelName;
    }

    public String getRegCost() {
        return regCost;
    }

    public void setRegCost(String regCost) {
        this.regCost = regCost;
    }
}
