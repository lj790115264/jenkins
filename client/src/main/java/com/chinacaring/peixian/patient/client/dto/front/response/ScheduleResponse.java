package com.chinacaring.peixian.patient.client.dto.front.response;

import lombok.Data;

import java.util.List;

@Data
public class ScheduleResponse {

    private List<Schedule> normal;
    private List<Schedule> expert;

    public ScheduleResponse(List<Schedule> normal, List<Schedule> expert) {
        this.normal = normal;
        this.expert = expert;
    }
}
