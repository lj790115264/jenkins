package com.chinacaring.hmsrmyy.dto.front.request;

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
}
