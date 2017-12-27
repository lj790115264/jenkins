package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.dao.entity.Appointment;
import com.chinacaring.hmsrmyy.dao.entity.Inbalance;
import com.chinacaring.hmsrmyy.dao.entity.Outpatient;
import com.chinacaring.hmsrmyy.dao.repository.AppointmentRepository;
import com.chinacaring.hmsrmyy.dao.repository.InbalanceRepository;
import com.chinacaring.hmsrmyy.dao.repository.OutpatientRepository;
import com.chinacaring.hmsrmyy.dto.pingpp.RefundRequest;
import com.chinacaring.hmsrmyy.dto.wechatpush.WechatPushResponse;
import com.chinacaring.hmsrmyy.service.InbalanceService;
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

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class RefundServiceImpl implements RefundService {

    private final AppointmentRepository appointmentRepository;

    private final OutpatientRepository outpatientRepository;

    private final RestTemplate restTemplate;

    private final Gson gson;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final WechatPushService wechatPushService;

    private final InbalanceService inbalanceService;

    private final InbalanceRepository inbalanceRepository;

    @Autowired
    public RefundServiceImpl(AppointmentRepository appointmentRepository,
                             OutpatientRepository outpatientRepository,
                             RestTemplate restTemplate,
                             Gson gson,
                             WechatPushService wechatPushService,
                             InbalanceService inbalanceService,
                             InbalanceRepository inbalanceRepository) {
        this.appointmentRepository = appointmentRepository;
        this.outpatientRepository = outpatientRepository;
        this.restTemplate = restTemplate;
        this.gson = gson;
        this.wechatPushService = wechatPushService;
        this.inbalanceService = inbalanceService;
        this.inbalanceRepository = inbalanceRepository;
    }

    @Override
    public Object refund(String orderNo, String orderType, String refundDes) {

        switch (orderType){
            //预约挂号支付
            case Constant.ORDERS_APPOINTMENT:
                try{
                    refundAppointment(orderNo, refundDes);
                }catch (Exception e){
                    logger.info("\norderType :" + orderType + "  orderNo :" + orderNo + "  退款出现异常！！\n");
                    e.printStackTrace();
                }
                break;
            //门诊缴费
            case Constant.ORDERS_CLINIC:
                try{
                    refundOutpatient(orderNo, refundDes);
                }catch (Exception e){
                    logger.info("\norderType :" + orderType + "  orderNo :" + orderNo + "  退款出现异常！！\n");
                    e.printStackTrace();
                }
                break;

            //住院预交金
            case Constant.ORDERS_INHOS_PRE_CHARGE:
                try{
                    refundInbalance(orderNo, refundDes);
                }catch (Exception e){
                    logger.info("\norderType :" + orderType + "  orderNo :" + orderNo + "  退款出现异常！！\n");
                    e.printStackTrace();
                }
                break;

            default:
                break;
        }
        return null;
    }

    private void refundAppointment(String orderNo, String refundDes){

        logger.info("\n挂号退款 -- " + orderNo + "\n");

        Appointment appointment = appointmentRepository.findOneByOrderNo(orderNo);
        String fundingSource;
        if (appointment.getPayChannel().startsWith("alipay")) {
            fundingSource = "";
        }else {
            fundingSource = Constant.REFUND_FUNDING_SOURCE_WX_UNSETTLED_FUNDS;
        }

        String refundRes = refundByPaydata(appointment.getPayData(), "挂号失败退款", fundingSource, appointment.getCost().intValue());

        //如果重复退款 退款接口会返回 null
        if (Objects.equals(refundRes, null)){
            appointment.setRefundRes("重复退款");
            appointmentRepository.saveAndFlush(appointment);
            return;
        }

        Map refundResMap= gson.fromJson(refundRes, Map.class);
        String refundStatus = refundResMap.get("status") + "";
        String refundNo = refundResMap.get("id") + "";

        appointment.setRefundNo(refundNo);
        appointment.setRefundRes(refundRes);
        //正在处理
        if (Objects.equals(refundStatus, "pending")){
            appointment.setPayState(Constant.ORDERS_REFUND_PENDING);
            appointmentRepository.saveAndFlush(appointment);
        //退款成功
        }else if (Objects.equals(refundStatus, "succeeded")){
            appointment.setPayState(Constant.ORDERS_REFUNDED);
            appointmentRepository.saveAndFlush(appointment);
        //其余退款失败
        }else {
            appointment.setPayState(Constant.ORDERS_REFUND_FAILED);
            appointmentRepository.saveAndFlush(appointment);
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
            appointmentRepository.saveAndFlush(appointment);

            title = "支付宝退款通知";
        }else {
            alipayUrl = "";
            title = "微信退款通知";
        }

        WechatPushResponse wechatPushResponse = wechatPushService.sendNews(alipayUrl, title, refundDes);
        logger.info("\n退款推送 -- " + orderNo + "\n");
        logger.info(wechatPushResponse.toString() + "\n");

    }

    private void refundInbalance(String orderNo, String refundDes){

        logger.info("\n住院预交金退款 -- " + orderNo + "\n");
        List<Inbalance> inbalances = inbalanceRepository.findByOrderNo(orderNo);
        Inbalance inbalance = inbalances.get(0);

        String fundingSource;
        if (inbalance.getPayChannel().startsWith("alipay")) {
            fundingSource = "";
        }else {
            fundingSource = Constant.REFUND_FUNDING_SOURCE_WX_UNSETTLED_FUNDS;
        }
        String refundRes = refundByPaydata(inbalance.getPayData(), "挂号失败退款", fundingSource, inbalance.getCost().intValue());
        //如果重复退款 退款接口会返回 null
        if (Objects.equals(refundRes, null)){
            inbalance.setRefundRes("重复退款");
            inbalanceRepository.saveAndFlush(inbalance);
            return;
        }
        Map refundResMap= gson.fromJson(refundRes, Map.class);
        String refundStatus = refundResMap.get("status") + "";
        String refundNo = refundResMap.get("id") + "";

        inbalance.setRefundNo(refundNo);
        inbalance.setRefundRes(refundRes);

        //正在处理
        if (Objects.equals(refundStatus, "pending")){
            inbalance.setPayState(Constant.ORDERS_REFUND_PENDING);
            inbalanceRepository.saveAndFlush(inbalance);
            //退款成功
        }else if (Objects.equals(refundStatus, "succeeded")){
            inbalance.setPayState(Constant.ORDERS_REFUNDED);
            inbalanceRepository.saveAndFlush(inbalance);
            //其余退款失败
        }else {
            inbalance.setPayState(Constant.ORDERS_REFUND_FAILED);
            inbalanceRepository.saveAndFlush(inbalance);
        }

        String alipayUrl;
        String title;
        //微信到此结束
        //支付宝还需要景 url 推送给对应的退款人
        if (inbalance.getPayChannel().startsWith("alipay")){
            alipayUrl = refundResMap.get("failureMsg") + "";
            alipayUrl = alipayUrl.replace("需要打开地址进行下一步退款操作: ", "");
            //保存下 url
            inbalance.setAlipayRefundUrl(alipayUrl);
            inbalanceRepository.saveAndFlush(inbalance);

            title = "支付宝退款通知";
        }else {
            alipayUrl = "";
            title = "微信退款通知";
        }

        WechatPushResponse wechatPushResponse = wechatPushService.sendNews(alipayUrl, title, refundDes);
        logger.info("\n退款推送 -- " + orderNo + "\n");
        logger.info("\n" + wechatPushResponse.toString() + "\n");
    }

    private void refundOutpatient(String orderNo, String refundDes){

        logger.info("\n门诊结算退款 -- " + orderNo + "\n");
        List<Outpatient> outpatients = outpatientRepository.findByOrderNo(orderNo);
        Outpatient outpatient = outpatients.get(0);
        String fundingSource;
        if (outpatient.getPayChannel().startsWith("alipay")) {
            fundingSource = "";
        }else {
            fundingSource = Constant.REFUND_FUNDING_SOURCE_WX_UNSETTLED_FUNDS;
        }

        String refundRes = refundByPaydata(outpatient.getPayData(), "门诊结算失败退款", fundingSource, outpatient.getRefundCost().intValue());

        //如果重复退款 退款接口会返回 null
        if (Objects.equals(refundRes, null)){
            outpatient.setRefundRes("重复退款");
            outpatientRepository.saveAndFlush(outpatient);
            return;
        }

        Map refundResMap= gson.fromJson(refundRes, Map.class);
        String refundStatus = refundResMap.get("status") + "";
        String refundNo = refundResMap.get("id") + "";

        outpatient.setRefundNo(refundNo);
        outpatient.setRefundRes(refundRes);
        //正在处理
        if (Objects.equals(refundStatus, "pending")){
            outpatient.setPayState(Constant.ORDERS_REFUND_PENDING);
            outpatientRepository.saveAndFlush(outpatient);
            //退款成功
        }else if (Objects.equals(refundStatus, "succeeded")){
            outpatient.setPayState(Constant.ORDERS_REFUNDED);
            outpatientRepository.saveAndFlush(outpatient);
            //其余退款失败
        }else {
            outpatient.setPayState(Constant.ORDERS_REFUND_FAILED);
            outpatientRepository.saveAndFlush(outpatient);
        }

        String alipayUrl;
        String title;
        //微信到此结束
        //支付宝还需要景 url 推送给对应的退款人
        if (outpatient.getPayChannel().startsWith("alipay")){
            alipayUrl = refundResMap.get("failureMsg") + "";
            alipayUrl = alipayUrl.replace("需要打开地址进行下一步退款操作: ", "");
            //保存下 url
            outpatient.setAlipayRefundUrl(alipayUrl);
            outpatientRepository.saveAndFlush(outpatient);

            title = "支付宝退款通知";
        }else {
            alipayUrl = "";
            title = "微信退款通知";
        }

        WechatPushResponse wechatPushResponse = wechatPushService.sendNews(alipayUrl, title, refundDes);
        logger.info("\n退款推送 -- " + orderNo + "\n");
        logger.info("\n" + wechatPushResponse.toString() + "\n");
    }

    private String refundByPaydata(String paydata, String description, String fundingSource, Integer refundAmount){

        Map payMap= gson.fromJson(paydata, Map.class);
        RefundRequest refundRequest = new RefundRequest();
        refundRequest.setDescription(description);
        refundRequest.setAmount(refundAmount);
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

