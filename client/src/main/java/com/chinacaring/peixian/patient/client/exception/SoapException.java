package com.chinacaring.peixian.patient.client.exception;

public class SoapException extends MyException {

    private String arguments;

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public SoapException(String message, String devMessage, String arguments) {

        super(message, devMessage);
        this.arguments = arguments;
    }
}
