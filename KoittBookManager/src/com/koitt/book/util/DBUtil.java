package com.koitt.book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	private static DBUtil instance;
	
	// 기본생성자
	private DBUtil() {}
	
	// 캡슐화
	public static DBUtil getInstance() {
		if (instance ==  null) {
			instance = new DBUtil();
		}
		return instance;
	}
	
	// DB 커넥션 객체 가져오기
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306";
		String dbName = "bookmgr";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
		return conn;
				
	}
	
	// Connection 객체 연결해제
	public void close(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
	
	// Statement(PreparedStatement 포함) 객체 연결 해제
	public void close(Statement stmt) throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
	}
	
	// ResultSet 객체 연결 해제
	public void close(ResultSet rs) throws SQLException {
		if (rs != null) {
			rs.close();
		}
	}
	
	// Rollback 메소드
	public void rollback(Connection conn) throws SQLException {
		if (conn != null) {
			conn.rollback();
		}
	}
	

}
