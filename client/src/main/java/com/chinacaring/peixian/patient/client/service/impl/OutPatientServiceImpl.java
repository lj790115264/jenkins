package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.config.InterfaceName;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.entity.Outpatient;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.dao.repository.OutpatientRepository;
import com.chinacaring.peixian.patient.client.dto.front.request.*;
import com.chinacaring.peixian.patient.client.dto.front.response.*;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.ClinicPayment;
import com.chinacaring.peixian.patient.client.dto.his.request.outPatientMedicalRecords
        .OutpatientMedicalRecordsRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.outpatientConfirm.OutpatientConfirmRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.response.outPatientMedicalRecords.ItemType;
import com.chinacaring.peixian.patient.client.dto.his.response.outPatientMedicalRecords
        .OutpatientMedicalRecordsResponseHis;
import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeRequest;
import com.chinacaring.peixian.patient.client.exception.MyException;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.OutPatientService;
import com.chinacaring.peixian.patient.client.utils.RequestUtil;
import com.chinacaring.peixian.patient.client.wsdl.reponse.feelist_by_cliniccode.FeeTable;
import com.chinacaring.peixian.patient.client.wsdl.reponse.feelist_by_cliniccode.GetFeeListSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.reginfo_by_cardno_or_name.RegSoap;
import com.chinacaring.peixian.patient.client.wsdl.reponse.reginfo_by_cardno_or_name.RegTable;
import com.chinacaring.peixian.patient.client.wsdl.reponse.save_fee.SaveFeeSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import com.google.gson.Gson;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OutPatientServiceImpl implements OutPatientService {

    @Autowired
    private Gson gson;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OutpatientRepository outpatientRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private QuyiServiceNo serviceNo;

    private DecimalFormat df = new DecimalFormat("#0.00");
    private Logger logger = LoggerFactory.getLogger(OutPatientServiceImpl.class);

    private Integer interVal(String begin, String end) throws CommonException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date beginDate = sdf.parse(begin);
            Date endDate = sdf.parse(end);
            return Math.toIntExact((endDate.getTime() - beginDate.getTime()) / (1000 * 3600 * 24));
        } catch (ParseException e) {
            throw new CommonException("时间格式不对");
        }

    }

    @Override
    public Object getOutpatientRecords(ClinicRecordRequest clinicRecordRequest) throws CommonException, ParseException, SoapException {


        Integer interval = interVal(clinicRecordRequest.getBeginTime(), clinicRecordRequest.getEndTime());
        String res = serviceNo.getQuyiServiceNoSoap().getRegInfoByCardNoOrName(clinicRecordRequest.getPatientCode(),
                clinicRecordRequest.getName(), String.valueOf(interval));
        RegSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, RegSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂无门诊记录!!", res, clinicRecordRequest.getPatientCode() + "-" + clinicRecordRequest
                    .getName() + "-1");
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("暂无门诊记录!", soap.getResult().getReturnDesc(), clinicRecordRequest.getPatientCode()
                    + "-" + clinicRecordRequest
                    .getName() + "-1");
        }
        if (Objects.isNull(soap.getData().getRegTable()) || soap.getData().getRegTable().isEmpty()) {
            throw new CommonException("暂无门诊记录");
        }

        List<ClinicRecordResponse> clinicRecordResponses = BeanMapperUtil.mapList(soap.getData().getRegTable(),
                ClinicRecordResponse.class);
        for (ClinicRecordResponse clinicRecordResponse : clinicRecordResponses) {
            //普通号 医生信息处理
            if (StringUtils.isEmpty(clinicRecordResponse.getDoctorCode())) {
                clinicRecordResponse.setDoctorCode("普通号");
                clinicRecordResponse.setDoctorName("普通号");
            }
        }
        return clinicRecordResponses;
    }

    @Override
    public Object getMedicalRecords(String registerId) throws CommonException {

        OutpatientMedicalRecordsRequestHis outpatientMedicalRecordsRequestHis = new
                OutpatientMedicalRecordsRequestHis();
        outpatientMedicalRecordsRequestHis.setRegNO(registerId);
        String soap = RequestUtil.soap(InterfaceName.GetOrderInfo.name(), JaxbXmlUtil.convertToXml
                (outpatientMedicalRecordsRequestHis));
        OutpatientMedicalRecordsResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap,
                OutpatientMedicalRecordsResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, recordsResponseHis.getReturnCode())) {
            throw new CommonException("暂无相关信息");
        }
        List<ItemType> itemTypes = recordsResponseHis.getItems().getItem();
        if (Objects.isNull(recordsResponseHis.getItems()) || itemTypes.isEmpty()) {
            throw new CommonException("暂无相关信息");
        }

        List<OutpatientMedicalRecordsResponse> outpatientMedicalRecordsResponse = BeanMapperUtil.mapList(itemTypes, OutpatientMedicalRecordsResponse.class);

        return outpatientMedicalRecordsResponse;
    }

    @Override
    public Object getUnpaidClinicRecords(UnpaidOutpatientRequest unpaidOutpatientRequest) throws CommonException,
            ParseException, SoapException {

        String res = serviceNo.getQuyiServiceNoSoap().getRegInfoByCardNoOrName(unpaidOutpatientRequest.getPatientCode(),
                unpaidOutpatientRequest.getName(), "1");
        RegSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, RegSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", res, unpaidOutpatientRequest.getPatientCode() + "-" +
                    unpaidOutpatientRequest.getName());
        }

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("暂时没有数据哦～", soap.getResult().getReturnDesc(), unpaidOutpatientRequest
                    .getPatientCode() + "-" +
                    unpaidOutpatientRequest.getName());
        }
        // 所有的门诊记录记录
        List<RegTable> itemTypes = soap.getData().getRegTable();
        // 未缴费的门诊记录，初始化
        List<RegTable> unPayItemTypes = new ArrayList<>();
        if (Objects.isNull(itemTypes) || itemTypes.isEmpty()) {
            throw new CommonException("暂时没有数据哦～");
        }

        for (RegTable item : itemTypes) {

            String mxRes = serviceNo.getQuyiServiceNoSoap().getFeeListByClinicCode(item.getCLINICCODE(), "0");
            GetFeeListSoap mxSoap;
            try {
                mxSoap = JaxbXmlUtil.convertToJavaBean(mxRes, GetFeeListSoap.class);
                // 如果有未缴费的处方的话，就把查询处方的门诊流水号添加进未缴费的里面
                List<FeeTable> regTables = mxSoap.getData().getFeeTable();
                if (null != regTables && !regTables.isEmpty()) {
                    unPayItemTypes.add(item);
                }
            } catch (Exception e) {

            }
        }

        List<UnpaidClinicRecordResponse> unpaidClinicRecordResponses = BeanMapperUtil.mapList(unPayItemTypes,
                UnpaidClinicRecordResponse.class);
        unpaidClinicRecordResponses.stream().forEach(item -> {
            if (null == item.getDoctorName()) {
                item.setDoctorName("普通号");
            }
        });
        return unpaidClinicRecordResponses;
    }

    @Override
    public Object getPrescription(PrescriptionRequest prescriptionRequest) throws CommonException, ParseException, SoapException {

        String mxRes = serviceNo.getQuyiServiceNoSoap().getFeeListByClinicCode(prescriptionRequest.getRegNO(),
                prescriptionRequest.getIsFee());
        GetFeeListSoap mxSoap;
        try {
            mxSoap = JaxbXmlUtil.convertToJavaBean(mxRes, GetFeeListSoap.class);
        } catch (Exception e) {
            throw new SoapException("暂时没有数据哦～", mxRes, prescriptionRequest.getRegNO() + "-" + prescriptionRequest
                    .getIsFee());
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, mxSoap.getResult().getReturnCode())) {
            throw new SoapException("暂时没有数据哦～", mxSoap.getResult().getReturnDesc(), prescriptionRequest.getRegNO() +
                    "-" + prescriptionRequest.getIsFee());
        }

        List<PrescriptionResponse> prescriptionResponses = BeanMapperUtil.mapList(mxSoap.getData().getFeeTable(),
                PrescriptionResponse.class);

        Double totCost = 0.0;
        for (PrescriptionResponse prescriptionResponse : prescriptionResponses){
            //普通号 医生信息处理
            if (StringUtils.isEmpty(prescriptionResponse.getDoctorName())){
//                prescriptionResponse.setDoctorCode("普通号");
                prescriptionResponse.setDoctorName("普通号");
            }
            Double unitPrice = Double.valueOf(prescriptionResponse.getUnitPrice());
            Double unitTotCost = Double.valueOf(prescriptionResponse.getTotCost());
            totCost += unitTotCost;
            prescriptionResponse.setTotCost(String.format("%.2f", unitTotCost));
            prescriptionResponse.setUnitPrice(String.format("%.2f", unitPrice));

        }
        return new PrescriptionTotalResponse(String.format("%.2f", totCost), prescriptionResponses);
    }

    @Override
    public Object createOutpatientOrder(OutpatientInfoRequest outpatientInfoRequest, User user) throws CommonException {

        if (null == outpatientInfoRequest.getDoctorName()) {
            outpatientInfoRequest.setDoctorName("普通号");
        }
        Outpatient outpatient = BeanMapperUtil.map(outpatientInfoRequest, Outpatient.class);
        List<Prescription> prescriptions = outpatientInfoRequest.getPrescriptions();
        if (Objects.equals(prescriptions.size(), 0)) {
            throw new CommonException("发票号为空");
        }
        //计算多个单据的总金额 是否等于 totCost
        Integer add = 0;
        Integer totalCost = Integer.valueOf(outpatientInfoRequest.getTotalCost());


        for (Prescription prescription : prescriptions) {
            add += Integer.valueOf(prescription.getCost());
        }
        if (!Objects.equals(add, totalCost)) {
            throw new CommonException("单据金额总和和总金额不匹配");
        }

        //
//        totalCost = 1;
        //

        outpatient.setCost(new BigDecimal(outpatientInfoRequest.getTotalCost()));
        outpatient.setPrescriptionNo(gson.toJson(prescriptions));
        outpatient.setCreateTime(new Date());
        outpatient.setUserId(user.getId());
        outpatient.setPayState(Constant.ORDERS_NOT_PAY);
        outpatient.setConfirmState(Constant.OUTPATIENT_CONFIRM_NOT_YET);
        Outpatient outpatientWithId = outpatientRepository.save(outpatient);

        ChargeRequest chargeRequest = new ChargeRequest();
        chargeRequest.setAmount(totalCost);

        chargeRequest.setChannel(outpatientInfoRequest.getPayChannel());
        //订单信息 做处理
        chargeRequest.setSubject(Constant.CHARGE_SUBJECT_OUTPATIENT);
        chargeRequest.setBody(Constant.CHARGE_SUBJECT_OUTPATIENT);
        chargeRequest.setOpen_id(outpatientInfoRequest.getOpenId());
        //获取支付信息
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        httpHeaders.setContentType(type);
        httpHeaders.add("Authorization", Constant.PAY_BASE64_STRING);

        String param = gson.toJson(chargeRequest);
        HttpEntity<String> httpEntity = new HttpEntity<>(param, httpHeaders);

        String payResult = restTemplate.postForObject(Constant.PAY_URL, httpEntity, String.class);

        outpatientWithId.setPayData(payResult);
        Map payMap = gson.fromJson(payResult, Map.class);
        //更新  order no
        outpatientWithId.setOrderNo(payMap.get("order_no") + "");
        outpatientRepository.save(outpatientWithId);

        //将订单信息保存到 订单主表
        Orders orders = new Orders();
        orders.setOrderNo(outpatientWithId.getOrderNo());
        orders.setChargeId(payMap.get("id") + "");
        orders.setCreateTime(new Date());
        orders.setUpdateTime(new Date());
        orders.setUserId(user.getId());
        orders.setUsername(user.getUsername());
        orders.setPayChannel(outpatientWithId.getPayChannel());
        orders.setAmount(totalCost);
        orders.setType(Constant.ORDERS_CLINIC);
        orders.setTypeNo(String.valueOf(outpatientWithId.getId()));
        ordersRepository.save(orders);

        return new OrderResponse(outpatientWithId.getId(), payResult);
    }

    synchronized Outpatient checkOrder(String orderNo) throws CommonException {
        List<Outpatient> outpatients = outpatientRepository.findByOrderNo(orderNo);
        if (Objects.isNull(outpatients) || outpatients.isEmpty() || outpatients.size() > 1) {
            return null;
        }
        Outpatient outpatient = outpatients.get(0);

        if (!Constant.ORDERS_NOT_PAY.equals(outpatient.getPayState())) {
            return null;
        }
        return outpatient;
    }

    @Override
    public Boolean doOutpatientConfirm(String orderNo) throws CommonException, MyException {

        Outpatient outpatient = checkOrder(orderNo);
        if (null == outpatient) {
            return false;
        }

        //进入此方法时已经支付成功  设置状态为 已支付
        outpatient.setPayState(Constant.ORDERS_PAID);
        outpatientRepository.saveAndFlush(outpatient);

        OutpatientConfirmResult outpatientConfirmResult;
        try {
            outpatientConfirmResult = outpatientConfirm(outpatient);
            outpatient.setInvoiceNo(outpatientConfirmResult.getInvoiceNo());
            outpatient.setReceiptNo(outpatientConfirmResult.getReceiptNo());
            outpatient.setWindowName(outpatientConfirmResult.getWindowName());
            outpatient.setConfirmState(Constant.OUTPATIENT_CONFIRM_SUCCESS);
            outpatientRepository.saveAndFlush(outpatient);
            try {
                Orders byOrderNo = ordersRepository.findByOrderNo(outpatient.getOrderNo());
                byOrderNo.setInvoiceNo(outpatientConfirmResult.getInvoiceNo());
                ordersRepository.save(byOrderNo);
            }catch (Exception ignore){
            }

            return true;
        } catch (SoapException e) {
            outpatient.setConfirmState(Constant.OUTPATIENT_CONFIRM_FAIL);
            outpatientRepository.saveAndFlush(outpatient);
            throw e;
        }

    }

    @Override
    public Object getOutpatientStatus(Integer id) throws CommonException {

        Outpatient outpatient = outpatientRepository.findOne(id);
        if (Objects.isNull(outpatient)) {
            throw new CommonException("暂时没有数据哦～");
        }

        ClinicPayment clinicPayment = BeanMapperUtil.map(outpatient, ClinicPayment.class);
        clinicPayment.setPayTime(outpatient.getCreateTime());
        clinicPayment.setTotalCost(df.format(outpatient.getCost().divide(new BigDecimal(100.0))));
        String regDate = clinicPayment.getRegDate();
        if (null != regDate) {
            clinicPayment.setRegDate(regDate.split(" ")[0]);
        }
        BigDecimal refondCost = outpatient.getRefundCost();
        if (null != refondCost) {
            clinicPayment.setRefundCost(df.format(refondCost.divide(new BigDecimal(100.0))));
        } else {
            clinicPayment.setRefundCost("0.0");
        }
        if (null == clinicPayment.getDoctorName()) {
            clinicPayment.setDoctorName("普通号");
        }
        return clinicPayment;
    }

    private OutpatientConfirmResult outpatientConfirm(Outpatient outpatient) throws MyException {

        List<Map> prescriptionList = gson.fromJson(outpatient.getPrescriptionNo(), ArrayList.class);
        OutpatientConfirmRequestHis outpatientConfirmRequestHis = new OutpatientConfirmRequestHis();
        outpatientConfirmRequestHis.setOperCode(outpatient.getOperCode());
        outpatientConfirmRequestHis.setPayMode(outpatient.getPayChannel());
        outpatientConfirmRequestHis.setRegNO(outpatient.getRegisterId());
        outpatientConfirmRequestHis.setTransNo(outpatient.getOrderNo());
        String payChannel = "WX";
        if (prescriptionList.size() == 0 || null == prescriptionList) {
            throw new MyException("门诊结算失败", "没有处方数据");
        }
        String prescriptionCollection = prescriptionList.stream().map(item -> item.get("prescriptionNo") + "").
                reduce((a, b) -> a + "|" + b).get();
        Integer fen = prescriptionList.stream().map(item -> Integer.valueOf(item.get("cost") + "")).reduce(0,
                Integer::sum);
        String yuan = df.format(Integer.valueOf(fen) / 100.0);
        String res = serviceNo.getQuyiServiceNoSoap().saveFee(outpatient.getRegisterId(), prescriptionCollection, outpatient
                .getOperCode(), payChannel,  yuan);
        SaveFeeSoap soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, SaveFeeSoap.class);
        } catch (Exception e) {
            throw new SoapException("门诊结算失败", res, outpatient.getRegisterId() + "-" + prescriptionCollection + "-" + outpatient
                    .getOperCode() + "-" + outpatient.getPayChannel() + "-" + yuan);
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("门诊结算失败", soap.getResult().getReturnDesc(), outpatient.getRegisterId() + "-" + prescriptionCollection + "-" + outpatient
                    .getOperCode() + "-" + outpatient.getPayChannel() + "-" + yuan);
        }

        OutpatientConfirmResult outpatientConfirmResult = new OutpatientConfirmResult();
        outpatientConfirmResult.setInvoiceNo(soap.getData().getSaveFeeSoap().getINVOICENO());
        outpatientConfirmResult.setReceiptNo(soap.getData().getSaveFeeSoap().getINVOICENO());
        outpatientConfirmResult.setPrescriptionNo(prescriptionCollection);
        outpatientConfirmResult.setWindowName(soap.getData().getSaveFeeSoap().getWINDOWNAME());
        outpatientConfirmResult.setIsSuccess(true);
        outpatientConfirmResult.setCost(fen + "");

        return outpatientConfirmResult;
    }

    @Data
    public class OutpatientConfirmResult {

        private Boolean isSuccess;
        private String prescriptionNo;
        private String cost;
        private String invoiceNo;
        private String receiptNo;
        private String windowName;

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public void setIsSuccess(Boolean success) {
            isSuccess = success;
        }

        public String getPrescriptionNo() {
            return prescriptionNo;
        }

        public void setPrescriptionNo(String prescriptionNo) {
            this.prescriptionNo = prescriptionNo;
        }

        public String getCost() {
            return cost;
        }

        public void setCost(String cost) {
            this.cost = cost;
        }

        public String getInvoiceNo() {
            return invoiceNo;
        }

        public void setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
        }

        public String getReceiptNo() {
            return receiptNo;
        }

        public void setReceiptNo(String receiptNo) {
            this.receiptNo = receiptNo;
        }

        public String getWindowName() {
            return windowName;
        }

        public void setWindowName(String windowName) {
            this.windowName = windowName;
        }
    }
}

