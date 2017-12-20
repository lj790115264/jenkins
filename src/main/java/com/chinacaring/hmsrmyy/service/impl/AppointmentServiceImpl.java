package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dto.front.response.Schedule;
import com.chinacaring.hmsrmyy.dto.front.response.ScheduleResponse;
import com.chinacaring.hmsrmyy.dto.his.request.schedule.ScheduleRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.schedule.ScheduleResponseHis;
import com.chinacaring.hmsrmyy.service.AppointmentService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppointmentServiceImpl implements AppointmentService {

    @Override
    public Object getSchedule(ScheduleRequestHis scheduleRequestHis) throws CommonException {
        String soap = RequestUtil.soap(InterfaceName.getSchemaInfo.name(), JaxbXmlUtil.convertToXml(scheduleRequestHis));
        ScheduleResponseHis scheduleResponseHis = JaxbXmlUtil.convertToJavaBean(soap, ScheduleResponseHis.class);

        if (!Objects.equals("1", scheduleResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }

        List<Schedule> schedules = BeanMapperUtil.mapList(scheduleResponseHis.getItems().getItem(), Schedule.class);
        List<Schedule> normal = new ArrayList<>();
        List<Schedule> expert = new ArrayList<>();
        for (Schedule schedule : schedules){
            if (Objects.equals(schedule.getRegLevelName(), "专家")){
                expert.add(schedule);
            }else {
                normal.add(schedule);
            }
        }

        return new ScheduleResponse(normal, expert);
    }
}

