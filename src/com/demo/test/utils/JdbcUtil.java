/**  
 * @Title: JdbcUtil.java
 * @Package com.demo.test.utils
 * @Description: TODO
 * @author tangxinghua tangxh@live.com
 * @version V1.0  
 */
package com.demo.test.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: JdbcUtil
 * @Description: TODO
 */
public class JdbcUtil {

	private static final Logger logger = LoggerFactory.getLogger(JdbcUtil.class);

	/**
	 * 获取sqlite数据库连接
	 * 
	 * @param
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getSqlistConnection(DataSource dataSource) throws SQLException {
		Connection conn = dataSource.getConnection();
		conn.setAutoCommit(false);
		logger.info("Opened database successfully");
		return conn;
	}

	/**
	 * 关闭数据库连接
	 * 
	 * @param rs
	 * @param stmt
	 * @param conn
	 * @return void
	 */
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException ex) {
				logger.error(null, ex);
			}
			rs = null;
		}
		if (null != stmt) {
			try {
				stmt.close();
			} catch (SQLException ex) {
				logger.error(null, ex);
			}
			stmt = null;
		}
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException ex) {
				logger.error(null, ex);
			}
			conn = null;
		}
	}
}
