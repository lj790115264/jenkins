package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.config.InterfaceName;
import com.chinacaring.peixian.patient.client.dao.entity.Inbalance;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.repository.InbalanceRepository;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.dto.front.request.InbalanceInfoRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.InbalanceResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.OrderResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.inpatientList.*;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.InbalancePayment;
import com.chinacaring.peixian.patient.client.dto.his.request.confirmInbalance.ConfirmInbalanceRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.getInpatient.GetInpatientRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.inbalanceList.InbalanceListRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.response.confirmInbalance.ConfirmInbalanceResponseHis;
import com.chinacaring.peixian.patient.client.dto.his.response.getInpatient.GetInpatientResponseHis;
import com.chinacaring.peixian.patient.client.dto.his.response.inbalanceList.InbalanceListResponseHis;
import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeRequest;
import com.chinacaring.peixian.patient.client.service.InbalanceService;
import com.chinacaring.peixian.patient.client.utils.RequestUtil;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import com.chinacaring.util.TextUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class InbalanceServiceImpl implements InbalanceService{

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static DecimalFormat df = new DecimalFormat("#0.00");

    private final InbalanceRepository inbalanceRepository;

    private final Gson gson;

    private final RestTemplate restTemplate;

    private final OrdersRepository ordersRepository;

    @Autowired
    public InbalanceServiceImpl(InbalanceRepository inbalanceRepository, Gson gson, RestTemplate restTemplate, OrdersRepository ordersRepository) {
        this.inbalanceRepository = inbalanceRepository;
        this.gson = gson;
        this.restTemplate = restTemplate;
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Object createInbalanceOrder(InbalanceInfoRequest inbalanceInfoRequest, User user) throws ParseException {
        Inbalance inbalance = new Inbalance();
        inbalance.setPatientName(inbalanceInfoRequest.getPatientName());
        inbalance.setCost(new BigDecimal(inbalanceInfoRequest.getCost()));
        inbalance.setIdCard(inbalanceInfoRequest.getIdCard());
        inbalance.setInpatientCode(inbalanceInfoRequest.getInpatientCode());
        inbalance.setPayChannel(inbalanceInfoRequest.getPayChannel());
        //产生订单时  设置状态 1：未充值
        inbalance.setConfirmState(Constant.INBALANCE_CONFIRM_WEI_CHONG_ZHI);
        //未支付标识
        inbalance.setPayState(Constant.ORDERS_NOT_PAY);
        //关联用户表
        inbalance.setUserId(user.getId());
        inbalance.setCreateTime(new Date());
        inbalance.setOperCode(inbalanceInfoRequest.getOperCode());
        inbalance.setDeptName(inbalanceInfoRequest.getDeptName());
        inbalance.setInbalance(new BigDecimal(inbalanceInfoRequest.getInbalance()));
        inbalance.setInhosTime(sdf.parse(inbalanceInfoRequest.getInhostime()));
        Inbalance inbalanceWithId = inbalanceRepository.saveAndFlush(inbalance);

        ChargeRequest chargeRequest = new ChargeRequest();
        chargeRequest.setAmount(TextUtil.getInt(inbalanceInfoRequest.getCost()));
        chargeRequest.setChannel(inbalanceInfoRequest.getPayChannel());
        //订单信息 做处理
        chargeRequest.setSubject(Constant.CHARGE_SUBJECT_INBALANCE);
        chargeRequest.setBody("inbalance");
        chargeRequest.setOpen_id(inbalanceInfoRequest.getOpenId());
        //获取支付信息
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        httpHeaders.setContentType(type);
        httpHeaders.add("Authorization", Constant.PAY_BASE64_STRING);
        String param = gson.toJson(chargeRequest);
        HttpEntity<String> httpEntity = new HttpEntity<>(param,httpHeaders);
        String payResult = restTemplate.postForObject(Constant.PAY_URL, httpEntity, String.class);

        //保存  返回的所有数据
        inbalanceWithId.setPayData(payResult);
        Map payMap= gson.fromJson(payResult, Map.class);
        //更新  order no
        String orderNo = payMap.get("order_no") + "";
        inbalanceWithId.setOrderNo(orderNo);
        inbalanceRepository.saveAndFlush(inbalanceWithId);

        //将 订单信息 保存到 订单总表
        Orders orders = new Orders();
        orders.setOrderNo(orderNo);
        orders.setCreateTime(new Timestamp(new Date().getTime()));
        orders.setUserId(user.getId());
        orders.setUsername(user.getUsername());
        orders.setPayChannel(inbalanceWithId.getPayChannel());
        orders.setAmount(Integer.valueOf(inbalanceInfoRequest.getCost()));
        orders.setType(Constant.ORDERS_INHOS_PRE_CHARGE);
        orders.setTypeNo(String.valueOf(inbalanceWithId.getId()));
        ordersRepository.save(orders);
        return new OrderResponse(inbalanceWithId.getId(), payResult);

    }

    @Override
    public Object doInbalanceConfirm(String orderNO) throws CommonException {
        List<Inbalance> inbalances = inbalanceRepository.findByOrderNo(orderNO);
        if (Objects.isNull(inbalances) || inbalances.isEmpty() || inbalances.size() > 1){
            throw new CommonException("orderNo不存在或者不唯一");
        }
        Inbalance inbalance = inbalances.get(0);
        //进入此方法时已经支付成功 设置状态为 已支付
        inbalance.setPayState(Constant.ORDERS_PAID);
        Inbalance inbalanceWithId = inbalanceRepository.saveAndFlush(inbalance);

        //充值确认
        ConfirmInbalanceRequestHis confirmInbalanceRequestHis = new ConfirmInbalanceRequestHis();
        // 分 --> 元
        confirmInbalanceRequestHis.setAmount(df.format(inbalance.getCost().divide(new BigDecimal(100))));
        confirmInbalanceRequestHis.setInpatientNo(inbalance.getInpatientCode());
        confirmInbalanceRequestHis.setName(inbalance.getPatientName());
        confirmInbalanceRequestHis.setOperCode(inbalance.getOperCode());
        confirmInbalanceRequestHis.setPayMode(inbalance.getPayChannel());
        confirmInbalanceRequestHis.setTime(sdf.format(new Date()));
        confirmInbalanceRequestHis.setTransNo(inbalance.getOrderNo());
        String soap = RequestUtil.soap(InterfaceName.hospitalizationExpensesRecharge.name(), JaxbXmlUtil.convertToXml(confirmInbalanceRequestHis));
        ConfirmInbalanceResponseHis confirmInbalanceResponseHis = JaxbXmlUtil.convertToJavaBean(soap, ConfirmInbalanceResponseHis.class);

        //保存his结果
        inbalanceWithId.setHisResult(soap);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, confirmInbalanceResponseHis.getReturnCode())){
            //失败
            inbalanceWithId.setConfirmState(Constant.INBALANCE_CONFIRM_FAIL);
            inbalanceRepository.saveAndFlush(inbalanceWithId);
            throw new CommonException("住院押金充值失败" + confirmInbalanceResponseHis.getReturnDesc());
        }else {
            //成功
            inbalanceWithId.setConfirmState(Constant.INBALANCE_CONFIRM_SUCCESS);
            inbalanceWithId.setInvoiceNo(confirmInbalanceResponseHis.getInvoiceNo());
            inbalanceWithId.setReceiptNo(confirmInbalanceResponseHis.getReceiptNo());
            inbalanceRepository.saveAndFlush(inbalanceWithId);
            return true;
        }

    }

    @Override
    public InbalanceResponse getInbalance(String name, String idCard) throws CommonException {
        GetInpatientRequestHis getInpatientRequestHis = new GetInpatientRequestHis();
        getInpatientRequestHis.setIcno(idCard);
        getInpatientRequestHis.setName(name);
        String soap = RequestUtil.soap(InterfaceName.getInpatientNo.name(), JaxbXmlUtil.convertToXml(getInpatientRequestHis));
        GetInpatientResponseHis getInpatientResponseHis = JaxbXmlUtil.convertToJavaBean(soap, GetInpatientResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, getInpatientResponseHis.getReturnCode())){
            throw new CommonException("暂无相关数据");
        }
        String inhosTime = getInpatientResponseHis.getInhosTime();
        getInpatientResponseHis.setInhosTime(inhosTime.replace("/", "-"));
        return BeanMapperUtil.map(getInpatientResponseHis, InbalanceResponse.class);

    }

    @Override
    public Object getInbalanceStatus(Integer id) throws CommonException {
        Inbalance inbalance = inbalanceRepository.findOne(id);
        if (Objects.isNull(inbalance)){
            throw new CommonException("暂无相关记录");
        }

        InbalancePayment inbalancePayment = new InbalancePayment();
        inbalancePayment.setConfirmState(inbalance.getConfirmState());
        inbalancePayment.setPayState(inbalance.getPayState());
        inbalancePayment.setRefundTime(inbalance.getRefundTime());
        inbalancePayment.setCost(df.format(inbalance.getCost().divide(new BigDecimal(100.0))));
        inbalancePayment.setDeptName(inbalance.getDeptName());
        inbalancePayment.setId(inbalance.getId());
        inbalancePayment.setInbalance(df.format(inbalance.getInbalance().divide(new BigDecimal(100.0))));
        inbalancePayment.setInhosTime(inbalance.getInhosTime());
        inbalancePayment.setInpatientCode(inbalance.getInpatientCode());
        inbalancePayment.setPatientName(inbalance.getPatientName());
        inbalancePayment.setPayTime(inbalance.getCreateTime());
        return inbalancePayment;
    }

    @Override
    public Object getInbalanceList(String name, String idCard) throws CommonException {

        InbalanceResponse inbalanceResponse = getInbalance(name, idCard);

        InbalanceListRequestHis inbalanceListRequestHis = new InbalanceListRequestHis();
        inbalanceListRequestHis.setIcno(idCard);
        inbalanceListRequestHis.setInpatientNo(inbalanceResponse.getInpatientNo());
        inbalanceListRequestHis.setDaily(Constant.ALL);
        String soap = RequestUtil.soap(InterfaceName.inhosBill.name(), JaxbXmlUtil.convertToXml(inbalanceListRequestHis));
        InbalanceListResponseHis inbalanceListResponseHis = JaxbXmlUtil.convertToJavaBean(soap, InbalanceListResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, inbalanceListResponseHis.getReturnCode())){
            throw new CommonException("暂无相关数据");
        }
        List<InpatientBillResponse> inpatientBillResponses = BeanMapperUtil.mapList(inbalanceListResponseHis.getDatas().getData(), InpatientBillResponse.class);
        for (InpatientBillResponse inpatientBillResponse : inpatientBillResponses){
            String date = inpatientBillResponse.getDate();
            StringBuilder dateBuilder = new StringBuilder();
            String year = date.substring(0,4);
            String month = date.substring(4,6);
            String day = date.substring(6);
            inpatientBillResponse.setDate(year + "-" + month + "-" + day);
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        InpatientBillTotalResponse totalResponse = new InpatientBillTotalResponse();
        List<InpatientBillEXPResponse> inpatientBillEXPResponses = group(inpatientBillResponses);
        List<InpatientBillDateAndClass> dateAndClasses = new ArrayList<>();
        Double totalSum = 0.00;
        for (InpatientBillEXPResponse expResponse : inpatientBillEXPResponses) {
            //每天的
            InpatientBillDateAndClass dateAndClass = new InpatientBillDateAndClass();
            dateAndClass.setDate(expResponse.getDate());

            List<InpatientBillWithClass> withClasses = groupWithClass(expResponse.getBills());
            Double dateSum = 0.00;

            for (InpatientBillWithClass withClass : withClasses) {
                //每个项目的
                Double sum = 0.00;
                for (InpatientBillResponse billResponse : withClass.getBillResponses()) {
                    sum = sum + billResponse.getTotalCost();
                }
                withClass.setTotalCost(Double.valueOf(df.format(sum)));
                dateSum = dateSum + sum;
            }

            dateAndClass.setTotal(Double.valueOf(df.format(dateSum)));
            dateAndClass.setBillWithClasses(withClasses);
            dateAndClasses.add(dateAndClass);
            totalSum = totalSum + dateSum;
        }

        totalResponse.setTotalCost(df.format(totalSum));
        totalResponse.setBills(dateAndClasses);
        totalResponse.setDeptName(inbalanceResponse.getDeptName());
        totalResponse.setInbalance(inbalanceResponse.getInbalance());
        totalResponse.setInhosTime(inbalanceResponse.getInhosTime().replace("/", "-"));

        return totalResponse;
    }

    private List<InpatientBillEXPResponse> group(List<InpatientBillResponse> list) {
        List<List<InpatientBillResponse>> result = new ArrayList<>();
        Map<String, List<InpatientBillResponse>> map = new TreeMap<String, List<InpatientBillResponse>>();
        List<InpatientBillEXPResponse> responses = new ArrayList<>();

        for (InpatientBillResponse bean : list) {
            if (map.containsKey(bean.getDate())) {
                List<InpatientBillResponse> t = map.get(bean.getDate());
                t.add(bean);

                map.put(bean.getDate(), t);
            } else {
                List<InpatientBillResponse> t = new ArrayList<>();
                t.add(bean);
                map.put(bean.getDate(), t);
            }
        }
        for (Map.Entry<String, List<InpatientBillResponse>> entry : map.entrySet()) {
            responses.add(new InpatientBillEXPResponse(entry.getKey(), entry.getValue()));
        }
        return responses;
    }

    private List<InpatientBillWithClass> groupWithClass(List<InpatientBillResponse> list) {
        List<List<InpatientBillResponse>> result = new ArrayList<>();
        Map<String, List<InpatientBillResponse>> map = new TreeMap<String, List<InpatientBillResponse>>();
        List<InpatientBillWithClass> responses = new ArrayList<>();

        for (InpatientBillResponse bean : list) {
            if (map.containsKey(bean.getItemClass())) {
                List<InpatientBillResponse> t = map.get(bean.getItemClass());
                t.add(bean);

                map.put(bean.getItemClass(), t);
            } else {
                List<InpatientBillResponse> t = new ArrayList<>();
                t.add(bean);
                map.put(bean.getItemClass(), t);
            }
        }
        for (Map.Entry<String, List<InpatientBillResponse>> entry : map.entrySet()) {
            responses.add(new InpatientBillWithClass(entry.getKey(), entry.getValue()));
        }
        return responses;
    }

}
