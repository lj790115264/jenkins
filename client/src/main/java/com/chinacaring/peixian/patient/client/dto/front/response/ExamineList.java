package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

import java.util.List;

@Data
public class ExamineList {

    private String report_time;
    private String name;
    private String examine_code;
    private List<ExamineDetailResponseWithSortCode> detail;
}
