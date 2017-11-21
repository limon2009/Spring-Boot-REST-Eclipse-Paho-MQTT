package com.monirthought.mqtt.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MQTT Publisher Configuration class
 * 
 * @author Moniruzzaman Md
 * @version 1.0.0
 *
 */
public interface MQTTPublisherBase {

	/**
	 * Publish message
	 * 
	 * @param topic
	 * @param jasonMessage
	 */
	public void publishMessage(String topic, String message);

	/**
	 * Disconnect MQTT Client
	 */
	public void disconnect();

}
