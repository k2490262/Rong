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
	int age = 20;
	if (request.getParameter("age") != null) {
		age = Integer.parseInt(request.getParameter("age"));
	}
%>
���̴� <%= age %>�� �Դϴ�.
�ּ� : <%= request.getParameter("addr") %>
</body>
</html>