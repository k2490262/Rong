<%@page import="com.bit.dao.BookDao"%>
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
		ArrayList<String> list = dao.listPublisher();
	%>
	<h2>��Ȯ��</h2>
	<form action="ListCustomerByPublisherOk.jsp" method="post">
		���ǻ�� : <select name="publisher">
			<%
				for (String pub : list) {
			%>
			<option value="<%=pub%>"><%=pub%></option>
			<%
				}
			%>
		</select> <input type="submit" value="�˻�">
	</form>
</body>
</html>