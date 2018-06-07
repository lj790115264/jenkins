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
import com.chinacaring.peixian.patient.client.dto.his.response.confirmInbalance.ConfirmInbalanceResponseHis;
import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeRequest;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.InbalanceService;
import com.chinacaring.peixian.patient.client.utils.RequestUtil;
import com.chinacaring.peixian.patient.client.utils.ValidateUtils;
import com.chinacaring.peixian.patient.client.wsdl.reponse.get_in_hos_patient_info.Item;
import com.chinacaring.peixian.patient.client.wsdl.reponse.get_in_hos_patient_info.Queryinhospatient;
import com.chinacaring.peixian.patient.client.wsdl.reponse.in_hos_patient_inbalance_recharge.Response;
import com.chinacaring.peixian.patient.client.wsdl.reponse.query_prefeemaster.QueryPrefeeMasterSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.queryin_maininfo.QueryInMainInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.queryin_maininfo.QueryInMainInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.queryin_mainmxinfo.QueryInMainMxInfoSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
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
import java.util.stream.Collectors;

@Service
public class InbalanceServiceImpl implements InbalanceService {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static DecimalFormat df = new DecimalFormat("#0.00");

    private final InbalanceRepository inbalanceRepository;

    private final Gson gson;

    private final RestTemplate restTemplate;


    private final OrdersRepository ordersRepository;

    @Autowired
    private QuyiServiceNo service;

    @Autowired
    public InbalanceServiceImpl(InbalanceRepository inbalanceRepository, Gson gson, RestTemplate restTemplate,
                                OrdersRepository ordersRepository) {
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
        HttpEntity<String> httpEntity = new HttpEntity<>(param, httpHeaders);
        String payResult = null;
        try {
            payResult = restTemplate.postForObject(Constant.PAY_URL, httpEntity, String.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //保存  返回的所有数据
        inbalanceWithId.setPayData(payResult);
        Map payMap = gson.fromJson(payResult, Map.class);
        //更新  order no
        String orderNo = payMap.get("order_no") + "";
        inbalanceWithId.setOrderNo(orderNo);
        inbalanceRepository.saveAndFlush(inbalanceWithId);

        //将 订单信息 保存到 订单总表
        Orders orders = new Orders();
        orders.setOrderNo(orderNo);
        orders.setChargeId(payMap.get("id") + "");
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

    synchronized Inbalance checkOrder(String orderNO) throws CommonException {
        List<Inbalance> inbalances = inbalanceRepository.findByOrderNo(orderNO);
        if (Objects.isNull(inbalances) || inbalances.isEmpty() || inbalances.size() > 1) {
            return null;
        }
        Inbalance inbalance = inbalances.get(0);

        if (!Constant.ORDERS_NOT_PAY.equals(inbalance.getPayState())) {
            return null;
        }

        return inbalance;
    }

    @Override
    public Boolean doInbalanceConfirm(String orderNO) throws CommonException {

        Inbalance inbalance = checkOrder(orderNO);
        if (null == inbalance) {
            return false;
        }

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

        String res = service.getQuyiServiceNoSoap()
                .inhosPatientInbalanceRecharge(inbalance.getInpatientCode(),
                        inbalance.getPatientName(),
                        "QY",
                        "WX",
                        df.format(inbalance.getCost().divide(new BigDecimal(100))),
                        sdf.format(new Date()),
                        inbalance.getOrderNo());

        Response soap;

        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, Response.class);
        } catch (Exception e) {
            inbalanceWithId.setConfirmState(Constant.INBALANCE_CONFIRM_FAIL);
            inbalanceRepository.saveAndFlush(inbalanceWithId);
            throw new SoapException("暂时没有数据哦～", res, inbalance.getInpatientCode() + "-" +
                    inbalance.getPatientName() + "-" +
                    inbalance.getOperCode() + "-" +
                    inbalance.getPayChannel() + "-" +
                    df.format(inbalance.getCost().divide(new BigDecimal(100))) + "-" +
                    sdf.format(new Date()) + "-" +
                    inbalance.getOrderNo());
        }
        if (null == soap) {
            inbalanceWithId.setConfirmState(Constant.INBALANCE_CONFIRM_FAIL);
            inbalanceRepository.saveAndFlush(inbalanceWithId);
            throw new SoapException("暂时没有数据哦～", res, inbalance.getInpatientCode() + "-" +
                    inbalance.getPatientName() + "-" +
                    inbalance.getOperCode() + "-" +
                    inbalance.getPayChannel() + "-" +
                    df.format(inbalance.getCost().divide(new BigDecimal(100))) + "-" +
                    sdf.format(new Date()) + "-" +
                    inbalance.getOrderNo());
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getCode())) {
            inbalanceWithId.setConfirmState(Constant.INBALANCE_CONFIRM_FAIL);
            inbalanceRepository.saveAndFlush(inbalanceWithId);
            throw new SoapException("暂时没有数据哦～", soap.getMessage(), inbalance.getInpatientCode() + "-" +
                    inbalance.getPatientName() + "-" +
                    inbalance.getOperCode() + "-" +
                    inbalance.getPayChannel() + "-" +
                    df.format(inbalance.getCost().divide(new BigDecimal(100))) + "-" +
                    sdf.format(new Date()) + "-" +
                    inbalance.getOrderNo());
        }

        inbalanceWithId.setConfirmState(Constant.INBALANCE_CONFIRM_SUCCESS);
        inbalanceWithId.setInvoiceNo(soap.getData().getReceiptNum());
        inbalanceWithId.setReceiptNo(soap.getData().getReceiptNum());

        //保存his结果
        inbalanceWithId.setHisResult(res);
        inbalanceRepository.saveAndFlush(inbalanceWithId);
        try {
            Orders byOrderNo = ordersRepository.findByOrderNo(inbalance.getOrderNo());
            byOrderNo.setInvoiceNo(inbalance.getInvoiceNo());
            ordersRepository.save(byOrderNo);
        }catch (Exception ignore){
        }

        return true;
    }

    boolean compareTime(String beginTime, String endTime) {
        if (null == beginTime) {
            return false;
        }
        if (null == endTime) {
            return true;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            Date beginDate = sdf.parse(beginTime);
            Date endDate = sdf.parse(endTime);
            if (beginDate.compareTo(endDate) == -1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public InbalanceResponse getInbalance(String name, String idCard) throws CommonException {

        String res = service.getQuyiServiceNoSoap().getInhosPatientInfo("11", idCard, name);
        Queryinhospatient soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, Queryinhospatient.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, name + "-" + idCard);
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("暂时没有数据哦～", soap.getResult().getReturnDesc(), name + "-" + idCard);
        }

        Item item = soap.getData().getItem();
        InbalanceResponse response = new InbalanceResponse();
        response.setPatientId(item.getInpatientCode());
        response.setInbalance(item.getBalance());
        response.setDeptCode(item.getDeptCode());
        response.setDeptName(item.getDeptName());
        response.setInhosTime(item.getInhosTime().replaceAll("/(\\d)(?!\\d)", "/0$1")
                                                    .replace("/", "-"));
        response.setInpatientNo(item.getInhosPatientSerial());
        response.setInpatientSeq(item.getInhosPatientSerial());
        return response;
    }


    public InbalanceResponse getInbalanceOld(String name, String idCard) throws CommonException {

        String res = service.getQuyiServiceNoSoap().queryInMainInfo(name, idCard, "ALL");
        QueryInMainInfoSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, QueryInMainInfoSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, name + "-" + idCard + "-" + "ALL");
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("暂时没有数据哦～", soap.getResult().getReturnDesc(), name + "-" + idCard + "-" + "ALL");
        }
        List<QueryInMainInfo> queryInMainInfos = soap.getData().getQueryInMainInfo().stream()
                .filter(item -> compareTime(item.getINHOSPITALDATE(), item.getOUTHOSPITALDATE())).collect(Collectors
                        .toList());

        if (queryInMainInfos.size() == 0) {
            throw new SoapException("暂时没有数据哦～", "出院时间不为null的去掉后没有了", name + "-" + idCard + "-" + "ALL");
        }
        QueryInMainInfo queryInMainInfo;
        // 如果不止一个出院日期为null ,取在院时间最近的。
        if (queryInMainInfos.size() > 1) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss");
            // 把时间近的放前面
            queryInMainInfos.sort((a, b) -> {
                try {
                    Date _a = sdf.parse(a.getINHOSPITALDATE());
                    Date _b;
                    try {
                        _b = sdf.parse(b.getINHOSPITALDATE());
                    } catch (ParseException e) {
                        // 如果后一个格式错误就不交换
                        return -1;
                    }
                    return _b.compareTo(_a);
                } catch (ParseException e) {
                    // 若果前一个格式错误就交换
                    e.printStackTrace();
                    return 1;
                }
            });
        }
        queryInMainInfo = queryInMainInfos.get(0);
        String inhosTime = queryInMainInfo.getINHOSPITALDATE();
        queryInMainInfo.setINHOSPITALDATE(ValidateUtils.soapTime(inhosTime));
        InbalanceResponse inbalanceResponse = BeanMapperUtil.map(queryInMainInfo, InbalanceResponse.class);

//        String prefeeRes = service.getQuyiServiceNoSoap().queryPrefeeMaster(inbalanceResponse.getInpatientSeq());
//        QueryPrefeeMasterSoap prefeeSoap;
//        try {
//            prefeeSoap = JaxbXmlUtil.convertToJavaBean(prefeeRes, QueryPrefeeMasterSoap.class);
//        } catch (Exception e) {
//            throw new SoapException("暂无结算数据!!", res, name + "-" + idCard + "-" + "ALL");
//        }
//        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, prefeeSoap.getResult().getReturnCode())) {
//            throw new SoapException("暂无结算数据", soap.getResult().getReturnDesc(), name + "-" + idCard + "-" + "ALL");
//        }
//        inbalanceResponse.setInbalance(prefeeSoap.getData().getQueryPrefeeMaster().getChargeamount());

        return inbalanceResponse;
    }

    @Override
    public Object getInbalanceStatus(Integer id) throws CommonException {
        Inbalance inbalance = inbalanceRepository.findOne(id);
        if (Objects.isNull(inbalance)) {
            throw new CommonException("暂时没有数据哦～");
        }

        InbalancePayment inbalancePayment = new InbalancePayment();
        inbalancePayment.setConfirmState(inbalance.getConfirmState());
        inbalancePayment.setPayState(inbalance.getPayState());
        inbalancePayment.setRefundTime(inbalance.getRefundTime());
        inbalancePayment.setCost(df.format(inbalance.getCost().divide(new BigDecimal(100.0))));
        inbalancePayment.setPayment(df.format(inbalance.getCost().divide(new BigDecimal(100.0))));
        inbalancePayment.setDeptName(inbalance.getDeptName());
        inbalancePayment.setId(inbalance.getId());
        inbalancePayment.setInbalance(df.format(inbalance.getInbalance().divide(new BigDecimal(100.0))));
        inbalancePayment.setInhosTime(inbalance.getInhosTime());
        inbalancePayment.setInpatientCode(inbalance.getInpatientCode());
        inbalancePayment.setPatientName(inbalance.getPatientName());
        inbalancePayment.setPayTime(inbalance.getCreateTime());
        inbalancePayment.setInpatientSerialCode(inbalance.getReceiptNo());
        return inbalancePayment;
    }

    @Override
    public Object getInbalanceList(String name, String idCard) throws CommonException {

        InbalanceResponse inbalanceResponse = getInbalanceOld(name, idCard);

        String res = service.getQuyiServiceNoSoap().queryInMainMxInfo(inbalanceResponse.getPatientId(),
                inbalanceResponse.getInpatientSeq(),
                inbalanceResponse.getInpatientNo());
        QueryInMainMxInfoSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, QueryInMainMxInfoSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, inbalanceResponse.getPatientId() + "-" + inbalanceResponse
                    .getInpatientSeq() + "-" +
                    inbalanceResponse.getInpatientNo());
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("暂时没有数据哦～", soap.getResult().getReturnDesc(), inbalanceResponse.getPatientId()
                    + "-" + inbalanceResponse
                    .getInpatientSeq() + "-" + inbalanceResponse.getInpatientNo());
        }
        List<InpatientBillResponse> inpatientBillResponses = BeanMapperUtil.mapList(soap.getData()
                .getQueryInMainMxInfo(), InpatientBillResponse.class);
        for (InpatientBillResponse inpatientBillResponse : inpatientBillResponses) {
            inpatientBillResponse.setDate(ValidateUtils.soapTime(inpatientBillResponse.getDate(), "yyyy-MM-dd"));
            if (0.0 != inpatientBillResponse.getAmount()) {
                inpatientBillResponse.setUnitPrice(Double.valueOf(inpatientBillResponse.getTotalCost()) /
                        Double.valueOf(inpatientBillResponse.getAmount()));
            }
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
        Collections.reverse(dateAndClasses);
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
