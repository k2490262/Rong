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
		String ip = request.getRemoteAddr();
		System.out.println("��û�� ���� ip�ּ� : " + ip);
	%>
	�ݰ����ϴ�.
	<%=ip%>���� �����Ͽ����ϴ�.
</body>
</html>