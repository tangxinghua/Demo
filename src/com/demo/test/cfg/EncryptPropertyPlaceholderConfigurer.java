/**  
 * @Title: EncryptPropertyPlaceholderConfigurer.java
 * @Package com.demo.test.cfg
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.cfg;

import java.util.Map;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @ClassName: EncryptPropertyPlaceholderConfigurer
 * @Description: TODO
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	String[] DATABASE_PROPERTY_NAMES = { "username", "password", "url" };
	// todo 此处换成你的加密方式获取，格式为{username:xxxxx}
	private static Map<String, String> databaseMap = null;

	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if (isEncryptProperty(propertyName)) {
			// return databaseMap.get(propertyName);
		}
		return super.convertProperty(propertyName, propertyValue);
	}

	private boolean isEncryptProperty(String pname) {
		for (String name : DATABASE_PROPERTY_NAMES) {
			if (name.equals(pname)) {
				return true;
			}
		}
		return false;
	}
}
