<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dao.BoardDao"%>
<%@page import="com.bit.vo.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>�Խ���</h2>
<%
	BoardDao dao = new BoardDao();
	if (request.getMethod().equals("POST")) {
		request.setCharacterEncoding("euc-kr");
		// int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String pwd = request.getParameter("pwd");
		String content = request.getParameter("content");
		
		BoardVo b = new BoardVo(0, title, writer, pwd, content, null, 0);
		int re = dao.insertBoard(b);
	}
	
	// dao�� ���� ��� �Խù� ����� ������ list�� ��´�.
	ArrayList<BoardVo> list = dao.listAll();
%>
<form action="boardTest.jsp" method="post">
	���� : <input type="text" name="title"><br>
	�ۼ��� : <input type="text" name="writer"><br>
	��ȣ : <input type="password" name="pwd"><br>
	���� : <br>
	<textarea rows="10" cols="80" name="content"></textarea><br>
	<input type="submit" value="���">
</form>

<table border="1" width="80%">
	<tr>
		<td>�۹�ȣ</td>
		<td>����</td>
		<td>�ۼ���</td>
		<td>�����</td>
		<td>��ȸ��</td>
	</tr>
	<%
	// list�� ������ ����ŭ �ݺ������Ͽ� tr�� �����ϵ��� �ض�.
	for (BoardVo b : list) {
		%>
			<tr>
				<td><%= b.getNo() %></td>
				<td>
					<a href="detailBoard.jsp?no=<%= b.getNo() %>"><%= b.getTitle() %></a>
				</td>
				<td><%= b.getWriter() %></td>
				<td><%= b.getRegdate() %></td>
				<td><%= b.getHit() %></td>
			</tr>
		<%
	}
	%>
</table>
</body>
</html>