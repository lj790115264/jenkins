package com.chinacaring.hmsrmyy.dto.front.response;

import com.chinacaring.common.dto.response.ExamineDetailResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ExamineDetailResponseWithSortCode extends ExamineDetailResponse{

    @JsonIgnore
    private Integer status_code;

    public ExamineDetailResponseWithSortCode() {
    }

    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }
}
