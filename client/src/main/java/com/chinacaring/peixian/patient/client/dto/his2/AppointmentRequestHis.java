package com.chinacaring.peixian.patient.client.dto.his2;

public class AppointmentRequestHis {

    protected String bookingNO;
    protected String patientNO;
    protected String bookingTime;
    protected String bookingType;

    //操作员代码  operCode
    //operCode 为 chinacaring_app，表示来自app操作；
    //operCode 为 chinacaring_gzh，表示来自微信公众号操作；
    //operCode 为 chinacaring_shh，表示来自支付宝生活号操作；
    protected String operCode;
    private boolean cancelAppoint;

    public boolean isCancelAppoint() {
        return cancelAppoint;
    }

    public void setCancelAppoint(boolean cancelAppoint) {
        this.cancelAppoint = cancelAppoint;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    private boolean paid;

    public String getBookingNO() {
        return bookingNO;
    }

    public void setBookingNO(String bookingNO) {
        this.bookingNO = bookingNO;
    }

    public String getPatientNO() {
        return patientNO;
    }

    public void setPatientNO(String patientNO) {
        this.patientNO = patientNO;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String mixed() {

        return "|" + patientNO + "|" + bookingTime + "|" + (isCancelAppoint() ? "1" : "0") + "|"
                + (isPaid() ? "1" : "0") + "|chinacaring|" + bookingNO;
    }
}
