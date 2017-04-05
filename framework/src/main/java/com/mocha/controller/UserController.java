package com.mocha.controller;

import com.mocha.bean.User;
import com.mocha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(User user) {
        //service.insert(user);
        return "sucess";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(User user) {
        //service.update(user);
        return "sucess";
    }

    @RequestMapping("/login")
    public String login(String name,String pwd) {
        User user = service.getByName(name);
        if (user!=null&&pwd.equals(user.getPwd())){
            return "index";
        }else {
            return "login";
        }
    }

}
