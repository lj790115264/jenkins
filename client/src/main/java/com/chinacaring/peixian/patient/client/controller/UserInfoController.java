package com.chinacaring.peixian.patient.client.controller;


import com.chinacaring.common.vo.Result;
import com.chinacaring.peixian.patient.client.dao.entity.CommonUsedPatient;
import com.chinacaring.peixian.patient.client.dao.repository.CommonUsedPatientRepository;
import com.chinacaring.peixian.patient.client.dto.front.response.UserInfoResponse;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.util.BeanMapperUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private CommonUsedPatientRepository commonUsedPatientRepository;

    @ApiOperation("获取用户信息")
    @GetMapping("/user")
    public Object getUserInfo(@CurrentUser User user){

        String mcardNo = "";
        try {
            List<CommonUsedPatient> commonUsedPatients = commonUsedPatientRepository.findAllByIdCardAndUserId(user.getIdCard(), user.getId());
            if (!commonUsedPatients.isEmpty()){
                mcardNo = commonUsedPatients.get(0).getMcardNo();
            }
        }catch (Exception ignored){
        }
        UserInfoResponse userInfoResponse = BeanMapperUtil.map(user, UserInfoResponse.class);
        userInfoResponse.setMcardNo(mcardNo);
        return new Result<>(userInfoResponse);

    }
}
