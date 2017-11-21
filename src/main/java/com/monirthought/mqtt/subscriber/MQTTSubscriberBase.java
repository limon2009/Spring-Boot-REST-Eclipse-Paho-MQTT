package com.monirthought.mqtt.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.monirthought.mqtt.publisher.MQTTPublisherBase;

/**
 * MQTT Subscriber Base Interface
 * 
 * @author Moniruzzaman Md
 *
 */
public interface MQTTSubscriberBase {

	public static final Logger logger = LoggerFactory.getLogger(MQTTPublisherBase.class);

	/**
	 * Subscribe message
	 * 
	 * @param topic
	 * @param jasonMessage
	 */
	public void subscribeMessage(String topic);

	/**
	 * Disconnect MQTT Client
	 */
	public void disconnect();
}
