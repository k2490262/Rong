package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bit.db.ConnectionProvider;
import com.bit.vo.MemberVo;

// O		R			M
// Object	Relation	Mapping
// mybatis, hibernate
public class MemberDao {

	// ���̵�� ��ȣ�� �Ű������� ���޹޾� �ùٸ� ȸ������ �Ǻ��Ͽ� ����� ��ȯ�ϴ� �޼ҵ� ����
	public boolean isMember(String id, String pwd) {
		boolean re = false;
		String sql = "select * from member where id = ? and pwd = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				re = true;
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int insertMember(MemberVo m) {
		int re = -1;
		try {
			String sql = "insert into member values(?, ?, ?, ?, to_date(?, 'yyyy/mm/dd'), ?, ?, ?, ?, ?, ?, ?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getTel());
			pstmt.setString(5, m.getBirth());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getGender());
			pstmt.setString(8, m.getBloodtype());
			pstmt.setString(9, m.getHobby());
			pstmt.setString(10, m.getUrl());
			pstmt.setString(11, m.getJob());
			pstmt.setString(12, m.getIntro());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
