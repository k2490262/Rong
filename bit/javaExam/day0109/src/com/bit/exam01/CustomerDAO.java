package com.bit.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class CustomerDAO {

	// ��� ���� ����� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ带 ����
	public Vector<Vector<String>> listCustomer() {
		Vector<Vector<String>> list = new Vector<Vector<String>>();
		String sql = "select * from customer";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getInt(1) + "");
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
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

	// �����ͺ��̽��� �����Ͽ� ���ο� ���� �߰��ϴ� �޼ҵ带 ����
	public int insertCustomer(CustomerVO c) {
		int re = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			String sql = "insert into customer values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getCustid());
			pstmt.setString(2, c.getName());
			pstmt.setString(3, c.getAddress());
			pstmt.setString(4, c.getPhone());
			re = pstmt.executeUpdate(); // executeUpdate() �ȿ� String������ �־��ָ� �ش� �Է°��� �Է¹ޱ⿡ �ƹ� ���� �Է����� �ʴ´�.
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return re;
	}
}
