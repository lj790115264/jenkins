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

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
