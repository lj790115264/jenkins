package com.chinacaring.peixian.patient.client.dto.pingpp;

import java.io.Serializable;

public class ChargeRequest implements Serializable{


    /**
     * amount : 0
     * body : string
     * channel : string
     * currency : string
     * subject : string
     */
    private int amount;
    private String body;
    private String channel;
    private String subject;
    private String open_id;
    private String app_id = "app_iXrbz9CmDu5ODqTO"; // 正式
//    private String app_id = "app_e9u9q9KyXPiL4u58"; // 测试

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public ChargeRequest() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }
}
