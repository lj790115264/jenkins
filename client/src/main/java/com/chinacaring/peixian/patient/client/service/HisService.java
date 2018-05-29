package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.check.HisOrder;

import java.util.Date;
import java.util.List;

public interface HisService {

    List<HisOrder> getHisOrders(Date start, Date end) throws CommonException;
}
