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
	<%
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();
		BoardVo b = dao.getBoard(no, false);
	%>
	<h2>�Խù� ����</h2>
	<form action="updateBoardOk.jsp" method="post">
		<input type="hidden" name = "no" value="<%= b.getNo() %>">
		���� : <input type="text" name="title" value="<%= b.getTitle() %>"><br>
		�ۼ��� : <input type="text" name="writer" readonly="readonly" value="<%= b.getWriter() %>"><br>
		��ȣ : <input type="password" name="pwd"><br>
		���� : <br>
		<textarea rows="10" cols="80" name="content"><%= b.getContent() %></textarea><br>
		<input type="submit" value="����">
</form>
</body>
</html>