/**  
 * @Title: TestSpring.java
 * @Package com.demo.test.spring
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.test.jdbc.Company;
import com.demo.test.jdbc.JdbcDao;

/**
 * @ClassName: TestSpring
 * @Description: TODO
 */
public class TestSpring {

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestSpringDo testSpringDo = (TestSpringDo) ac.getBean("testSpringDo");
		testSpringDo.setName("world");
		testSpringDo.hello();

		TestSpringDo springDo = SpringContextHolder.getBean("testSpringDo");
		springDo.hello();

		JdbcDao jdbcDao = SpringContextHolder.getBean("jdbcDao");
		List<Company> list = jdbcDao.findAll();

		/*System.out.println(new Gson().toJson(list));*/
	}
}
