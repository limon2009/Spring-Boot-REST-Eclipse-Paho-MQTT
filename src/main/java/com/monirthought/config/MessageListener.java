package com.monirthought.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monirthought.mqtt.subscriber.MQTTSubscriberBase;

@Component
public class MessageListener implements Runnable{

	@Autowired
	MQTTSubscriberBase subscriber;
	
	@Override
	public void run() {
		while(true) {
			subscriber.subscribeMessage("demoTopic2017");
		}
		
	}

}
