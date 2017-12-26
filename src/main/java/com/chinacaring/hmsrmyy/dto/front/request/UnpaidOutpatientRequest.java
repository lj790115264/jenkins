package com.chinacaring.hmsrmyy.dto.front.request;

import lombok.Data;

@Data
public class UnpaidOutpatientRequest {

    protected String patientCode;
    protected String beginTime;
    protected String endTime;

    public UnpaidOutpatientRequest(String patientCode, String beginTime, String endTime) {
        this.patientCode = patientCode;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

}
