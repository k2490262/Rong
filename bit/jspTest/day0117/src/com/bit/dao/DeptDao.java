package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.DeptVo;

public class DeptDao {
	
	// ��� �μ������ ArrayList�� ��� ��ȯ�ϴ� �޼ҵ�
	public ArrayList<DeptVo> listAll() {
		ArrayList<DeptVo> list = new ArrayList<DeptVo>();
		String sql = "select * from dept order by dno";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new DeptVo(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// DeptVo�� �Ű������� ���޹޾� insert�� �����ϴ� �޼ҵ�
	public int insertDept(DeptVo d) {
		int re = -1;
		String sql = "insert into dept values(?, ?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, d.getDno());
			pstmt.setString(2, d.getDname());
			pstmt.setString(3, d.getDloc());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	// DeptVo�� �Ű������� ���޹޾� ������ �ϴ� �޼ҵ�
	public int updateDept(DeptVo d) {
		int re = -1;
		String sql = "update dept set dname = ?, dloc = ? where dno = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getDname());
			pstmt.setString(2, d.getDloc());
			pstmt.setInt(3, d.getDno());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	public int deleteDept(int dno) {
		int re = -1;
		String sql = "delete from dept where dno = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
