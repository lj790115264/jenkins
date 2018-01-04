package com.chinacaring.hmsrmyy.service;

import com.chinacaring.hmsrmyy.dto.front.response.payments.PaymentRecordsResponse;
import com.chinacaring.user.dao.entity.User;

import java.util.concurrent.ExecutionException;

public interface PaymentService {

    PaymentRecordsResponse getPaymentRecordsResponse(String idCard, User user) throws ExecutionException, InterruptedException;
}
