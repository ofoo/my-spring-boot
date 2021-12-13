package com.example.demo;

import com.example.demo.activemq.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ActiveMqTests {

	@Autowired
	private Producer producer;

	@Test
	public void sendSimpleTopicMessage() {
		this.producer.sendTopic("提现200.00元");
	}
}
