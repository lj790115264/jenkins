package com.chinacaring.hmsrmyy.dto.front.response.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class InbalancePayment {

    private Integer id;

    private Date inhosTime;

    private Date payTime;

    private String deptName;

    private String patientName;

    private String inbalance;

    private String cost;

    private Integer confirmState;

    private String inpatientCode;

    private Integer payState;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date refundTime;
}
