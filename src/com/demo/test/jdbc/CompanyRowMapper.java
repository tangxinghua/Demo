/**  
 * @Title: CompanyRowMapper.java
 * @Package com.demo.test.jdbc
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @ClassName: CompanyRowMapper
 * @Description: TODO
 */
public class CompanyRowMapper implements RowMapper<Company> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public Company mapRow(ResultSet rs, int i) throws SQLException {
		Company company = new Company();
		company.setId(rs.getInt("id"));
		company.setName(rs.getString("name"));
		company.setAge(rs.getInt("age"));
		company.setAddress(rs.getString("address"));
		company.setSalary(rs.getFloat("salary"));
		return company;
	}

}
