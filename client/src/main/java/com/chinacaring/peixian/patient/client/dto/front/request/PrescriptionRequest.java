package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class PrescriptionRequest {

    private String regNO;
    private String isFee;

    public PrescriptionRequest(String regNO, String isFee) {
        this.regNO = regNO;
        this.isFee = isFee;
    }

    public String getRegNO() {
        return regNO;
    }

    public void setRegNO(String regNO) {
        this.regNO = regNO;
    }

    public String getIsFee() {
        return isFee;
    }

    public void setIsFee(String isFee) {
        this.isFee = isFee;
    }
}
