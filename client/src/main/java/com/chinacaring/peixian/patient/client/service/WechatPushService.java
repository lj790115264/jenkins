package com.chinacaring.peixian.patient.client.service;


import com.chinacaring.peixian.patient.client.dto.wechatpush.WechatPushResponse;

public interface WechatPushService {

    WechatPushResponse sendNews(String alipayUrl, String title, String refundDes);
}
