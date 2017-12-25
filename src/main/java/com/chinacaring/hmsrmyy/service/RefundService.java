package com.chinacaring.hmsrmyy.service;

public interface RefundService {

    Object refund(String orderNo, String orderType, String refundDes);
}
