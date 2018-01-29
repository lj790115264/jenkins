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

}
