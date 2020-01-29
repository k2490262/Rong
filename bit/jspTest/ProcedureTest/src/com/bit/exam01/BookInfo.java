package com.bit.exam01;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.bit.db.ConnectionProvider;

import oracle.jdbc.OracleTypes;

/*
create or replace procedure bookInfo(
p_bookid in number,
p_bookname out varchar2,
p_price out number)
 */
public class BookInfo {
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionProvider.getConnection();
			CallableStatement cstmt = conn.prepareCall("{call bookinfo(?, ?, ?)}");
			int bookid = 8;
			String bookname = null;
			int price = 0;
			cstmt.setInt(1, bookid);
			// ù��° ?�� 2�� �����ؿ�.
			// ������ȣ�� 2�� �����ؿ�.

			cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
			// 2��° ?�� �ڷ����� ���ڿ��� �����ؿ�.
			// �츮�� ���� ���ν����� 2��°�� ��¿� �����̸� �Ű������� ���޹��� ������ȣ��
			// �ش��ϴ� �������� ã�� �ι�° �Ű������� ��Ƽ� ��ȯ�ϴ� ���ν����Դϴ�.
			// �� �ι�° �Ű������� �ڷ����� �����ϴ� �� �Դϴ�.
			// ����Ŭ�ڷ��� varchar2�� �����մϴ�.

			cstmt.registerOutParameter(3, OracleTypes.NUMERIC);
			// 3��° ?�� �ڷ����� ���ڷ� �����մϴ�.
			// �ش絵���� ������ �˻��Ͽ� �㵵�� ���ν����� ������� �ֽ��ϴ�.

			cstmt.execute();
			bookname = cstmt.getString(2);
			price = cstmt.getInt(3);
			System.out.println("������ : " + bookname);
			System.out.println("���� : " + price);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
