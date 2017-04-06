package com.mocha.controller;

import com.mocha.bean.User;
import com.mocha.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@RestController
public class UserControllerApi {
    @Autowired
    private UserService service;

    @ApiOperation(value="获取用户", notes="获取用户")
    @RequestMapping("/logapi")
    public String getByName(String name) {
        User user = service.getByName(name);
        return user.getId()+"_"+user.getName();
    }


}
