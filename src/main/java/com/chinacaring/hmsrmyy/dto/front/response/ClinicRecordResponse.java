package com.chinacaring.hmsrmyy.dto.front.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class ClinicRecordResponse {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date appointmentTime;

    @JsonIgnore
    private String regDate;

    private String registerId;
    private String deptCode;
    private String deptName;
    private String patientName;
    private String doctorCode;
    private String doctorName;
    private String invoiceNO;
    private String operCode;
    private String status;
}
