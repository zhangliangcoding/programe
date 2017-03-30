package com.mocha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/30.
 */
@Controller
public class DemoController {
    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("home")
    public String home(){

        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
