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
	<%
		BookDao dao = new BookDao();	
		ArrayList<BookVo> list = dao.listBook();
	%>
	
	<h2>������ ������ �� ���</h2>
	<form action="ListCustomerByBookOk.jsp" method="post">
		������ȣ : 
		<select name="bookid">
			<%
				for(BookVo b : list) {
			%>
			<option value="<%= b.getBookid() %>"><%= b.getBookname() %></option>
			<%
				}
			%>
		</select>
		<input type="submit" value="�˻�">
			
	</form>
</body>
</html>