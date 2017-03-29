package com.mocha.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/29.
 */
@Component
@RabbitListener(queues = "spring-boot-queue")
public class ReceiverService {

    @RabbitHandler
    public void process(String hello) {
        try {
            Thread.sleep(1000);
            System.out.println("Receiver is Sleepping .........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ReceiverService : " + hello);
    }

}
