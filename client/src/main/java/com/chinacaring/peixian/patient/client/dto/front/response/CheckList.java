package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

import java.util.List;

@Data
public class CheckList {

    private String time;
    private String scription;
    private String checkId;
    private List<CheckResponse> detail;
}
