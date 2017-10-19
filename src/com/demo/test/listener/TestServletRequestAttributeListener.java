/**  
 * @Title: TestServletRequestAttributeListener.java
 * @Package com.demo.test
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * @ClassName: TestServletRequestAttributeListener
 * @Description: TODO
 * @author tangxh
 * 
 */
public class TestServletRequestAttributeListener implements ServletRequestAttributeListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.ServletRequestAttributeListener#attributeAdded(javax.servlet
	 * .ServletRequestAttributeEvent)
	 */
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("requestAttribute添加了属性");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.ServletRequestAttributeListener#attributeRemoved(javax.
	 * servlet.ServletRequestAttributeEvent)
	 */
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("requestAttribute被移除了");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.ServletRequestAttributeListener#attributeReplaced(javax
	 * .servlet.ServletRequestAttributeEvent)
	 */
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("requestAttribute被替换了");
		System.out.println(arg0.getName() + arg0.getValue());
	}

}
