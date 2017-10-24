/**  
 * @Title: TestCaseSensitiveFilter.java
 * @Package com.demo.test
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

/**
 * @Description: TODO
 * @author tangxh
 *
 */
public class TestCaseSensitiveFilter implements Filter {

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		// ((HttpServletResponse) res).sendRedirect(((HttpServletRequest) req).getRequestURL().toString().toLowerCase());
		// req.getRequestDispatcher(((HttpServletRequest) req).getRequestURL().toString().toLowerCase()).forward(req, res);
		chain.doFilter(req, res);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
