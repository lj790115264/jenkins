package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.peixian.patient.client.dto.front.response.payments.ClinicPayment;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.InbalancePayment;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.PaymentRecordsResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.RegisterPayment;
import com.chinacaring.peixian.patient.client.service.PaymentService;
import com.chinacaring.user.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentItemsAsync paymentItemsAsync;

    @Override
    public PaymentRecordsResponse getPaymentRecordsResponse(String idCard, User user) throws ExecutionException, InterruptedException {

        Future<List<RegisterPayment>> registerPayments = paymentItemsAsync.getRegisterPayments(idCard, user);
        Future<List<InbalancePayment>> inbalancePayments = paymentItemsAsync.getInbalancePayments(idCard, user);
        Future<List<ClinicPayment>> clinicpayments = paymentItemsAsync.getClinicPayments(idCard, user);

        while (true){
            if (registerPayments.isDone() && inbalancePayments.isDone() && clinicpayments.isDone()){
                break;
            }
            Thread.sleep(3);
        }

        PaymentRecordsResponse paymentRecordsResponse = new PaymentRecordsResponse();
        paymentRecordsResponse.setInbalancePayments(inbalancePayments.get());
        paymentRecordsResponse.setRegisterPayments(registerPayments.get());
        paymentRecordsResponse.setClinicPayments(clinicpayments.get());
        return paymentRecordsResponse;
    }


}
