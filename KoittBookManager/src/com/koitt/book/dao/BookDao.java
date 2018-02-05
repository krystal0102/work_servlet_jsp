package com.koitt.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koitt.book.util.DBUtil;
import com.koitt.book.vo.Book;

public class BookDao {
	
	public List<Book> selectAll() throws ClassNotFoundException, SQLException {
		
		Connection conn = DBUtil.getInstance().getConnection();
		
		String sql = "SELECT * FROM Book ORDER BY isbn DESC";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		List<Book> list = new ArrayList<Book>();
		while (rs.next()) {
			Book book = new Book();
			
			book.setIsbn(rs.getInt("isbn"));
			book.setTitle(rs.getString("title"));
			book.setAuthor(rs.getString("author"));
			book.setPublisher(rs.getString("publisher"));
			book.setPrice(rs.getInt("price"));
			book.setDescription(rs.getString("description"));
			
			list.add(book);
		}
		
		DBUtil.getInstance().close(rs);
		DBUtil.getInstance().close(pstmt);
		DBUtil.getInstance().close(conn);
		
		return list;
	}
	
	public Book select(Integer isbn) throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.getInstance().getConnection();
		
		String sql = "SELECT * FROM Book WHERE isbn = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, isbn);
		
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		
		Book book = new Book();
		
		book.setIsbn(rs.getInt("isbn"));
		book.setTitle(rs.getString("title"));
		book.setAuthor(rs.getString("author"));
		book.setPublisher(rs.getString("publisher"));
		book.setPrice(rs.getInt("price"));
		book.setDescription(rs.getString("description"));
		
		DBUtil.getInstance().close(rs);
		DBUtil.getInstance().close(pstmt);
		DBUtil.getInstance().close(conn);
		
		return book;
	}
	
	public void insert(Book book) throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.getInstance().getConnection();
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO Book (title, author, publisher, price, description)");
		sql.append("VALUES (?,?,?,?,?)");
		
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getAuthor());
		pstmt.setString(3, book.getPublisher());
		pstmt.setInt(4, book.getPrice());
		pstmt.setString(5, book.getDescription());
		
		pstmt.executeUpdate();
		
		DBUtil.getInstance().close(pstmt);
		DBUtil.getInstance().close(conn);
		
	}
	
	public void delete(Integer isbn) throws ClassNotFoundException, SQLException {
		// 1. 데이터베이스 커넥션 객체 가져오기
		Connection conn = DBUtil.getInstance().getConnection();
		
		// 2. SQL문 작성
		String sql = "DELETE FROM book WHERE no = ?";
		
		// 3. PreparedStatement 객체 생성 및 물음표 채우기
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, isbn);
		
		// 4. SQL문 실행
		pstmt.executeUpdate();
		
		// 5. 생략
		
		// 6. 객체 해제
		DBUtil.getInstance().close(pstmt);
		DBUtil.getInstance().close(conn);
		
		// 7. 생략
	}

}
