/**  
 * @Title: TestEncodeHttpServletRequestWrapper.java
 * @Package com.demo.test.filter
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.filter;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @ClassName: TestEncodeHttpServletRequestWrapper
 * @Description: TODO
 * @author tangxh
 * 
 */
public class TestEncodeHttpServletRequestWrapper extends HttpServletRequestWrapper {

	private boolean flag = true;

	private String charset = "utf-8";

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param request
	 */
	public TestEncodeHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param request
	 * @param encoding
	 */
	public TestEncodeHttpServletRequestWrapper(HttpServletRequest request, String charset) {
		super(request);
		this.charset = charset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.ServletRequestWrapper#getParameterMap()
	 */
	@Override
	public Map<String, String[]> getParameterMap() {
		Map<String, String[]> map = super.getParameterMap();
		if (this.flag && !map.isEmpty()) {
			for (Map.Entry<String, String[]> m : map.entrySet()) {
				String[] values = m.getValue();
				for (int i = 0; i < values.length; i++) {
					try {
						values[i] = new String(values[i].trim().getBytes("iso-8859-1"), this.charset);
					} catch (UnsupportedEncodingException e) {
						// e.printStackTrace();
					}
				}

			}
			this.flag = false;
		}
		return map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.ServletRequestWrapper#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String name) {
		return getParameterMap().get(name)[0];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.ServletRequestWrapper#getParameterValues(java.lang.String)
	 */
	@Override
	public String[] getParameterValues(String name) {
		return getParameterMap().get(name);
	}

}
