package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.BookVo;

public class BookDao {
	// �߰��� ������ ������ BookVo�� �Ű������� ���޹޾� ���̺� �߰��ϴ� �޼ҵ�
	public int insertBook(BookVo b) {
		int re = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			String sql = "insert into book values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getBookid());
			pstmt.setString(2, b.getBookname());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());

			re = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	// ��� ���� ����� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ带 ����
	public ArrayList<BookVo> listBook() {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		String sql = "select * from book";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BookVo v = new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				list.add(v);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}
}
