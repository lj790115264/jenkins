package com.chinacaring.peixian.patient.client.service;

import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;

public interface CheckService {

    Object getCheck(String cardNo, String beginDate, String endDate) throws MyException;
}
