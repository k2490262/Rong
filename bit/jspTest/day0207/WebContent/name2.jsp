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
	String name = "ȫ�浿";
%>
�̸� : <%= name %><br>
<jsp:include page = "age2.jsp">
	<jsp:param value="25" name="age"/>
	<jsp:param value="seoul" name="addr"/>
</jsp:include>
</body>
</html>