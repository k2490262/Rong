<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dao.BookDao"%>
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
		ArrayList<String> list = dao.listBookExpensive();
		
	%>
	<h2>���ǻ纰 ��հ����� ��� �������</h2>
	<table border="1" width="60%">
		<%
			for(String bookname:list){
				%>
					<tr>
						<td> <%= bookname %> </td>
					</tr>
				<%
			}
		%>
	</table>
</body>
</html>