/**  
 * @Title: TestSpringMvc.java
 * @Package com.demo.test.springmvc
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.springmvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.test.jdbc.Company;
import com.demo.test.jdbc.JdbcDao;
import com.demo.test.spring.TestSpringDo;

/**
 * @ClassName: TestSpringMvc
 * @Description: TODO
 * @author tangxh
 * 
 */
@Controller
public class TestSpringController {

	private static final Logger logger = LoggerFactory.getLogger(TestSpringController.class);

	@Autowired
	private TestSpringDo testSpringDo;

	@Autowired
	private JdbcDao jdbcDao;

	/**
	 * @Description: TODO
	 * @param @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/springmvc")
	public String hello() {

		testSpringDo.setName("world");
		testSpringDo.hello();

		List<Company> list = jdbcDao.findAll();
		/*System.out.println(new Gson().toJson(list));*/

		logger.debug("This is log of level of debug");
		logger.trace("This is log of level of trace");
		logger.warn("This is log of level of warn");
		logger.info("This is log of level of info");
		logger.error("This is log of level of error");

		return "success";
	}

	/**
	 * @Description: TODO
	 * @param @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/xmlViewResolver")
	public String testXmlViewResolver() {
		return "internalResource";
	}
}
