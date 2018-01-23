package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class ScheduleRequest {

    protected String beginTime;
    protected String endTime;
    protected String deptCode;

    public ScheduleRequest(String beginTime, String endTime, String deptCode) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.deptCode = deptCode;
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}
