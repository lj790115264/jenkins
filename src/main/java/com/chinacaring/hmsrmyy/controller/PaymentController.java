package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.vo.Result;
import com.chinacaring.hmsrmyy.service.PaymentService;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentRecordsService;

    @GetMapping("payment_records/{id_card}")
    public Object getPayments(@PathVariable("id_card") String idCard, @CurrentUser User user) throws ExecutionException, InterruptedException {
        return new Result<>(paymentRecordsService.getPaymentRecordsResponse(idCard, user));
    }
}
