package com.chinacaring.hmsrmyy.dto.front.response;

import lombok.Data;

@Data
public class OutpatientMedicalRecordsResponse {

    protected String registerId;
    protected String patientCode;
    protected String drugName;
    //规格
    protected String drugSpec;
    protected String amount;
    protected String unitPrice;
    protected String totCost;
    protected String dosage;
    protected String adminstration;
    protected String frequency;
    protected String frequencyName;
    //诊断
    protected String diagnosis;
    protected String doctorCode;
    protected String doctorName;
}
