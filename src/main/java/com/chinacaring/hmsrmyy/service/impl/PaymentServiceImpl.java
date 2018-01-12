package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.dao.entity.Appointment;
import com.chinacaring.hmsrmyy.dao.entity.Inbalance;
import com.chinacaring.hmsrmyy.dao.entity.Outpatient;
import com.chinacaring.hmsrmyy.dao.repository.AppointmentRepository;
import com.chinacaring.hmsrmyy.dao.repository.InbalanceRepository;
import com.chinacaring.hmsrmyy.dao.repository.OutpatientRepository;
import com.chinacaring.hmsrmyy.dto.front.response.payments.ClinicPayment;
import com.chinacaring.hmsrmyy.dto.front.response.payments.InbalancePayment;
import com.chinacaring.hmsrmyy.dto.front.response.payments.PaymentRecordsResponse;
import com.chinacaring.hmsrmyy.dto.front.response.payments.RegisterPayment;
import com.chinacaring.hmsrmyy.service.PaymentService;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
