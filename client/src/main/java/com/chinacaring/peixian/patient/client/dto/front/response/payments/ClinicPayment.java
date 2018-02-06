package com.chinacaring.peixian.patient.client.dto.front.response.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ClinicPayment {

    private Integer id;

    private String regDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date payTime;

    private String patientName;

    private String deptName;

    private String regLevelName;

    private String totalCost;

    private String doctorName;

    private Integer confirmState;

    private Integer payState;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date refundTime;

    private String refundCost;

    private String registerId;

    private String branchName = "沛县人民医院";

    //收据号
    private String receiptNo;

    // 窗口名字
    private String windowName;
}
