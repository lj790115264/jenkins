package com.chinacaring.hmsrmyy.controller;


import com.chinacaring.common.vo.Result;
import com.chinacaring.user.annotation.CurrentUser;
import com.chinacaring.user.dao.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @ApiOperation("获取用户信息")
    @GetMapping("/user")
    public Object getUserInfo(@CurrentUser User user){
        return new Result<>(user);
    }
}
