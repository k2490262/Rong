<%@page import="com.bit.vo.CustomerByPublisherVo"%>
<%@page import="com.bit.dao.CustomerDao"%>
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
		request.setCharacterEncoding("euc-kr");
		String publisher = request.getParameter("publisher");
		CustomerDao dao = new CustomerDao();
		ArrayList<CustomerByPublisherVo> list = dao.listCustomerByPublisher(publisher);
	%>
	<h2><%=publisher%>���ǻ��� ���� ���� ��
	</h2>
	<table border="1" width="80%">
		<tr>
			<td>��ID</td>
			<td>�̸�</td>
			<td>������</td>
			<td>���Ű���</td>
		</tr>
		<%
			for (CustomerByPublisherVo c : list) {
		%>
		<tr>
			<td><%=c.getCustid()%></td>
			<td><%=c.getName()%></td>
			<td><%=c.getBookname()%></td>
			<td><%=c.getSaleprice()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>