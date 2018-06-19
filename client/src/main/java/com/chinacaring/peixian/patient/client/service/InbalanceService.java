package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.front.request.InbalanceInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.InbalanceResponse;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;

public interface InbalanceService {

    Object createInbalanceOrder(InbalanceInfoRequest inbalanceInfoRequest, User user) throws ParseException;

    Boolean doInbalanceConfirm(String orderNO) throws CommonException, SoapException;

    InbalanceResponse getInbalance(String name, String idCard) throws CommonException, SoapException;

    //查询单个订单详情
    Object getInbalanceStatus(Integer id) throws CommonException;

    //查询 住院清单
    Object getInbalanceList(String name, String idCard) throws CommonException, MyException;
}
