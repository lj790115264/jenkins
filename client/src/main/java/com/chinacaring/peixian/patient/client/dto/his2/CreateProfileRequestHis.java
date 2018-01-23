package com.chinacaring.peixian.patient.client.dto.his2;

public class CreateProfileRequestHis {

    private String name;
    private String sex;
    private String phone;
    private String idCard;
    private String birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
        Integer sex = Integer.valueOf(idCard.substring(idCard.length() - 2, idCard.length() - 1)) % 2;
        this.sex = sex == 0 ? "F" : "M";
        String birthday = idCard.substring(idCard.length() - 12, idCard.length() - 4 );

        this.birth = birthday.substring(0, 4) + "-" + birthday.substring(4, 6) + "-" + birthday.substring(6);
    }

    public String getBirth() {
        return birth;
    }

    public String mixed() {

        return name + "|" + sex + "||" + phone + "|" + idCard + "|" +birth;
    }
}
