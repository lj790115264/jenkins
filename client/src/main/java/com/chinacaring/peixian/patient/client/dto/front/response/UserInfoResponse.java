package com.chinacaring.peixian.patient.client.dto.front.response;


import lombok.Data;

@Data
public class UserInfoResponse {

    private Integer id;
    private String username;
    private String email;
    private String role;
    private String name;
    private String nickname;
    private String avatar;
    private String employeeId;
    private String phone;
    private Integer status;
    private String extra;
    private String idCard;
    private Integer gender;
    private String mcardNo;
}
