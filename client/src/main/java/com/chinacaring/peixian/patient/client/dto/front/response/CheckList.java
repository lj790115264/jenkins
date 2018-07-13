package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

import java.util.List;

@Data
public class CheckList {

    private String time;
    private String scription;
    private String checkId;
    private List<CheckResponse> detail;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getScription() {
        return scription;
    }

    public void setScription(String scription) {
        this.scription = scription;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public List<CheckResponse> getDetail() {
        return detail;
    }

    public void setDetail(List<CheckResponse> detail) {
        this.detail = detail;
    }
}
