package com.bit.exam01;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.bit.db.ConnectionProvider;

public class InsertBook {
	public static void main(String[] args) {
		
		// BookInsertOrUpdate ���ν����� ȣ���ϴ� �ڹ� ���α׷��� ����
		try {
			int bookid = 13;
			String bookname = "����õ��";
			String publisher = "���ѹ̵��";
			int price = 40000;
			Connection conn = ConnectionProvider.getConnection();
			CallableStatement cstmt = conn.prepareCall("{call BookInsertOrUpdate(?, ?, ?, ?)}");
			cstmt.setInt(1, bookid);
			cstmt.setString(2, bookname);
			cstmt.setString(3, publisher);
			cstmt.setInt(4, price);
			int re = cstmt.executeUpdate();
			System.out.println("re : " + re);
			ConnectionProvider.close(null, cstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
