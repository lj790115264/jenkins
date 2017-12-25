package com.chinacaring.hmsrmyy.dto.pingpp;

import java.io.Serializable;
import java.util.Map;

/**
 * @author xjh1994
 * @date 2017/11/3
 * @intro
 */
public class PayResponse implements Serializable {
    /**
     * id : ch_Xsr7u35O3m1Gw4ed2ODmi4Lw
     * object : charge
     * created : 1440407501
     * livemode : true
     * reversed : false
     * paid : true
     * refunded : false
     * app : app_urj1WLzvzfTK0OuL
     * channel : upacp
     * order_no : 123456789
     * client_ip : 127.0.0.1
     * amount : 100
     * amount_settle : 0
     * currency : cny
     * subject : Your Subject
     * body : Your Body
     * extra : {}
     * time_paid : 1440407501
     * time_expire : 1440407501
     * time_settle : null
     * transaction_no : 1224524301201505066067849274
     * refunds : {"object":"list","url":"/v1/charges/ch_Xsr7u35O3m1Gw4ed2ODmi4Lw/refunds","has_more":false,"data":[]}
     * amount_refunded : 0
     * failure_code : null
     * failure_msg : null
     * metadata : {}
     * credential : {}
     * description : null
     */

    private String id;
    private String object;
    private int created;
    private boolean livemode;
    private boolean reversed;
    private boolean paid;
    private boolean refunded;
    private String app;
    private String channel;
    private String order_no;
    private String client_ip;
    private int amount;
    private int amount_settle;
    private String currency;
    private String subject;
    private String body;
    private Map extra;
    private int time_paid;
    private int time_expire;
    private Object time_settle;
    private String transaction_no;
    private Map refunds;
    private int amount_refunded;
    private Object failure_code;
    private Object failure_msg;
    private Map metadata;
    private Map credential;
    private Object description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public boolean isLivemode() {
        return livemode;
    }

    public void setLivemode(boolean livemode) {
        this.livemode = livemode;
    }

    public boolean isReversed() {
        return reversed;
    }

    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isRefunded() {
        return refunded;
    }

    public void setRefunded(boolean refunded) {
        this.refunded = refunded;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount_settle() {
        return amount_settle;
    }

    public void setAmount_settle(int amount_settle) {
        this.amount_settle = amount_settle;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getTime_paid() {
        return time_paid;
    }

    public void setTime_paid(int time_paid) {
        this.time_paid = time_paid;
    }

    public int getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(int time_expire) {
        this.time_expire = time_expire;
    }

    public Object getTime_settle() {
        return time_settle;
    }

    public void setTime_settle(Object time_settle) {
        this.time_settle = time_settle;
    }

    public String getTransaction_no() {
        return transaction_no;
    }

    public void setTransaction_no(String transaction_no) {
        this.transaction_no = transaction_no;
    }

    public int getAmount_refunded() {
        return amount_refunded;
    }

    public void setAmount_refunded(int amount_refunded) {
        this.amount_refunded = amount_refunded;
    }

    public Object getFailure_code() {
        return failure_code;
    }

    public void setFailure_code(Object failure_code) {
        this.failure_code = failure_code;
    }

    public Object getFailure_msg() {
        return failure_msg;
    }

    public void setFailure_msg(Object failure_msg) {
        this.failure_msg = failure_msg;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Map getExtra() {
        return extra;
    }

    public void setExtra(Map extra) {
        this.extra = extra;
    }

    public Map getRefunds() {
        return refunds;
    }

    public void setRefunds(Map refunds) {
        this.refunds = refunds;
    }

    public Map getMetadata() {
        return metadata;
    }

    public void setMetadata(Map metadata) {
        this.metadata = metadata;
    }

    public Map getCredential() {
        return credential;
    }

    public void setCredential(Map credential) {
        this.credential = credential;
    }
}
