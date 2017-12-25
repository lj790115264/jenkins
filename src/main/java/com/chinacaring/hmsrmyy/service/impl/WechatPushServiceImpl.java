package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.dto.wechatpush.Acceptor;
import com.chinacaring.hmsrmyy.dto.wechatpush.WechatNewsPushRequest;
import com.chinacaring.hmsrmyy.dto.wechatpush.WechatPushResponse;
import com.chinacaring.hmsrmyy.service.WechatPushService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WechatPushServiceImpl implements WechatPushService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public WechatPushResponse sendNews(String alipayUrl, String title, String refundDes) {

        List<String> users = new ArrayList<>();
        users.add("zhugr");
        users.add("panc");
        WechatNewsPushRequest wechatNewsPushRequest = new WechatNewsPushRequest();
        //退款通知 应用
        wechatNewsPushRequest.setAgent_id(Constant.AGENT_ID_TUI_KUAN_TONG_ZHI);
        wechatNewsPushRequest.setHospital(Constant.HOSPITAL_ID_CHU_ZHOU_YI_YUAN);
        wechatNewsPushRequest.setUrl(alipayUrl);
        wechatNewsPushRequest.setTitle(title);
        wechatNewsPushRequest.setDescription(refundDes);
        wechatNewsPushRequest.setContent(refundDes);
        Acceptor acceptor = new Acceptor();
        acceptor.setUser(users);
        wechatNewsPushRequest.setAcceptor(acceptor);

        //微信推送 basic认证
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        httpHeaders.setContentType(type);
        httpHeaders.add("Authorization", Constant.BASIC_HEADER_WECHAT_PUSH);

        Gson gson = new GsonBuilder().create();
        String param = gson.toJson(wechatNewsPushRequest);
        HttpEntity<String> httpEntity = new HttpEntity<>(param,httpHeaders);
        WechatPushResponse wechatPushResponse = restTemplate.postForObject(Constant.WECHAT_CP_NEWS_PUSH_URL, httpEntity, WechatPushResponse.class);
        return wechatPushResponse;
    }

}
