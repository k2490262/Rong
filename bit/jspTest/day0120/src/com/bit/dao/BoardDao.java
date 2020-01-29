package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {

	// ��� �Խù��� �˻��Ͽ� ArrayList�� ��ȯ�ϴ� �޼ҵ�
	public ArrayList<BoardVo> listAll() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select * from board order by no";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new BoardVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getDate(6), rs.getInt(7)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// BoardVo�� �Ű������� ���޹޾� �Խù� ����� ���� �޼ҵ�
	public int insertBoard(BoardVo b) {
		int re = -1;
		String sql = "insert into board values(?, ?, ?, ?, ?, sysdate, 0)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNextNo());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	// ������ ��ϵ� �Խù��� ��ȣ�� ��ȯ�ϴ� �޼ҵ�
	// �̹� ��ϵǾ� �ִ� �Խù���ȣ�� ���� ū ���� +1�� ����� ��ȯ�ϴ� �޼ҵ�
	public int getNextNo() {
		int no = 0;
		String sql = "select nvl(max(no), 0) + 1 from board";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				no = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return no;
	}

	// �۹�ȣ�� �Ű������� ���޹޾� �ش� �Խù��� ������ BoardVo�� ��ȯ�ϴ� �޼ҵ�
	public BoardVo getBoard(int no, boolean hitAdd) {
		if (hitAdd) {
			updateHit(no);
		}

		BoardVo b = null;
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				b = new BoardVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getDate(6), rs.getInt(7));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}

	// �۹�ȣ�� �Ű������� ���޹޾� �ش� �Խù��� ��ȸ���� 1 �����ϴ� �޼ҵ�
	// �Խù� ��ȣ�� 1���� �Խù��� ��ȸ���� 1 ����
	// update board set hit = hit + 1 where no = 1;
	public int updateHit(int no) {
		int re = -1;
		try {
			String sql = "update board set hit = hit + 1 where no = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	public int updateBoard(BoardVo b) {
		int re = -1;
		String sql = "update board set title = ?, content = ? where no = ? and pwd = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getNo());
			pstmt.setString(4, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	// �۹�ȣ�� ��ȣ�� �Ű������� ���޹޾� ��ġ�ϸ� �Խù��� �����ϴ� �޼ҵ�
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		String sql = "delete from board where no = ? and pwd = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
