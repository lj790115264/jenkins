package com.chinacaring.peixian.patient.client.dto.front.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class PrescriptionResponse {

    private String recipeKey;
    private String recipeNO;
    private String seqNO;
    private String feeCode;
    private String drugFlag;
    private String itemCode;
    private String itemName;
    private String number;
    private String unitPrice;
    private String totCost;

    private String doctorName;

    private String doctorCode;

    private String deptCode;
    private String deptName;
    private String execDeptCode;
    private String execDeptName;
    @JsonIgnore
    private String moTime;
    private String itemClass;
    private String payFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;

}
