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
 * ���ݿ����ӹ���
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

	// ͨ����̬���������
	static {
		// ����IO��
		InputStream is = null;
		// ��ȡ�ļ�
		is = ConnectionUtil.class.getClassLoader().getResourceAsStream(
				"com/huawei_bp_it/nameSystem/util/db.properties");
		// ͨ��prop�������.prop �ļ�
		try {
			prop.load(is);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			// ͨ�������������
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

	// ��ȡ����
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// �ر�����
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
