package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.his.request.schedule.ScheduleRequestHis;

public interface AppointmentService {

    Object getSchedule(ScheduleRequestHis scheduleRequestHis) throws CommonException;

}
