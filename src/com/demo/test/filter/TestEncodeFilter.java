/**  
 * @Title: TestEncodeFilter.java
 * @Package com.demo.test.filter
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: TestEncodeFilter
 * @Description: TODO
 * @author tangxh
 * 
 */
public class TestEncodeFilter implements Filter {

	/**
	 * @Fields filterConfig : TODO
	 */
	private FilterConfig filterConfig;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		String charset = filterConfig.getInitParameter("charset");
		request.setCharacterEncoding(charset);
		response.setCharacterEncoding(charset);

		chain.doFilter(new TestEncodeHttpServletRequestWrapper((HttpServletRequest) request, charset), response);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
	}

}
