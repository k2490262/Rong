package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.bit.db.ConnectionProvider;
import com.bit.vo.DeptVo;

public class DeptDao {
	// ���� �ѱ��ŰǼ��� �ѱ��ž�, ��ձ��ž��� ��ȯ�ϴ� �޼ҵ�
	// ��, �ѱ��ž��� ���������� ���
	public ArrayList<Map<String, String>> listOrdersByCustomer() {
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		String sql = "select name, count(*) as �ѱ��ŰǼ�, " + 
				"sum(saleprice) as �ѱ��ž�, " +
				"round(avg(saleprice),0) as ��ձ��ž� " + 
				"from customer c, orders o " +
				"where c.custid = o.custid " +
				"group by name order by sum(saleprice) desc";
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> map = new HashMap<String, String>();
//				map.put("name", rs.getString(1));
				map.put("name", rs.getString("NAME"));
				map.put("cnt", rs.getString("�ѱ��ŰǼ�"));
				map.put("tot", rs.getString("�ѱ��ž�"));
				map.put("avg", rs.getString("��ձ��ž�"));
				// index�ε� ������ �� �ְ�, �÷����ε� ������ �� �ִ�.
				
				list.add(map);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
	
	// ���� �μ���ȣ�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
	public int getNextDno() {
		int dno = 0;
		String sql = "select max(dno) + 100 from dept";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				dno = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dno;
	}

	public int insertDept(DeptVo d) {
		int re = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			String sql = "insert into dept values(?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, d.getDno());
			pstmt.setString(2, d.getDname());
			pstmt.setString(3, d.getDloc());
			re = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
