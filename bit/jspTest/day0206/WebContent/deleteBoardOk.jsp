<%@page import="java.io.File"%>
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
	request.setCharacterEncoding("euc-kr");
	int no = Integer.parseInt(request.getParameter("no"));
	String pwd = request.getParameter("pwd");
	
	BoardDao dao = new BoardDao();
	
	String fname = dao.getBoard(no).getFname();
	// ���ϸ��� �̸� ������ ��ƵӴϴ�.
	
	String path = request.getRealPath("upload");
	// ������ �ִ� �ǰ�θ� �о�ɴϴ�.
	
	int re = dao.deleteBoard(no, pwd);
	
	if (re > 0) {
		if (fname != null) {
			File file = new File(path + "/" + fname);
			file.delete();
		}
		response.sendRedirect("listBoard.jsp");
	} else {
		%>
			�Խù� ������ �����Ͽ����ϴ�.<br>
			��й�ȣ�� �ٽ� Ȯ�����ּ���.
		<%
	}
%>
</body>
</html>