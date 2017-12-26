package com.chinacaring.hmsrmyy.dto.front.request;

import lombok.Data;

@Data
public class PrescriptionRequest {

    private String regNO;
    private String isFee;

    public PrescriptionRequest(String regNO, String isFee) {
        this.regNO = regNO;
        this.isFee = isFee;
    }
}
