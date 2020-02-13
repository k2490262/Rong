package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {
	public static int totalRecord;			//��ü ���ڵ���� �����ϱ� ���� ����
	public static final int pageSIZE = 10;	//�� ȭ�鿡 ������ ���ڵ� ���� �����ϱ� ���� ����
	public static int totalPage;			//��ü ������ ���� �����ϱ� ���� ����
	public static int pageGROUP = 5;		//�� ȭ�鿡 ������ �������� ���� �����ϱ� ���� ����
	//���ο� �� ��ȣ�� ��ȯ�ϴ� �޼ҵ带 ����
	public int getNextNo() {
		int re = 0;
		String sql = "select nvl(max(no), 0) + 1 from board";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				re = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	//��ü ���ڵ� ���� ��ȯ�ϴ� �޼ҵ带 ����
	public int getTotalRecord() {
		int n = 0;
		try {
			String sql = "select count(*) from board";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				n = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	//�Խù� ��ȣ�� �Ű������� ���޹޾� 
	//�ش� �Խù��� ��ȸ�� ������ ���� �޼ҵ带 ����
	public void updateHit(int no) {
		try {
			String sql = "update board set hit = hit + 1 where no = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(4, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//�Խù� ������ ���� �޼ҵ�
	public int updateBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "update board set title = ?, content = ?, fname = ? "
					+ "where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(2, b.getFname());
			pstmt.setInt(4, b.getNo());
			pstmt.setString(5, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	//�Խù���ȣ�� ��ȣ�� �Ű������� ���޹޾� �ش� �Խù��� �����ϴ� �޼ҵ�
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	public boolean isImage(String fname) {
		boolean re = false;
		if(fname != null) {
			fname = fname.toLowerCase();
			String[] arr = {".jpg", ".gif", ".png", ".bmp", "jpeg"};
			for(int i = 0; i < arr.length; i++) {
				if(fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}
	public BoardVo getBoard(int no) {
		BoardVo b = new BoardVo();
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setPwd(rs.getString("pwd"));
				b.setHit(rs.getInt("hit"));
				b.setContent(rs.getString("content"));
				b.setRegdate(rs.getDate("regdate"));
				b.setFname(rs.getString("fname"));
				b.setIp(rs.getString("ip"));
				b.setB_ref(rs.getInt("b_ref"));
				b.setB_level(rs.getInt("b_level"));
				b.setB_step(rs.getInt("b_step"));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		}catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public ArrayList<BoardVo> listAll(int pageNUM){
		totalRecord = getTotalRecord();
		totalPage = totalRecord / pageSIZE;
		if(totalRecord % pageSIZE != 0) {
			totalPage++;
		}
		System.out.println("��ü��������:"+totalPage);
		//���� �������� ������ ���� ���ڵ��� ��ġ�� ����ؿ�.
		//���� ��ü ���ڵ尡 43���̰�
		//���� �������� 1������ ���
		//���� ���ڵ��� ��ġ�� 1
		//���� ���� �������� 2��������� ���� ���ڵ��� ��ġ�� 11
		int start = (pageNUM - 1) * pageSIZE + 1;
		int end = start + pageSIZE - 1;
		if(end > totalRecord) {
			end = totalRecord;
		}
		
		
		
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select no, title, writer, pwd, hit, regdate, content, fname, ip, b_ref, b_level, b_step " + 
				"	from (select rownum n, no, title, writer, pwd, hit, regdate, content, fname, ip, b_ref, b_level, b_step " + 
				"					from (select * " + 
				"									from board" + 
				"								 order by b_ref desc, b_step)" + 
				"				)" + 
				"	where n between ? and ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVo b = new BoardVo();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setHit(rs.getInt("hit"));
				b.setRegdate(rs.getDate("regdate"));
				b.setIp(rs.getString("ip"));
				b.setB_ref(rs.getInt("b_ref"));
				b.setB_level(rs.getInt("b_level"));
				b.setB_step(rs.getInt("b_step"));
				list.add(b);
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	public int insertBoard(BoardVo b) {
		int re = -1;
		//�ϴ��� �����̶�� ���� b_ref�� �۹�ȣ�� �����ϰ�,
		
		int no = getNextNo();
		//vo�� �Ǹ� �۹�ȣ(
		int p_no = b.getNo();
		
		//b_level�� b_step�� 0���� �����Ѵ�.
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		//���࿡ ��۴ޱ� �ΰ���?
		if(p_no != 0) {
			BoardVo p = getBoard(p_no);
			b_ref = p.getB_ref();
			//�θ���� b_level�� b_step�� ���� �Ϳ�.
			b_level = p.getB_level();
			b_step = p.getB_step();
			
			//�ֽ��� ����� ���� ����ϱ� ���Ͽ� 
			//�̹� �޷��ִ� ��۵��� b_step�� 1�� �����ϱ� ���� �޼ҵ带 ȣ��
			updateStep(b_ref, b_step);
			b_level++;
			b_step++;
		}
		String sql = "insert into board(no, title, writer, pwd, hit, "
				+ "regdate, content, fname, ip, b_ref, "
				+ "b_level, b_step) " + 
				"values(?, ?, ?, ?, 0, "
				+ "sysdate, ?, ?, ?, ?, "
				+ "?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			pstmt.setString(6, b.getFname());
			pstmt.setString(7, b.getIp());
			pstmt.setInt(8, b_ref);
			pstmt.setInt(9, b_level);
			pstmt.setInt(10, b_step);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	private void updateStep(int b_ref, int b_step) {
		//���� ����� �ۼ��Ϸ��� �ϴ� �θ�ۿ�
		//�̹� �޷� �ִ� ��۵��� b_step�� 1�� �������ѿ�.
		//���� �ۼ��Ϸ��� �۰� b_ref�� ����
		//���� �ۼ��Ϸ��� ���� b_step���� �� ū �͵�.
		String sql = "update board set b_step = b_step + 1 where b_ref = ? and b_step > ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_ref);
			pstmt.setInt(2, b_step);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
