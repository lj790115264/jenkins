package com.chinacaring.hmsrmyy.dto.front.response.AppointmentRecord;

import lombok.Data;

@Data
public class AppointmentRecord {

    private Integer id;

    private String patientName;

    private String deptName;

    private String doctorName;

    private Integer seeNo = 0;

    private String payTime;

    private String appointmentTime;

    private String cost;

    private String state;

}
