<%@page import="com.bit.dao.BookDao"%>
<%@page import="com.bit.vo.BookVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�������</h2>
	<hr>
	<%
		request.setCharacterEncoding("euc-kr");
		String keyword = request.getParameter("keyword");
		if (keyword != null) {
		}
		String sortField = request.getParameter("sortField");
		if (sortField != null) {
		}
		BookDao dao = new BookDao();
		ArrayList<BookVo> list = dao.listAll(sortField, keyword);
	%>

	<form action="listBook.jsp" method="post">
		���ǻ�� : <input type="text" name="keyword"> <input type="submit"
			value="�˻�">
	</form>

	<table border="1" width="80%">
		<tr>
			<td><a href="listBook.jsp?sortField=bookid">������ȣ</a></td>
			<td><a href="listBook.jsp?sortField=bookname">������</a></td>
			<td><a href="listBook.jsp?sortField=publisher">���ǻ�</a></td>
			<td><a href="listBook.jsp?sortField=price">����</a></td>
		<tr>
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
</body>
</html>