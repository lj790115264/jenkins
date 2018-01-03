package com.chinacaring.hmsrmyy.dto.front.response.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class RegisterPayment {

    private Integer id;

    private String deptName;

    private String doctorName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date payTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date appointmentTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date refundTime;

    private String payChannel;

    private String cost;

    private String receiptNo;

    private Integer seeNo;

    private Integer regState;

    private Integer payState;

    private String patientName;

    private String registerLevelName;
}
