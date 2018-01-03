package com.chinacaring.hmsrmyy.dto.front.response;


import lombok.Data;

@Data
public class InbalanceResponse {

    private String inpatientNo;
    private String inpatientSeq;
    private String deptCode;
    private String deptName;
    private String inhosTime;
    private String inbalance;
}
