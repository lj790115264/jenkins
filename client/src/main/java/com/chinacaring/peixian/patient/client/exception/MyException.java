package com.chinacaring.peixian.patient.client.exception;

import com.chinacaring.common.exception.CommonException;

public class MyException extends CommonException {

    private String devMessage;

    public String getDevMessage() {
        return devMessage;
    }

    public void setDevMessage(String devMessage) {
        this.devMessage = devMessage;
    }

    public MyException() {

    }

    public MyException(String devMessage) {
        this(devMessage, devMessage);
    }

    public MyException(String message, String devMessage) {
        super(message);
        this.devMessage = devMessage;
    }
}
