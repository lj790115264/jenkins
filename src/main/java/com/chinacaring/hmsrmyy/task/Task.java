package com.chinacaring.hmsrmyy.task;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Task {

    @Autowired
    private BaseInfoService baseInfoService;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Scheduled(cron = "0 59 23 * * ?")
    public void updateDept() throws CommonException {
        logger.info("开始插入科室");
        baseInfoService.insertDepts();
        logger.info("结束插入科室");
    }
}
