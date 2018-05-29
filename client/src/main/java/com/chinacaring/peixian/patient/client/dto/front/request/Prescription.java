package com.chinacaring.peixian.patient.client.dto.front.request;

import lombok.Data;

@Data
public class Prescription {

    private String prescriptionNo;

    private String cost;

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
