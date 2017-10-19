/**  
 * @Title: TestFreeMarkerController.java
 * @Package com.demo.test.springmvc.controller
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: TestFreeMarkerController
 * @Description: TODO
 */
@Controller
@RequestMapping("/freeMarker")
public class TestFreeMarkerController {

	private static final Logger logger = LoggerFactory.getLogger("test_log");

	/**
	 * @Description: TODO
	 * @param @param map
	 * @param @return
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "test")
	public String test(ModelMap map) {
		System.out.println("test ……");
		map.addAttribute("title", "Spring MVC And Freemarker");
		map.put("content", " Hello world ， test my first spring mvc ! ");

		logger.info("Processing trade with id: {} and symbol : {} ", "123", "321");

		return "test";
	}

	/**
	 * @Description: TODO
	 * @param @param map
	 * @param @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		System.out.println("say Hello ……");
		map.addAttribute("name", " World!");
		return "hello";
	}

	/**
	 * @Description: TODO
	 * @param @param map
	 * @param @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/hi")
	public String sayHi(ModelMap map) {
		System.out.println("say hi ……");
		map.put("name", "jojo");
		return "hi";

	}

}
