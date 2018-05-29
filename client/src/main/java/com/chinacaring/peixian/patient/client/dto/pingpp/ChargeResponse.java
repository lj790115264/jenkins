package com.chinacaring.peixian.patient.client.dto.pingpp;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * @author xjh1994
 * @date 2018/3/6
 * @intro
 */
public class ChargeResponse implements Serializable {

    /**
     * id : ch_KmPC8KSK4SSCubrTK49KCSS4
     * object : charge
     * created : 1520318467
     * livemode : true
     * paid : true
     * refunded : false
     * reversed : false
     * app : app_Hq1080r1SevPSO8m
     * channel : wx_pub
     * order_no : 1520318467123b2vkqfs
     * client_ip : 222.184.125.150
     * amount : 27787
     * amount_settle : 27787
     * currency : cny
     * subject : 淮安肿瘤医院门诊缴费
     * body : 1393084
     * time_paid : 1520318472
     * time_expire : 1520325667
     * time_settle : null
     * transaction_no : 4200000052201803063587334056
     * refunds : {"object":"list","url":"/v1/charges/ch_KmPC8KSK4SSCubrTK49KCSS4/refunds","has_more":false,"data":[]}
     * amount_refunded : 0
     * failure_code : null
     * failure_msg : null
     * metadata : {}
     * credential : {}
     * extra : {"open_id":"oFIyd0-GtsX9uYgw4p07v5bYpJ3k","limit_pay":"no_credit","bank_type":"CCB_DEBIT","cash_fee":"27787","is_subscribe":"Y"}
     * description : null
     */

    private String id;
    private String object;
    private Long created;
    private boolean livemode;
    private boolean paid;
    private boolean refunded;
    private boolean reversed;
    private String app;
    private String channel;
    private String order_no;
    private String client_ip;
    private Integer amount;
    private Integer amount_settle;
    private String currency;
    private String subject;
    private String body;
    private Long time_paid;
    private Long time_expire;
    private Long time_settle;
    private String transaction_no;
    /**
     * object : list
     * url : /v1/charges/ch_KmPC8KSK4SSCubrTK49KCSS4/refunds
     * has_more : false
     * data : []
     */

    private RefundsBean refunds;
    private Integer amount_refunded;
    private Object failure_code;
    private Object failure_msg;
    private MetadataBean metadata;
    private CredentialBean credential;
    /**
     * open_id : oFIyd0-GtsX9uYgw4p07v5bYpJ3k
     * limit_pay : no_credit
     * bank_type : CCB_DEBIT
     * cash_fee : 27787
     * is_subscribe : Y
     */

    private ExtraBean extra;
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

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public boolean isLivemode() {
        return livemode;
    }

    public void setLivemode(boolean livemode) {
        this.livemode = livemode;
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

    public boolean isReversed() {
        return reversed;
    }

    public void setReversed(boolean reversed) {
        this.reversed = reversed;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount_settle() {
        return amount_settle;
    }

    public void setAmount_settle(Integer amount_settle) {
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

    public Long getTime_paid() {
        return time_paid;
    }

    public void setTime_paid(Long time_paid) {
        this.time_paid = time_paid;
    }

    public Long getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(Long time_expire) {
        this.time_expire = time_expire;
    }

    public Long getTime_settle() {
        return time_settle;
    }

    public void setTime_settle(Long time_settle) {
        this.time_settle = time_settle;
    }

    public String getTransaction_no() {
        return transaction_no;
    }

    public void setTransaction_no(String transaction_no) {
        this.transaction_no = transaction_no;
    }

    public RefundsBean getRefunds() {
        return refunds;
    }

    public void setRefunds(RefundsBean refunds) {
        this.refunds = refunds;
    }

    public Integer getAmount_refunded() {
        return amount_refunded;
    }

    public void setAmount_refunded(Integer amount_refunded) {
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

    public MetadataBean getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataBean metadata) {
        this.metadata = metadata;
    }

    public CredentialBean getCredential() {
        return credential;
    }

    public void setCredential(CredentialBean credential) {
        this.credential = credential;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public static class RefundsBean {
        private String object;
        private String url;
        private boolean has_more;
        private List<?> data;

        public String getObject() {
            return object;
        }

        public void setObject(String object) {
            this.object = object;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public List<?> getData() {
            return data;
        }

        public void setData(List<?> data) {
            this.data = data;
        }
    }

    public static class MetadataBean {
    }

    public static class CredentialBean {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ExtraBean {
        private String open_id;
        private String limit_pay;
        private String bank_type;
        private String cash_fee;
        private String is_subscribe;

        private String success_url;
        private String buyer_account;

        public String getOpen_id() {
            return open_id;
        }

        public void setOpen_id(String open_id) {
            this.open_id = open_id;
        }

        public String getLimit_pay() {
            return limit_pay;
        }

        public void setLimit_pay(String limit_pay) {
            this.limit_pay = limit_pay;
        }

        public String getBank_type() {
            return bank_type;
        }

        public void setBank_type(String bank_type) {
            this.bank_type = bank_type;
        }

        public String getCash_fee() {
            return cash_fee;
        }

        public void setCash_fee(String cash_fee) {
            this.cash_fee = cash_fee;
        }

        public String getIs_subscribe() {
            return is_subscribe;
        }

        public void setIs_subscribe(String is_subscribe) {
            this.is_subscribe = is_subscribe;
        }

        public String getSuccess_url() {
            return success_url;
        }

        public void setSuccess_url(String success_url) {
            this.success_url = success_url;
        }

        public String getBuyer_account() {
            return buyer_account;
        }

        public void setBuyer_account(String buyer_account) {
            this.buyer_account = buyer_account;
        }
    }
}
