<%@page import="com.bit.vo.BoardVo"%>
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
<h2>�Խù� ��</h2>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao dao = new BoardDao();
	BoardVo b = dao.getBoard(no, true);
%>
	�۹�ȣ : <%= b.getNo() %><br>
	���� : <%= b.getTitle() %><br>
	�ۼ��� : <%= b.getWriter() %><br>
	���� : <br>
	<textarea rows="10" cols="80" readonly="readonly"><%= b.getContent() %></textarea>
	<br>
	����� : <%= b.getRegdate() %><br>
	��ȸ�� : <%= b.getHit() %><br>
	<a href="updateBoard.jsp?no=<%= no %>">����</a>
	<a href="deleteBoard.jsp?no=<%= no %>">����</a>
</body>
</html>