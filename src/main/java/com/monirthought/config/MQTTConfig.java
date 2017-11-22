package com.monirthought.config;

/**
 * MQTT Core Configuration
 * 
 * @author Moniruzzaman Md
 *
 */
public abstract class MQTTConfig {

	protected final String broker = "iot.eclipse.org";
	protected final int qos = 2;
	protected Boolean hasSSL = false; /* By default SSL is disabled */
	protected Integer port = 1883; /* Default port */
	protected final String userName = "testUserName";
	protected final String password = "demoPassword";
	protected final String TCP = "tcp://";
	protected final String SSL = "ssl://";

	/**
	 * Custom Configuration
	 * 
	 * @param broker
	 * @param port
	 * @param ssl
	 * @param withUserNamePass
	 */
	protected abstract void config(String broker, Integer port, Boolean ssl, Boolean withUserNamePass);

	/**
	 * Default Configuration
	 */
	protected abstract void config();
}
