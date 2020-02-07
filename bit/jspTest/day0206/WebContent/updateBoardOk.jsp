<%@page import="java.io.File"%>
<%@page import="com.bit.vo.BoardVo"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.bit.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		BoardDao dao = new BoardDao();
		request.setCharacterEncoding("euc-kr");

		String path = request.getRealPath("upload");
		System.out.println(path);

		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");
		int no = Integer.parseInt(multi.getParameter("no"));

		// ���� �Խù��� ������ �ִ� ��� ������ ������ ������ ����
		// isDel�� �޾ƿɴϴ�.
		String isDel = multi.getParameter("isDel");
		System.out.println(isDel);
		
		//������ �ϱ� ���� �̸� ���� ���ϸ��� ������ �Ӵϴ�.
		String oldFname = dao.getBoard(no).getFname();
		String fname = multi.getOriginalFileName("fname");

		BoardVo b = new BoardVo();
		b.setNo(no);
		b.setTitle(multi.getParameter("title"));
		b.setPwd(multi.getParameter("pwd"));
		b.setContent(multi.getParameter("content"));

		// �ϴ� ������ �����̸��� vo�� ��� 
		// ���� ���ϵ� �����Ѵٸ� ���ο� ���ϸ��� vo�� ��ƿ�
		b.setFname(oldFname);
		if (fname != null) {
			b.setFname(fname);
		}
		
		if (isDel != null && isDel.equals("1")) {
			b.setFname(null);
		}
		
		int re = dao.updateBoard(b);

		// �Խù� ������ �����߰� �� �Խù��� ���� ������ �ִ� �Խù��̾���
		// ��, ���ϵ� �����ߴٸ� ���� ������ �����ؿ�
		if (re > 0) {
			if (oldFname != null && fname != null) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
			
			// ������ ������ �־���, �Խù� ������ �������� ��
			// ������ ����⸦ ���Ѵٸ�
			if (isDel != null && isDel.equals("1")) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
	%>
	�Խù� ������ �����Ͽ����ϴ�.
	<%
		} else {
			if (fname != null) {
				File file = new File(path + "/" + fname);
				file.delete();
			}
	%>
	�Խù� ������ �����Ͽ����ϴ�.
	<%
		}
	%>
	<hr>
	<a href="insertBoard.jsp">���۵��</a>
	<a href="listBoard.jsp">�۸��</a>
</body>
</html>