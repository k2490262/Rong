<%@page import="com.bit.dao.DeptDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�μ� ���</h2>
	<hr>
	<%
		DeptDao dao = new DeptDao();
		int dno = dao.getNextDno();
	%>
	<form action="insertDeptOk.jsp" method="post">
		�μ���ȣ : <input type="text" readonly="readonly" name="dno" value = "<%= dno %>"><br>
		�μ��� : <input type="text" name="dname"><br>
		�μ���ġ : <input type="text" name="dloc"><br>
		<input type="submit" value="���">
		</form>
</body>
</html>