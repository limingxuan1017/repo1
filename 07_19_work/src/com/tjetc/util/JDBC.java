package com.tjetc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	private static Connection getConnection() {
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.56.128:3306/test?useUnicode=true&characterEncoding=utf8", "root", "1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	// ��ɾ�ĵķ���
	public static int executeNonQuery(String sql, Object... obj) {
		int line = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
				for (int i = 0; i < obj.length; i++) {
					stmt.setObject(i + 1, obj[i]);
				}
			line = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

	// ��ѯ�ķ���
	public static ResultSet executeQuery(String sql, Object... obj) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
				for (int i = 0; i < obj.length; i++) {
					stmt.setObject(i + 1, obj[i]);
				}
			res = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;

	}

}
