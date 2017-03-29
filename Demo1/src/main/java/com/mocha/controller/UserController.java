package com.mocha.controller;

import com.mocha.dao.UserMapper;
import com.mocha.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/29.
 */
@RestController
@RequestMapping("home")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    SendService sendService;

    @RequestMapping("user")
    @ResponseBody
    public String getUser(int id){

        for(int i=0;i<100000;i++){
            sendService.sendMsg("hello rabbitMQ"+i);
        }
        return userMapper.findById(id).getName();
    }


}
