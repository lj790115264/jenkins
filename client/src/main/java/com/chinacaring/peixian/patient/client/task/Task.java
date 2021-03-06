package com.chinacaring.peixian.patient.client.task;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.orders.OrdersService;
import com.chinacaring.peixian.patient.client.service.BaseInfoService;
import org.apache.ibatis.annotations.Arg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
public class Task {

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private OrdersService ordersService;

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Scheduled(cron = "0 59 23 * * ?")
    public void updateDept() throws CommonException {
        logger.error("开始插入科室");
        baseInfoService.insertDepts();
        logger.error("结束插入科室");
    }

    @Scheduled(fixedRate = 60 * 60 * 1000L) //2h同步一次
    public void syncOrders() throws CommonException {
        ordersService.sync();
    }
}
