package com.chinacaring.hmsrmyy.dto.front.response;

import lombok.Data;

@Data
public class ClinicPayment {

    private Integer id;

    private String visitTime;

    private String payTime;

    private String deptName;

    private String cost;

    private String receiptNo;

    private String doctorName;

    private Integer seeNo;

    private String registerId;

    private String payChannel;

    private Integer state;

}
