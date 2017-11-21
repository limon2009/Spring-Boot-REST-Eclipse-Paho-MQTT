package com.monirthought.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monirthought.mqtt.publisher.MQTTPublisherBase;

/**
 * Demo Controller to Test Rest API
 * 
 * @author Moniruzzaman Md
 *
 */
@RestController
public class DemoRestController {

	@Autowired
	MQTTPublisherBase publisher;
	
	@RequestMapping(value = "/mqtt/send", method = RequestMethod.POST)
	public String index(@RequestBody String data) {
		publisher.publishMessage("demoTopic", data);
		return "Message sent to Broker";
	}

}
