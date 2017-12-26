package com.chinacaring.hmsrmyy.dto.front.request;

import lombok.Data;

@Data
public class ClinicRecordRequest {

    protected String patientCode;
    protected String beginTime;
    protected String endTime;

    public ClinicRecordRequest(String patientCode, String beginTime, String endTime) {
        this.patientCode = patientCode;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
}
