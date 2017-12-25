package com.chinacaring.hmsrmyy.dto.front.request;

public class CommonUsedPatientRequest {

    private String name;

    private String idCard;

    private String phone;

    //本人 父亲 母亲
    private String relationship;

    private String address;

    //民族
    private String Ethnic;

    public CommonUsedPatientRequest() {
    }

    public String getEthnic() {
        return Ethnic;
    }

    public void setEthnic(String ethnic) {
        Ethnic = ethnic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
