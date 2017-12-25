package com.chinacaring.hmsrmyy.service;


import com.chinacaring.hmsrmyy.dto.wechatpush.WechatPushResponse;

public interface WechatPushService {

    WechatPushResponse sendNews(String alipayUrl, String title, String refundDes);
}
