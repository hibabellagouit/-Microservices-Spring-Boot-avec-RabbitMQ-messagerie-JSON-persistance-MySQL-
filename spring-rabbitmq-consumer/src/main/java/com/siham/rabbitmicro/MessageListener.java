package com.siham.rabbitmicro;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(com.siham.rabbitmicro.CustomMessage message) {
        System.out.println(message);
    }
}