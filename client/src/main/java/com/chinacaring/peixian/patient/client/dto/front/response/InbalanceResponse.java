package com.chinacaring.peixian.patient.client.dto.front.response;


import lombok.Data;

@Data
public class InbalanceResponse {

    private String patientId;
    private String inpatientNo;
    private String inpatientSeq;
    private String deptCode;
    private String deptName;

    private String inhosTime;
    private String inbalance;

}
