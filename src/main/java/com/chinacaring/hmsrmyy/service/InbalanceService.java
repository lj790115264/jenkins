package com.chinacaring.hmsrmyy.service;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.dto.front.request.InbalanceInfoRequest;
import com.chinacaring.user.dao.entity.User;

import java.text.ParseException;

public interface InbalanceService {

    Object createInbalanceOrder(InbalanceInfoRequest inbalanceInfoRequest, User user) throws ParseException;

    Object doInbalanceConfirm(String orderNO) throws CommonException;
}
