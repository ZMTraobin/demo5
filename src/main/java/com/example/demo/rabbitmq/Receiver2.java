package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class Receiver2 {
	
	@RabbitHandler
	public void receiver(String s) {
		System.out.println("Receiver1: "+s);
	}

}