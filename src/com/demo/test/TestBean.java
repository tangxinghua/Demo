/**  
 * @Title: TestBean.java
 * @Package com.demo.test
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test;

import java.io.Serializable;

/**
 * @ClassName: TestBean
 * @Description: TODO
 * @author tangxh
 * @date 2017-3-17 下午11:15:03
 * 
 */
public class TestBean implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 3669495222055984328L;

	/**
	 * @Fields name : TODO
	 */
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TestBean [name=" + name + "]";
	}

}
