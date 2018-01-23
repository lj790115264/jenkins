package com.chinacaring.peixian.patient.client.dto.front.response;

public class CheckResponse {

    // 设备
    private String device;
    // 检查时间
    private String time;
    private String docName;
    // 项目
    private String scription;
    // 诊断
    private String diagnose;
    // 详情
    private String descript;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getScription() {
        return scription;
    }

    public void setScription(String scription) {
        this.scription = scription;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
