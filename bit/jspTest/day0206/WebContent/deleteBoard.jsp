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
		int no = Integer.parseInt(request.getParameter("no"));
	%>
<h2>�Խù� ����</h2>
<form action="deleteBoardOk.jsp" method="post">
	<input type="hidden" name="no" value="<%=no%>">
	��ȣ : <input type="password" name="pwd">
	<input type="submit" value="����">
</form>
</body>
</html>