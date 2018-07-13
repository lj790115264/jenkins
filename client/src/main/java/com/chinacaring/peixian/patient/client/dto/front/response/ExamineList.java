package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

import java.util.List;

@Data
public class ExamineList {

    private String report_time;
    private String name;
    private String examine_code;
    private List<ExamineDetailResponseWithSortCode> detail;

    public String getReport_time() {
        return report_time;
    }

    public void setReport_time(String report_time) {
        this.report_time = report_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExamine_code() {
        return examine_code;
    }

    public void setExamine_code(String examine_code) {
        this.examine_code = examine_code;
    }

    public List<ExamineDetailResponseWithSortCode> getDetail() {
        return detail;
    }

    public void setDetail(List<ExamineDetailResponseWithSortCode> detail) {
        this.detail = detail;
    }
}
