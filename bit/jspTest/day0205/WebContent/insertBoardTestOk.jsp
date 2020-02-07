<%@page import="com.bit.dao.BoardDao"%>
<%@page import="com.bit.vo.BoardVo"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		request.setCharacterEncoding("euc-kr");
		String path = request.getRealPath("upload");
		System.out.println(path);

		// ������ ���ε��ϸ鼭 ������� �Է������� �޾ƿ��� ���� MultiopartRequest��ü�� �����մϴ�.
		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");
		
		/*
		���ε��� ������ ������ MultipartRequest��ü �����ÿ� �̹� ���簡 �Ǿ����ϴ�.
		���� ������ ����(������, �ۼ���, �۳���, ��ȣ)�� multi�� ���ؼ� �޾ƿɴϴ�.
		*/
		BoardVo b = new BoardVo();
		b.setTitle(multi.getParameter("title"));
		b.setWriter(multi.getParameter("writer"));
		b.setPwd(multi.getParameter("pwd"));
		b.setContent(multi.getParameter("content"));
		
		// b.setFname(multi.getParameter("fname"));
		// �����̸��� �̷��� �ϸ� �ȵǿ�!
		// ���ϸ��� ���� ���� �ƴ϶� ������ ������ ���� ������ �̷��� ���� �� �����
		b.setFname(multi.getOriginalFileName("fname"));
		// ���ϸ��� ���� ���� �޾ƿ;� �ؿ�!
		
		BoardDao dao = new BoardDao();
		int re = dao.insertBoard(b);
		if (re > 0) {
			%>
				�Խù� ��Ͽ� �����Ͽ����ϴ�.
			<%
		} else {
			%>
				�Խù� ��Ͽ� �����Ͽ����ϴ�.
			<%
		}
	%>
</body>
</html>