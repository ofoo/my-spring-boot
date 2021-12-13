package com.example.demo.activemq;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

@Configuration
public class MyMqConfig {

	@Bean
	public Topic topic() {
		return new ActiveMQTopic("sms.topic");
	}
}