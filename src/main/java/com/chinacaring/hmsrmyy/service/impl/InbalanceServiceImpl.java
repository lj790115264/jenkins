package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dao.entity.Inbalance;
import com.chinacaring.hmsrmyy.dao.entity.Orders;
import com.chinacaring.hmsrmyy.dao.repository.InbalanceRepository;
import com.chinacaring.hmsrmyy.dao.repository.OrdersRepository;
import com.chinacaring.hmsrmyy.dto.front.request.InbalanceInfoRequest;
import com.chinacaring.hmsrmyy.dto.front.response.OrderResponse;
import com.chinacaring.hmsrmyy.dto.his.request.confirmInbalance.ConfirmInbalanceRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.confirmInbalance.ConfirmInbalanceResponseHis;
import com.chinacaring.hmsrmyy.dto.pingpp.ChargeRequest;
import com.chinacaring.hmsrmyy.service.InbalanceService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
import com.chinacaring.user.dao.entity.User;
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
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class InbalanceServiceImpl implements InbalanceService{

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static DecimalFormat df = new DecimalFormat("#0.00");

    @Autowired
    private InbalanceRepository inbalanceRepository;

    @Autowired
    private Gson gson;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Object createInbalanceOrder(InbalanceInfoRequest inbalanceInfoRequest, User user) throws ParseException {
        Inbalance inbalance = new Inbalance();
        inbalance.setName(inbalanceInfoRequest.getName());
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
        chargeRequest.setBody(inbalance.toString());
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
        confirmInbalanceRequestHis.setName(inbalance.getName());
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

}
