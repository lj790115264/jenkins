package com.chinacaring.peixian.patient.client.service;

public interface RefundService {

    Object refund(String orderNo, String orderType, String refundDes);
}
