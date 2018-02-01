package com.chinacaring.peixian.patient.client.async;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.Appointment;
import com.chinacaring.peixian.patient.client.dto.front.response.AppointmentRecord.AppointmentRecord;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.wsdl.reponse.get_regstate.GetRegStateSoap;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.logging.Logger;

@Async
@Component
public class AppointRecord {

    private Logger logger = Logger.getLogger(this.getClass().getName());
    @Autowired
    private QuyiServiceNo service;
    private static DecimalFormat df = new DecimalFormat("#0.00");

    public Future<String> state(Appointment appointment) {

        String registerStatus;
        try {
            String soap = new QuyiServiceNo().getQuyiServiceNoSoap().getRegState(appointment.getRegisterId());
            GetRegStateSoap regSoap;
            try {
                regSoap = JaxbXmlUtil.convertToJavaBean(soap, GetRegStateSoap.class);
                registerStatus = regSoap.getData().getGetRegState().getState();
            } catch (Exception e) {
                throw new SoapException("获取挂号状态失败", soap, appointment.getRegisterId());
            }

            if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, regSoap.getResult().getReturnCode())) {
                throw new SoapException("获取挂号状态失败", regSoap.getResult().getReturnDesc(), appointment
                        .getRegisterId());
            }
            return new AsyncResult(registerStatus);

        } catch (CommonException e) {
            logger.info("获取挂号状态失败" + appointment.getRegisterId());
            return new AsyncResult<>(null);
        }
    }
}
