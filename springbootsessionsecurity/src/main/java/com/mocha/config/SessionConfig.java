package com.mocha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/30.
 */
@Configuration
@EnableRedisHttpSession
public class SessionConfig {

    @Bean
    public JedisConnectionFactory connectionFactory() {
        System.out.println("connectionFactory========");
        JedisConnectionFactory factory =new JedisConnectionFactory();
        //factory.setHostName("192.168.109.99");
        factory.setHostName("192.168.1.216");
        factory.setPassword("mocha");
        return factory;
    }

}
