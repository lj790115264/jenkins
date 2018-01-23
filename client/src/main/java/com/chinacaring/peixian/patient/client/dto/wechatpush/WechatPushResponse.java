package com.chinacaring.peixian.patient.client.dto.wechatpush;

import java.util.List;

public class WechatPushResponse {


    /**
     * code : 0
     * message : 发送成功
     * dev_message : OK
     * data : {"errCode":0,"errMsg":"ok","invalidUser":"","invalidParty":null,"invalidTag":null,"invalidUserList":[],"invalidPartyList":[],"invalidTagList":[]}
     */

    private int code;
    private String message;
    private String dev_message;
    /**
     * errCode : 0
     * errMsg : ok
     * invalidUser :
     * invalidParty : null
     * invalidTag : null
     * invalidUserList : []
     * invalidPartyList : []
     * invalidTagList : []
     */

    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDev_message() {
        return dev_message;
    }

    public void setDev_message(String dev_message) {
        this.dev_message = dev_message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int errCode;
        private String errMsg;
        private String invalidUser;
        private Object invalidParty;
        private Object invalidTag;
        private List<String> invalidUserList;
        private List<String> invalidPartyList;
        private List<String> invalidTagList;

        public int getErrCode() {
            return errCode;
        }

        public void setErrCode(int errCode) {
            this.errCode = errCode;
        }

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }

        public String getInvalidUser() {
            return invalidUser;
        }

        public void setInvalidUser(String invalidUser) {
            this.invalidUser = invalidUser;
        }

        public Object getInvalidParty() {
            return invalidParty;
        }

        public void setInvalidParty(Object invalidParty) {
            this.invalidParty = invalidParty;
        }

        public Object getInvalidTag() {
            return invalidTag;
        }

        public void setInvalidTag(Object invalidTag) {
            this.invalidTag = invalidTag;
        }

        public List<String> getInvalidUserList() {
            return invalidUserList;
        }

        public void setInvalidUserList(List<String> invalidUserList) {
            this.invalidUserList = invalidUserList;
        }

        public List<String> getInvalidPartyList() {
            return invalidPartyList;
        }

        public void setInvalidPartyList(List<String> invalidPartyList) {
            this.invalidPartyList = invalidPartyList;
        }

        public List<String> getInvalidTagList() {
            return invalidTagList;
        }

        public void setInvalidTagList(List<String> invalidTagList) {
            this.invalidTagList = invalidTagList;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "errCode=" + errCode +
                    ", errMsg='" + errMsg + '\'' +
                    ", invalidUser='" + invalidUser + '\'' +
                    ", invalidParty=" + invalidParty +
                    ", invalidTag=" + invalidTag +
                    ", invalidUserList=" + invalidUserList +
                    ", invalidPartyList=" + invalidPartyList +
                    ", invalidTagList=" + invalidTagList +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "WechatPushResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", dev_message='" + dev_message + '\'' +
                ", data=" + data +
                '}';
    }
}
