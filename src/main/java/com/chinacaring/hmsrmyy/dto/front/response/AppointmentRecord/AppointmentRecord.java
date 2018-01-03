package com.chinacaring.hmsrmyy.dto.front.response.AppointmentRecord;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class AppointmentRecord {

    private Integer id;

    private String patientName;

    private String deptName;

    private String doctorName;

    private Integer seeNo = 0;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date payTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date appointmentTime;

    private String cost;

    private String state;

}
