<%@page import="com.bit.vo.CenterVo"%>
<%@page import="com.bit.dao.CenterDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>���� ���</h2>
<hr>
	<form action="insertCenterOk.jsp" method="post">
		�����ڵ� : <input type="text" name="c_no"><br>
		������ : <input type="text" name="c_name"><br>
		��ȭ��ȣ : <input type="text" name="c_tel"><br>
		�ּ� : <input type="text" name="c_addr"><br>
		<input type="submit" value="���">
		<input type="reset" value="���">
	</form>
</body>
</html>