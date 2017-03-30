package com.mocha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/30.
 */
@Controller
public class DemoController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "index";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

}
