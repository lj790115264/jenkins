package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class UnpaidOutpatientRequest {

    protected String patientCode;
    protected String name;

    public UnpaidOutpatientRequest(String patientCode, String name) {
        this.patientCode = patientCode;
        this.name = name;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
