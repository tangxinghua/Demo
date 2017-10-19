/**  
 * @Title: TestSpringDo.java
 * @Package com.demo.test.spring
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestSpringDo
 * @Description: 设置成多例，默认是单例的
 */
@Service("testSpringDo")
@Scope("prototype")
public class TestSpringDo {

	private String name;

	/**
	 * <p>
	 * Description:
	 * </p>
	 */
	public TestSpringDo() {
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param name
	 */
	public TestSpringDo(String name) {
		this.name = name;
	}

	/**
	 * @Description: TODO
	 * @param
	 * @return void
	 * @throws
	 */
	public void hello() {
		System.out.println("hello, " + this.name);
	}

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
}
