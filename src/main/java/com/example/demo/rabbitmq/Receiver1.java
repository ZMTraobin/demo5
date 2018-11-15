package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class Receiver1 {
	
	@RabbitHandler
	public void receiver(String s) {
		System.out.println("Receiver2: "+s);
	}

}
