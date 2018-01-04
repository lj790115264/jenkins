package com.chinacaring.hmsrmyy.dto.front.response.payments;

import java.util.List;

public class PaymentRecordsResponse {

    List<RegisterPayment> registerPayments;

    List<InbalancePayment> inbalancePayments;

    List<ClinicPayment> clinicPayments;

    public PaymentRecordsResponse() {
    }

    public List<RegisterPayment> getRegisterPayments() {
        return registerPayments;
    }

    public void setRegisterPayments(List<RegisterPayment> registerPayments) {
        this.registerPayments = registerPayments;
    }

    public List<InbalancePayment> getInbalancePayments() {
        return inbalancePayments;
    }

    public void setInbalancePayments(List<InbalancePayment> inbalancePayments) {
        this.inbalancePayments = inbalancePayments;
    }

    public List<ClinicPayment> getClinicPayments() {
        return clinicPayments;
    }

    public void setClinicPayments(List<ClinicPayment> clinicPayments) {
        this.clinicPayments = clinicPayments;
    }
}
