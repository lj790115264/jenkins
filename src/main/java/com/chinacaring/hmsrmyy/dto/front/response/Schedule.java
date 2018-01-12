package com.chinacaring.hmsrmyy.dto.front.response;

import lombok.Data;

@Data
public class Schedule {

    protected String scheduleId;
    protected String seeDate;
    protected String week;
    protected String noonCode;
    protected String beginTime;
    protected String endTime;
    protected String supDeptCode;
    protected String supDeptName;
    protected String deptCode;
    protected String deptName;
    protected String doctorCode;
    protected String doctorName;
    protected String totalLimit;
    protected String registered;
    protected String regLevelCode;
    protected String regLevelName;
    protected String regCost;
}
