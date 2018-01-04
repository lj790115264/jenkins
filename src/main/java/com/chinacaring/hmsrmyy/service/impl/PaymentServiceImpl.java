package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.dao.entity.Appointment;
import com.chinacaring.hmsrmyy.dao.entity.Inbalance;
import com.chinacaring.hmsrmyy.dao.entity.Outpatient;
import com.chinacaring.hmsrmyy.dao.repository.AppointmentRepository;
import com.chinacaring.hmsrmyy.dao.repository.InbalanceRepository;
import com.chinacaring.hmsrmyy.dao.repository.OutpatientRepository;
import com.chinacaring.hmsrmyy.dto.front.response.payments.ClinicPayment;
import com.chinacaring.hmsrmyy.dto.front.response.payments.InbalancePayment;
import com.chinacaring.hmsrmyy.dto.front.response.payments.PaymentRecordsResponse;
import com.chinacaring.hmsrmyy.dto.front.response.payments.RegisterPayment;
import com.chinacaring.hmsrmyy.service.PaymentService;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private InbalanceRepository inbalanceRepository;

    @Autowired
    private OutpatientRepository outpatientRepository;

    private static DecimalFormat df = new DecimalFormat("#0.00");

    @Override
    public PaymentRecordsResponse getPaymentRecordsResponse(String idCard, User user) throws ExecutionException, InterruptedException {

        Future<List<RegisterPayment>> registerPayments = getRegisterPayments(idCard, user);
        Future<List<InbalancePayment>> inbalancePayments = getInbalancePayments(idCard, user);
        Future<List<ClinicPayment>> clinicpayments = getClinicPayments(idCard, user);

        while (true){
            if (registerPayments.isDone() && inbalancePayments.isDone() && clinicpayments.isDone()){
                break;
            }
            Thread.sleep(3);
        }

        PaymentRecordsResponse paymentRecordsResponse = new PaymentRecordsResponse();
        paymentRecordsResponse.setInbalancePayments(inbalancePayments.get());
        paymentRecordsResponse.setRegisterPayments(registerPayments.get());
        paymentRecordsResponse.setClinicPayments(clinicpayments.get());
        return paymentRecordsResponse;
    }

    @Async
    Future<List<RegisterPayment>> getRegisterPayments(String idCard, User user) {

        List<Appointment> appointments = appointmentRepository.findAllByIdCardAndUserIdAndPayState(idCard, user.getId(), Constant.ORDERS_PAID);
        List<RegisterPayment> registerPayments = new ArrayList<>();
        for (Appointment appointment : appointments) {

            RegisterPayment registerPayment = new RegisterPayment();
            registerPayment.setRegisterLevelName(appointment.getRegisterLevelName());
            registerPayment.setId(appointment.getId());
            registerPayment.setPayState(appointment.getPayState());
            registerPayment.setRegState(appointment.getRegState());
            registerPayment.setRefundTime(appointment.getRefundTime());
            String doctorName = appointment.getDoctorName();
            registerPayment.setAppointmentTime(appointment.getAppointmentTime());
            registerPayment.setDeptName(appointment.getDeptName());
            registerPayment.setSeeNo(appointment.getSeeNo());
            registerPayment.setDoctorName(doctorName);
            registerPayment.setPayTime(appointment.getCreateTime());
            //分 --> 元
            registerPayment.setCost(df.format(appointment.getCost().divide(new BigDecimal(100))));
            registerPayment.setReceiptNo(appointment.getInvoiceNo());
            registerPayment.setPayChannel(appointment.getPayChannel());
            registerPayment.setPatientName(appointment.getPatientName());

            registerPayments.add(registerPayment);

        }
        Collections.reverse(registerPayments);
        return new AsyncResult<>(registerPayments);
    }

    @Async
    Future<List<InbalancePayment>> getInbalancePayments(String idCard, User user){
        List<Inbalance> inbalances = inbalanceRepository.findAllByIdCardAndUserIdAndPayState(idCard, user.getId(), Constant.ORDERS_PAID);
        List<InbalancePayment> inbalancePayments = new ArrayList<>();
        for (Inbalance inbalance : inbalances){

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

            inbalancePayments.add(inbalancePayment);
        }

        Collections.reverse(inbalancePayments);
        return new AsyncResult<>(inbalancePayments);
    }

    @Async
    Future<List<ClinicPayment>> getClinicPayments(String idCard, User user){
        List<Outpatient> outpatients = outpatientRepository.findAllByIdCardAndUserIdAndPayState(idCard, user.getId(), Constant.ORDERS_PAID);
        List<ClinicPayment> clinicPayments = new ArrayList<>();

        for (Outpatient outpatient : outpatients) {
            ClinicPayment clinicPayment = BeanMapperUtil.map(outpatient, ClinicPayment.class);
            clinicPayment.setPayTime(outpatient.getCreateTime());
            clinicPayment.setTotalCost(df.format(outpatient.getCost().divide(new BigDecimal(100.0))));
            String regDate = clinicPayment.getRegDate().split(" ")[0];
            clinicPayment.setRegDate(regDate);
            clinicPayment.setRefundCost(df.format(outpatient.getRefundCost().divide(new BigDecimal(100.0))));

            clinicPayments.add(clinicPayment);
        }

        Collections.reverse(clinicPayments);
        return new AsyncResult<>(clinicPayments);
    }
}
