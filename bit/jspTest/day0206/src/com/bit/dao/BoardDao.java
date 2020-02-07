package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {

	// �Խù� ��ȣ�� �Ű������� ���޹޾� �ش� �Խù��� ��ȸ�� ������ ���� �޼ҵ�
	public void updateHit(int no) {
		String sql = "update board set hit = hit + 1 where no = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// �Խù� ������ ���� �޼ҵ�
	public int updateBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "update board set title = ?, content = ?, fname = ? where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getFname());
			pstmt.setInt(4, b.getNo());
			pstmt.setString(5, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	// �Խù���ȣ�� ��ȣ�� �Ű������� ���޹޾� �ش� �Խù��� �����ϴ� �޼ҵ�
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no = ? and pwd = ?";
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
	
	// ���ϸ��� �Ű������� ���޹޾� �̹��� �������� �Ǻ��ϴ� �޼ҵ�
	public boolean isImage(String fname) {
		boolean re = false;

		if (fname != null) {
			fname = fname.toLowerCase();
			String[] arr = { ".jpg", ".jpeg", ".png", ".gif", ".bmp" };
			for (int i = 0; i < arr.length; i++) {
				if (fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}

	// �Խù� ��ȣ�� �Ű������� ���޹޾� �ش� �Խù��� ������ vo�� ��� ��ȯ�ϴ� �޼ҵ�
	public BoardVo getBoard(int no) {
		BoardVo b = new BoardVo();
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setPwd(rs.getString("pwd"));
				b.setHit(rs.getInt("hit"));
				b.setContent(rs.getString("content"));
				b.setRegdate(rs.getDate("regdate"));
				b.setFname(rs.getString("fname"));
				b.setIp(rs.getString("ip"));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}

	public int insertBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "insert into board values(seq_board.nextval, ?, ?, ?, 0, sysdate, ?, ?, ?)";
			// ����ǥ�� ���� ������� ���� �����.

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getWriter());
			pstmt.setString(3, b.getPwd());
			pstmt.setString(4, b.getContent());
			pstmt.setString(5, b.getFname());
			pstmt.setString(6, b.getIp());			
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public ArrayList<BoardVo> listAll() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select * from board order by no desc";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// �۹�ȣ, ������, �ۼ���, ��ȸ��, �����
			while (rs.next()) {
				BoardVo b = new BoardVo();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setHit(rs.getInt("hit"));
				b.setRegdate(rs.getDate("regdate"));
				b.setIp("ip");
				list.add(b);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

}
