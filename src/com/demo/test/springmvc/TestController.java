/**  
 * @Title: TestSpringController.java
 * @Package com.demo.test.springmvc.controller
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @ClassName: TestSpringController
 * @Description: TODO
 * @author tangxh
 * 
 */
public class TestController implements Controller {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// 1、收集参数、验证参数
		// 2、绑定参数到命令对象
		// 3、将命令对象传入业务对象进行业务处理
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView("hello");
		// 添加模型数据 可以是任意的POJO对象
		mv.addObject("message", "Hello World!");
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("hello");
		return mv;
	}

}
