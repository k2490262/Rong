<%@page import="com.bit.dao.BookDao"%>
<%@page import="com.bit.vo.BookVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>���� ��õ����</h2>
	<form action="recommendList.jsp" method="post">
		�̸� : <input type="text" name="name"> <input type="submit"
			value="��õ">
	</form>
	<%
		if (request.getMethod().equals("POST")) {
			request.setCharacterEncoding("euc-kr");
			String name = request.getParameter("name");
			BookDao dao = new BookDao();
			List<BookVo> list = dao.listRecommend(name);
	%>
	<table border="1" width="80%">
		<tr>
			<td>������ȣ</td>
			<td>������</td>
			<td>���ǻ�</td>
			<td>����</td>
		</tr>
		<%
			for (BookVo b : list) {
		%>
		<tr>
			<td><%=b.getBookid()%></td>
			<td><%=b.getBookname()%></td>
			<td><%=b.getPublisher()%></td>
			<td><%=b.getPrice()%></td>
		<tr>
			<%
				}
			%>
		
	</table>
	<%
		}
	%>
</body>
</html>