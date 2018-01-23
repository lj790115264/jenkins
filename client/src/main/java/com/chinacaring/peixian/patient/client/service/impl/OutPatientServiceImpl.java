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
import com.chinacaring.peixian.patient.client.dto.his.request.clinicRecords.ClinicRecordsRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.outPatientMedicalRecords.OutpatientMedicalRecordsRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.outpatientConfirm.OutpatientConfirmRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.prescription.PrescriptionRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.request.unpaidOutpatient.UnpaidOutpatientRequestHis;
import com.chinacaring.peixian.patient.client.dto.his.response.clinicRecords.ClinicRecordsResponseHis;
import com.chinacaring.peixian.patient.client.dto.his.response.outPatientMedicalRecords.ItemType;
import com.chinacaring.peixian.patient.client.dto.his.response.outPatientMedicalRecords.OutpatientMedicalRecordsResponseHis;
import com.chinacaring.peixian.patient.client.dto.his.response.outpatientConfirm.OutpatientConfirmResponseHis;
import com.chinacaring.peixian.patient.client.dto.his.response.prescription.PrescriptionResponseHis;
import com.chinacaring.peixian.patient.client.dto.his.response.unpaidOutpatient.UnpaidOutpatientResponseHis;
import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeRequest;
import com.chinacaring.peixian.patient.client.service.OutPatientService;
import com.chinacaring.peixian.patient.client.utils.RequestUtil;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import com.google.gson.Gson;
import lombok.Data;
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
public class OutPatientServiceImpl implements OutPatientService{

    @Autowired
    private Gson gson;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OutpatientRepository outpatientRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    private DecimalFormat df = new DecimalFormat("#0.00");

    @Override
    public Object getOutpatientRecords(ClinicRecordRequest clinicRecordRequest) throws CommonException, ParseException {

        ClinicRecordsRequestHis clinicRecordsRequestHis = BeanMapperUtil.map(clinicRecordRequest, ClinicRecordsRequestHis.class);
        String soap = RequestUtil.soap(InterfaceName.getClinicRecordsInfo.name(), JaxbXmlUtil.convertToXml(clinicRecordsRequestHis));
        ClinicRecordsResponseHis clinicRecordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap, ClinicRecordsResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, clinicRecordsResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }
        if (Objects.isNull(clinicRecordsResponseHis.getItems()) || clinicRecordsResponseHis.getItems().getItem().isEmpty() ){
            throw new CommonException("暂无相关信息");
        }

        List<ClinicRecordResponse> clinicRecordResponses = BeanMapperUtil.mapList(clinicRecordsResponseHis.getItems().getItem(), ClinicRecordResponse.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        for (ClinicRecordResponse clinicRecordResponse : clinicRecordResponses){
            clinicRecordResponse.setAppointmentTime(sdf.parse(clinicRecordResponse.getRegDate()));
            //普通号 医生信息处理
            if (StringUtils.isEmpty(clinicRecordResponse.getDoctorCode())){
                clinicRecordResponse.setDoctorCode("普通号");
                clinicRecordResponse.setDoctorName("普通号");
            }
        }
        return clinicRecordResponses;
    }

    @Override
    public Object getMedicalRecords(String registerId) throws CommonException {

        OutpatientMedicalRecordsRequestHis outpatientMedicalRecordsRequestHis = new OutpatientMedicalRecordsRequestHis();
        outpatientMedicalRecordsRequestHis.setRegNO(registerId);
        String soap = RequestUtil.soap(InterfaceName.GetOrderInfo.name(), JaxbXmlUtil.convertToXml(outpatientMedicalRecordsRequestHis));
        OutpatientMedicalRecordsResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap, OutpatientMedicalRecordsResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, recordsResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }
        List<ItemType> itemTypes = recordsResponseHis.getItems().getItem();
        if (Objects.isNull(recordsResponseHis.getItems()) || itemTypes.isEmpty() ){
            throw new CommonException("暂无相关信息");
        }

        return BeanMapperUtil.mapList(itemTypes, OutpatientMedicalRecordsResponse.class);
    }

    @Override
    public Object getUnpaidClinicRecords(UnpaidOutpatientRequest unpaidOutpatientRequest) throws CommonException, ParseException {

        UnpaidOutpatientRequestHis unpaidOutpatientRequestHis = BeanMapperUtil.map(unpaidOutpatientRequest, UnpaidOutpatientRequestHis.class);
        String soap = RequestUtil.soap(InterfaceName.getUnpaidClinicInfo.name(), JaxbXmlUtil.convertToXml(unpaidOutpatientRequestHis));
        UnpaidOutpatientResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap, UnpaidOutpatientResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, recordsResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }
        List<com.chinacaring.peixian.patient.client.dto.his.response.unpaidOutpatient.ItemType> itemTypes = recordsResponseHis.getItems().getItem();
        if (Objects.isNull(itemTypes) || itemTypes.isEmpty() ){
            throw new CommonException("暂无相关信息");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        List<UnpaidClinicRecordResponse> unpaidClinicRecordResponses = BeanMapperUtil.mapList(itemTypes, UnpaidClinicRecordResponse.class);
        for (UnpaidClinicRecordResponse unpaidClinicRecordResponse : unpaidClinicRecordResponses){
            unpaidClinicRecordResponse.setAppointmentTime(sdf.parse(unpaidClinicRecordResponse.getRegDate()));
            //普通号 医生信息处理
            if (StringUtils.isEmpty(unpaidClinicRecordResponse.getDoctorCode())){
                unpaidClinicRecordResponse.setDoctorCode("普通号");
                unpaidClinicRecordResponse.setDoctorName("普通号");
            }
        }

        return unpaidClinicRecordResponses;
    }

    @Override
    public Object getPrescription(PrescriptionRequest prescriptionRequest) throws CommonException, ParseException {

        PrescriptionRequestHis prescriptionRequestHis = BeanMapperUtil.map(prescriptionRequest, PrescriptionRequestHis.class);
        String soap = RequestUtil.soap(InterfaceName.getPrescriptionInfo.name(), JaxbXmlUtil.convertToXml(prescriptionRequestHis));
        PrescriptionResponseHis recordsResponseHis = JaxbXmlUtil.convertToJavaBean(soap, PrescriptionResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, recordsResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }
        List<com.chinacaring.peixian.patient.client.dto.his.response.prescription.ItemType> itemTypes = recordsResponseHis.getItems().getItem();
        if (Objects.isNull(itemTypes) || itemTypes.isEmpty() ){
            throw new CommonException("暂无相关信息");
        }


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        List<PrescriptionResponse> prescriptionResponses = BeanMapperUtil.mapList(itemTypes, PrescriptionResponse.class);
        for (PrescriptionResponse prescriptionResponse : prescriptionResponses){
            prescriptionResponse.setTime(sdf.parse(prescriptionResponse.getMoTime()));
            //普通号 医生信息处理
            if (StringUtils.isEmpty(prescriptionResponse.getDoctorCode())){
                prescriptionResponse.setDoctorCode("普通号");
                prescriptionResponse.setDoctorName("普通号");
            }
        }
        return prescriptionResponses;
    }

    @Override
    public Object createOutpatientOrder(OutpatientInfoRequest outpatientInfoRequest, User user) throws CommonException {

        Outpatient outpatient = BeanMapperUtil.map(outpatientInfoRequest, Outpatient.class);
        List<Prescription> prescriptions = outpatientInfoRequest.getPrescriptions();
        if (Objects.equals(prescriptions.size(), 0)){
            throw new CommonException("发票号为空");
        }
        //计算多个单据的总金额 是否等于 totCost
        Integer add = 0;
        Integer totalCost = Integer.valueOf(outpatientInfoRequest.getTotalCost());
        for (Prescription prescription : prescriptions){
            add += Integer.valueOf(prescription.getCost());
        }
        if (!Objects.equals(add, totalCost)){
            throw new CommonException("单据金额总和和总金额不匹配");
        }
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
        chargeRequest.setBody(outpatient.toString());
        chargeRequest.setOpen_id(outpatientInfoRequest.getOpenId());
        //获取支付信息
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        httpHeaders.setContentType(type);
        httpHeaders.add("Authorization", Constant.PAY_BASE64_STRING);

        String param = gson.toJson(chargeRequest);
        HttpEntity<String> httpEntity = new HttpEntity<>(param,httpHeaders);

        String payResult = restTemplate.postForObject(Constant.PAY_URL, httpEntity, String.class);

        outpatientWithId.setPayData(payResult);
        Map payMap= gson.fromJson(payResult, Map.class);
        //更新  order no
        outpatientWithId.setOrderNo(payMap.get("order_no") + "");
        outpatientRepository.save(outpatientWithId);

        //将订单信息保存到 订单主表
        Orders orders = new Orders();
        orders.setOrderNo(outpatientWithId.getOrderNo());
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

    @Override
    public Object doOutpatientConfirm(String orderNo) throws CommonException {

        List<Outpatient> outpatients = outpatientRepository.findByOrderNo(orderNo);
        if (Objects.isNull(outpatients) || outpatients.isEmpty() || outpatients.size() > 1){
            throw new CommonException("orderNo不存在或者不唯一");
        }
        Outpatient outpatient = outpatients.get(0);
        //进入此方法时已经支付成功  设置状态为 已支付
        outpatient.setPayState(Constant.ORDERS_PAID);
        outpatientRepository.saveAndFlush(outpatient);

        List<OutpatientConfirmResult> results = outpatientConfirm(outpatient);
        Boolean refundFlag = false;
        BigDecimal refundCost = new BigDecimal(0);
        List<String> failConfirmedPrescription = new ArrayList<>();
        List<String> invoiceNo = new ArrayList<>();
        List<String> receiptNo = new ArrayList<>();
        for (OutpatientConfirmResult outpatientConfirmResult : results){
            String fen = outpatientConfirmResult.getCost();
            //确认成功
            if (outpatientConfirmResult.getIsSuccess()){
                receiptNo.add(outpatientConfirmResult.getReceiptNo());
                invoiceNo.add(outpatientConfirmResult.getInvoiceNo());
            }else {
                //确认失败
                refundFlag = true;
                refundCost = refundCost.add(new BigDecimal(fen));
                failConfirmedPrescription.add(outpatientConfirmResult.getPrescriptionNo());
            }
        }

        outpatient.setInvoiceNo(org.apache.commons.lang.StringUtils.join(invoiceNo, "|"));
        outpatient.setReceiptNo(org.apache.commons.lang.StringUtils.join(receiptNo, "|"));
        outpatient.setRefundCost(refundCost);
        String failpres = org.apache.commons.lang.StringUtils.join(failConfirmedPrescription, "|");
        outpatient.setFailConfirmedPrescription(failpres);
        outpatientRepository.saveAndFlush(outpatient);

        if (refundFlag){
            outpatient.setConfirmState(Constant.OUTPATIENT_CONFIRM_PARTLY_FAIL);
            outpatientRepository.saveAndFlush(outpatient);
            throw new CommonException("处方号：" + failpres + "确认失败");
        }else {
            outpatient.setConfirmState(Constant.OUTPATIENT_CONFIRM_SUCCESS);
            outpatientRepository.saveAndFlush(outpatient);
        }

        return true;
    }

    @Override
    public Object getOutpatientStatus(Integer id) throws CommonException {

        Outpatient outpatient = outpatientRepository.findOne(id);
        if (Objects.isNull(outpatient)){
            throw new CommonException("暂无相关记录");
        }

        ClinicPayment clinicPayment = BeanMapperUtil.map(outpatient, ClinicPayment.class);
        clinicPayment.setPayTime(outpatient.getCreateTime());
        clinicPayment.setTotalCost(df.format(outpatient.getCost().divide(new BigDecimal(100.0))));
        String regDate = clinicPayment.getRegDate().split(" ")[0];
        clinicPayment.setRegDate(regDate);
        clinicPayment.setRefundCost(df.format(outpatient.getRefundCost().divide(new BigDecimal(100.0))));
        return clinicPayment;
    }

    private List<OutpatientConfirmResult> outpatientConfirm(Outpatient outpatient){


        List<Map> prescriptionList = gson.fromJson(outpatient.getPrescriptionNo(), ArrayList.class);
        OutpatientConfirmRequestHis outpatientConfirmRequestHis = new OutpatientConfirmRequestHis();
        outpatientConfirmRequestHis.setOperCode(outpatient.getOperCode());
        outpatientConfirmRequestHis.setPayMode(outpatient.getPayChannel());
        outpatientConfirmRequestHis.setRegNO(outpatient.getRegisterId());
        outpatientConfirmRequestHis.setTransNo(outpatient.getOrderNo());

        List<OutpatientConfirmResult> results = new ArrayList<>();
        for (Map map : prescriptionList){

            String fen = map.get("cost") + "";
            String prescriptionNo = map.get("prescriptionNo") + "";

            OutpatientConfirmResult outpatientConfirmResult = new OutpatientConfirmResult();
            outpatientConfirmResult.setCost(fen);
            outpatientConfirmResult.setPrescriptionNo(prescriptionNo);
            //处方号
            outpatientConfirmRequestHis.setReciptNO(prescriptionNo);

            String yuan = df.format( Integer.valueOf(fen) / 100.0);
            outpatientConfirmRequestHis.setAmountOfMoney(yuan);
            String soap = RequestUtil.soap(InterfaceName.saveFee.name(), JaxbXmlUtil.convertToXml(outpatientConfirmRequestHis));
            OutpatientConfirmResponseHis outpatientConfirmResponseHis = JaxbXmlUtil.convertToJavaBean(soap, OutpatientConfirmResponseHis.class);
            if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, outpatientConfirmResponseHis.getReturnCode())){
                outpatientConfirmResult.setIsSuccess(false);
            }else {
                outpatientConfirmResult.setIsSuccess(true);
                outpatientConfirmResult.setInvoiceNo(outpatientConfirmResponseHis.getInvoiceNo());
                outpatientConfirmResult.setReceiptNo(outpatientConfirmResponseHis.getReceiptNo());
            }

            results.add(outpatientConfirmResult);
        }

        return results;
    }

    @Data
    public class OutpatientConfirmResult{

        private Boolean isSuccess;
        private String prescriptionNo;
        private String cost;
        private String invoiceNo;
        private String receiptNo;
    }
}

