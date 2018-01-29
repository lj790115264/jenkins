package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

import java.util.List;

@Data
public class PrescriptionTotalResponse {

    private String totalCost;

    private List<PrescriptionResponse> prescriptionResponses;

    public PrescriptionTotalResponse(String totalCost, List<PrescriptionResponse> prescriptionResponses) {
        this.totalCost = totalCost;
        this.prescriptionResponses = prescriptionResponses;
    }
}

