package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.dao.entity.Appointment;
import com.chinacaring.hmsrmyy.dao.repository.AppointmentRepository;
import com.chinacaring.hmsrmyy.dto.pingpp.RefundRequest;
import com.chinacaring.hmsrmyy.dto.wechatpush.WechatPushResponse;
import com.chinacaring.hmsrmyy.service.RefundService;
import com.chinacaring.hmsrmyy.service.WechatPushService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Objects;

@Service
public class RefundServiceImpl implements RefundService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Gson gson;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatPushService wechatPushService;

    @Override
    public Object refund(String orderNo, String orderType, String refundDes) {

        switch (orderType){
            //预约挂号支付
            case Constant.ORDERS_APPOINTMENT:
                try{
                    refundAppointment(orderNo, refundDes);
                }catch (Exception e){
                    logger.info("orderType :" + orderType + "  orderNo :" + orderNo + "  退款出现异常！！");
                    e.printStackTrace();
                }
                break;
            //门诊缴费
            case Constant.ORDERS_CLINIC:
                break;

            //住院预交金
            case Constant.ORDERS_INHOS_PRE_CHARGE:
                break;

            default:
                break;
        }
        return null;
    }

    public Object refundAppointment(String orderNo, String refundDes){

        logger.info("挂号退款 -- " + orderNo);

        Appointment appointment = appointmentRepository.findOneByOrderNo(orderNo);
        String fundingSource;
        if (appointment.getPayChannel().startsWith("alipay")) {
            fundingSource = "";
        }else {
            fundingSource = Constant.REFUND_FUNDING_SOURCE_WX_UNSETTLED_FUNDS;
        }

        String refundRes = refundByPaydata(appointment.getPayData(), "挂号失败退款", fundingSource);

        //如果重复退款 退款接口会返回 null
        if (Objects.equals(refundRes, null)){
            appointment.setRefundRes("重复退款");
            appointmentRepository.save(appointment);
            return true;
        }

        Map refundResMap= gson.fromJson(refundRes, Map.class);
        String refundStatus = refundResMap.get("status") + "";
        String refundNo = refundResMap.get("id") + "";

        appointment.setRefundNo(refundNo);
        appointment.setRefundRes(refundRes);
        //正在处理
        if (Objects.equals(refundStatus, "pending")){
            appointment.setPayState(Constant.ORDERS_REFUND_PENDING);
            appointmentRepository.save(appointment);
        //退款成功
        }else if (Objects.equals(refundStatus, "succeeded")){
            appointment.setPayState(Constant.ORDERS_REFUNDED);
            appointmentRepository.save(appointment);
        //其余退款失败
        }else {
            appointment.setPayState(Constant.ORDERS_REFUND_FAILED);
            appointmentRepository.save(appointment);
        }

        String alipayUrl;
        String title;
        //微信到此结束
        //支付宝还需要景 url 推送给对应的退款人
        if (appointment.getPayChannel().startsWith("alipay")){
            alipayUrl = refundResMap.get("failureMsg") + "";
            alipayUrl = alipayUrl.replace("需要打开地址进行下一步退款操作: ", "");
            //保存下 url
            appointment.setAlipayRefundUrl(alipayUrl);
            appointmentRepository.save(appointment);

            title = "支付宝退款通知";
        }else {
            alipayUrl = "";
            title = "微信退款通知";
        }

        WechatPushResponse wechatPushResponse = wechatPushService.sendNews(alipayUrl, title, refundDes);
        logger.info("退款推送 -- " + orderNo);
        logger.info(wechatPushResponse.toString());
        return null;

    }


    public String refundByPaydata(String paydata, String description, String fundingSource){

        Map payMap= gson.fromJson(paydata, Map.class);
        RefundRequest refundRequest = new RefundRequest();
        refundRequest.setDescription(description);
        refundRequest.setAmount((Integer) payMap.get("amount"));
        refundRequest.setCharge_id(payMap.get("id") + "");
        //从未结算资金退款
        // 微信 未结算 unsettled_funds
        // 支付宝 不传参数 “”
        refundRequest.setFunding_source(fundingSource);

        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        httpHeaders.setContentType(type);
        httpHeaders.add("Authorization", Constant.PAY_BASE64_STRING);
        String param = gson.toJson(refundRequest);
        HttpEntity<String> httpEntity = new HttpEntity<>(param,httpHeaders);
        String refundRes = restTemplate.postForObject(Constant.REFUND_URL, httpEntity, String.class);
        return refundRes;
    }
}

