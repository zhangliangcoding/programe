package com.mocha.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/6.
 */
@RestController
@Api(value = "/loginController", description = "springboot-swagger集成Helloword")
@RequestMapping("/helloWordController")
public class HelloSwaggerController {
    @ApiOperation(notes = "helloWord", httpMethod = "GET", value = "helloWord")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "helloWord", value = "输入参数", required = true, dataType = "string", paramType = "query")
    })
    @RequestMapping("/helloWord")
    public String helloWord(String helloWord){
        System.out.println(helloWord);
        return "helloWordController";
    }

}
