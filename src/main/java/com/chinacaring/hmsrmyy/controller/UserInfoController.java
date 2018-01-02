package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.vo.Result;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping("user_info")
    public Object getUserInfo(@CurrentUser User user){
        return new Result<>(user);
    }
}
