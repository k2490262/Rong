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
	int no = Integer.parseInt(request.getParameter("no"));
	String pwd = request.getParameter("pwd");
	BoardDao dao = new BoardDao();
	int re = dao.deleteBoard(no, pwd);
	if (re > 0) {
		response.sendRedirect("boardTest.jsp");
	}
%>

<font color = "red">������ �����Ͽ����ϴ�.</font><br>
<a href="boardTest.jsp">�Խù� ���</a>

</body>
</html>