package com.example.demo.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "sms.queue", containerFactory = "queueListenerFactory")
	public void receiveMsg(String text) {
		System.out.println("接收到消息 : " + text);
	}

	@JmsListener(destination = "sms.topic", containerFactory = "topicListenerFactory")
	public void receiveTopic1(String text) {
		System.out.println("receiveTopic1接收到Topic消息 : " + text);
	}

	@JmsListener(destination = "sms.topic", containerFactory = "topicListenerFactory")
	public void receiveTopic2(String text) {
		System.out.println("receiveTopic2接收到Topic消息 : " + text);
	}


}
