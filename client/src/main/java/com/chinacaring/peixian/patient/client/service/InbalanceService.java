package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.request.InbalanceInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.InbalanceResponse;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;

public interface InbalanceService {

    Object createInbalanceOrder(InbalanceInfoRequest inbalanceInfoRequest, User user) throws ParseException;

    Boolean doInbalanceConfirm(String orderNO) throws CommonException;

    InbalanceResponse getInbalance(String name, String idCard) throws CommonException;

    //查询单个订单详情
    Object getInbalanceStatus(Integer id) throws CommonException;

    //查询 住院清单
    Object getInbalanceList(String name, String idCard) throws CommonException;
}
