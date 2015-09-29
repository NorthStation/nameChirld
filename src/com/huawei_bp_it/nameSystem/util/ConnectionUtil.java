package com.huawei_bp_it.nameSystem.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import java.sql.ResultSet;

/**
 * 数据库连接工具
 * 
 * @author Administrator
 * @date 2013-11-14
 * 
 */
public class ConnectionUtil {
	private static String url;
	private static String user;
	private static String password;
	private static String driver;
	private static Properties prop = new Properties();

	// 通过静态块加载驱动
	static {
		// 声明IO流
		InputStream is = null;
		// 读取文件
		is = ConnectionUtil.class.getClassLoader().getResourceAsStream(
				"com/huawei_bp_it/nameSystem/util/db.properties");
		// 通过prop对象加载.prop 文件
		try {
			prop.load(is);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			// 通过反射加载驱动
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 获取连接
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// 关闭连接
	public static void closeConnection(ResultSet rs, Statement pstmt,
			Connection conn) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
}
