package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.Appointment;
import com.chinacaring.peixian.patient.client.dao.entity.Inbalance;
import com.chinacaring.peixian.patient.client.dao.entity.Outpatient;
import com.chinacaring.peixian.patient.client.dao.repository.AppointmentRepository;
import com.chinacaring.peixian.patient.client.dao.repository.InbalanceRepository;
import com.chinacaring.peixian.patient.client.dao.repository.OutpatientRepository;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.ClinicPayment;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.InbalancePayment;
import com.chinacaring.peixian.patient.client.dto.front.response.payments.RegisterPayment;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

@Async
@Component
public class PaymentItemsAsync {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private InbalanceRepository inbalanceRepository;

    @Autowired
    private OutpatientRepository outpatientRepository;

    private static DecimalFormat df = new DecimalFormat("#0.00");

    Future<List<RegisterPayment>> getRegisterPayments(String idCard, User user) {

        List<Appointment> appointments = appointmentRepository.findAllByIdCardAndUserIdAndPayStateNot(idCard, user.getId(), Constant.ORDERS_NOT_PAY);
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

    Future<List<InbalancePayment>> getInbalancePayments(String idCard, User user){
        List<Inbalance> inbalances = inbalanceRepository.findAllByIdCardAndUserIdAndPayStateNot(idCard, user.getId(), Constant.ORDERS_PAID);
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

    Future<List<ClinicPayment>> getClinicPayments(String idCard, User user){
        List<Outpatient> outpatients = outpatientRepository.findAllByIdCardAndUserIdAndPayStateNot(idCard, user.getId(), Constant.ORDERS_NOT_PAY);
        List<ClinicPayment> clinicPayments = new ArrayList<>();

        for (Outpatient outpatient : outpatients) {
            ClinicPayment clinicPayment = BeanMapperUtil.map(outpatient, ClinicPayment.class);
            clinicPayment.setPayTime(outpatient.getCreateTime());
            BigDecimal cost = outpatient.getCost();
            if (null != cost) {
                clinicPayment.setTotalCost(df.format(cost.divide(new BigDecimal(100.0))));
            }
            String regDate = clinicPayment.getRegDate();;
            if (null != regDate) {
                clinicPayment.setRegDate(regDate.split(" ")[0]);
            }
            BigDecimal refondCost = outpatient.getRefundCost();
            if (null != refondCost) {
                clinicPayment.setRefundCost(df.format(refondCost.divide(new BigDecimal(100.0))));
            } else {
                clinicPayment.setRefundCost("0.0");
            }

            clinicPayments.add(clinicPayment);
        }

        Collections.reverse(clinicPayments);
        return new AsyncResult<>(clinicPayments);
    }

}
