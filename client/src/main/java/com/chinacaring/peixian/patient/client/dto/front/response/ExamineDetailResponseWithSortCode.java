package com.chinacaring.peixian.patient.client.dto.front.response;

import com.chinacaring.common.dto.response.ExamineDetailResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExamineDetailResponseWithSortCode extends ExamineDetailResponse{

    @JsonProperty(value = "report_time")
    private String reportTime;
    @JsonProperty(value = "status_code")
    private Integer statusCode;


    public ExamineDetailResponseWithSortCode() {
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
