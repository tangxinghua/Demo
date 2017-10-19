/**  
 * @Title: JdbcDao.java
 * @Package com.demo.test.jdbc
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @ClassName: JdbcDao
 * @Description: TODO
 */
@Service("jdbcDao")
public class JdbcDao {

	/**
	 * @Fields jdbcTemplate :  org.springframework.jdbc.core.support.JdbcDaoSupport
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Company> findAll() {
		return this.getJdbcTemplate().query("SELECT * FROM COMPANY", new CompanyRowMapper());
	}

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
