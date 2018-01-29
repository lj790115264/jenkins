package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class ClinicRecordRequest {

    protected String patientCode;
    protected String beginTime;
    protected String endTime;
    protected String name;

    public ClinicRecordRequest(String patientCode, String beginTime, String endTime) {
        this.patientCode = patientCode;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
}
