package com.chinacaring.peixian.patient.client.orders;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.check.CheckCompare;
import com.chinacaring.peixian.patient.client.dto.check.CheckCount;

import java.util.Date;
import java.util.List;

/**
 * 对账
 */
public interface CheckOrdersService {

    List<CheckCount> checkCount(Date begin, Date end) throws CommonException;

    // 长款
    List<CheckCompare> longMoney(Date begin, Date end) throws CommonException;

    // 短款
    List<CheckCompare> shortMoney(Date begin, Date end) throws CommonException;
}
