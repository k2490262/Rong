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
	<h2>�Խù� ���</h2>
	<hr>
	<%
		if (session.getAttribute("id") == null) {
			response.sendRedirect("login.jsp");
		}
	
		BoardDao dao = new BoardDao();
		ArrayList<BoardVo> list = dao.listAll();
		String path = request.getRealPath("upload");
		System.out.println(path);
	%>
	<a href="insertBoard.jsp">���ο� �� �ۼ�</a><br>
	<table border="1" width="100%">
		<tr>
			<td>�۹�ȣ</td>
			<td>������</td>
			<td>�ۼ���</td>
			<td>��ȸ��</td>
			<td>�����</td>
			<td>IP�ּ�</td>
		</tr>
		<%
			for (BoardVo b : list) {
				%>
				<tr>
					<td><%= b.getNo() %></td>
					<td>
					<a href="detailBoard.jsp?no=<%=b.getNo()%>"><%= b.getTitle() %></a>
					</td>
					<td><%= b.getWriter() %></td>
					<td><%= b.getHit() %></td>
					<td><%= b.getRegdate() %></td>
					<td><%= b.getIp() %></td>
				</tr>
				<%
			}
		%>
	</table>
</body>
</html>