<%@page import="com.bit.dao.DeptDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>ȸ���� ���ų���</h2>
<%
	DeptDao dao = new DeptDao();
	ArrayList<Map<String, String>> list =dao.listOrdersByCustomer();
%>
<table border="1" width="80%">
	<tr>
		<td>����</td>
		<td>�ѱ��ŰǼ�</td>
		<td>�ѱ��ž�</td>
		<td>��ձ��ž�</td>
	</tr>
	<%
		for (Map<String, String> map : list) {
			%>
			<tr>
				<td><%= map.get("name") %></td>			
				<td><%= map.get("cnt") %></td>			
				<td><%= map.get("tot") %></td>			
				<td><%= map.get("avg") %></td>
			</tr>
			<%			
		}
	%>
</table>
</body>
</html>