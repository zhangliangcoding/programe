package com.mocha;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@SpringBootApplication
//@MapperScan("com.mocha.dao")
public class FrameWorkApplication {
    public static void main(String[] args){
        SpringApplication.run(FrameWorkApplication.class,args);
    }


}
