package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {

	public static int totalRecord; // ��ü ���ڵ� ���� �����ϱ� ���� ����

	public static int pageSIZE = 10; // �� ȭ�鿡 ������ ���ڵ���� �����ϱ� ���� ����

	public static int totalPage; // ��ü ������ ���� �����ϱ� ���� ����
	
	public static int pageGROUP = 5; // �� ȭ�鿡 ������ �������� ���� �����ϱ� ���� ����

	// ��ü���ڵ���� ��ȯ�ϴ� �޼ҵ带 ����
	public int getTotalRecord() {
		int n = 0;
		try {
			String sql = "select count(*) from board";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				n = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return n;
	}

	// �Խù� ��ȣ�� �Ű������� ���޹޾�
	// �ش� �Խù��� ��ȸ�� ������ ���� �޼ҵ带 ����
	public void updateHit(int no) {
		String sql = "update board set hit=hit+1 where no=?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// �Խù� ������ ���� �޼ҵ�
	public int updateBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "update board set title=?, content=?, fname=? " + "where no=? and pwd=?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getFname());
			pstmt.setInt(4, b.getNo());
			pstmt.setString(5, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}

	// �Խù���ȣ�� ��ȣ�� �Ű������� ���޹޾� �ش�Խù��� �����ϴ� �޼ҵ�
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no=? and pwd=?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}

	// ���ϸ��� �Ű������� ���޹޾� �̹��� �������� �Ǻ��ϴ� �޼ҵ�
	public boolean isImage(String fname) {
		boolean re = false;

		if (fname != null) {
			fname = fname.toLowerCase();
			String[] arr = { ".jpg", ".gif", ".png", ".bmp", ".jpeg" };
			for (int i = 0; i < arr.length; i++) {
				if (fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}

	// �Խù� ��ȣ�� �Ű������� ���޹޾� �ش�Խù��� ������
	// Vo�� ��� ��ȯ�ϴ� �޼ҵ�
	public BoardVo getBoard(int no) {

		BoardVo b = new BoardVo();
		try {
			String sql = "select * from board where no=?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setWriter(rs.getString(3));
				b.setPwd(rs.getString(4));
				b.setHit(rs.getInt(5));
				b.setRegdate(rs.getDate(6));
				b.setContent(rs.getString(7));
				b.setFname(rs.getString(8));
				b.setIp(rs.getString(9));
			}

			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return b;
	}

	public ArrayList<BoardVo> listAll(int pageNUM) {
		totalRecord = getTotalRecord();
		totalPage = totalRecord / pageSIZE;
		if (totalRecord % pageSIZE != 0) {
			totalPage++;
		}
		System.out.println("��ü������ �� : " + totalPage);
		
		// ���� �������� ������ ���۷��ڵ��� ��ġ�� ����ؿ�.
		// ���� ��ü ���ڵ尡 43���̰� ���� �������� 1��������� ���۷��ڵ��� ��ġ�� 1
		// ���� ���� �������� 2��������� ���۷��ڵ��� ��ġ�� 11
		int start = (pageNUM - 1) * pageSIZE + 1;
		int end = start + pageSIZE - 1;
		if (end > totalRecord) {
			end = totalRecord;
		}
		
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select no, title, writer, pwd, hit, regdate, content, fname, ip from " + 
				" (select rownum n, no, title, writer, pwd, hit, regdate, content, fname, ip from " + 
				" (select * from board order by no desc))" + 
				" where n between ? and ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			ResultSet rs = pstmt.executeQuery();
			// �۹�ȣ, ������, �ۼ���,��ȸ��, �����
			while (rs.next()) {
				BoardVo b = new BoardVo();
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setWriter(rs.getString(3));
				b.setHit(rs.getInt(5));
				b.setRegdate(rs.getDate(6));
				b.setIp(rs.getString(9));
				list.add(b);
			}

			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int insertBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "insert into board values(seq_board.nextval,?,?,?,0,sysdate,?,?,?)";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getWriter());
			pstmt.setString(3, b.getPwd());
			pstmt.setString(4, b.getContent());
			pstmt.setString(5, b.getFname());
			pstmt.setString(6, b.getIp());

			re = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}
}
