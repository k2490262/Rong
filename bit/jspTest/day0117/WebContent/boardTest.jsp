<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�Խ���</h2>
	<%
		
	%>
	<form name="F" action="borderTest.jsp" method="post">
		�Խù� ��ȣ : <input type="number" readonly="readonly" name="no" id="no"><br>
		���� : <input type="text" name="title" id="title"><br>
		�ۼ��� : <input type="text" name="writer" id="writer"><br>
		��ȣ : <input type="text" name="pwd" id="pwd"><br>
		���� : <textarea name="content" id="content" rows="10" cols="80"></textarea>
	</form>
	<table border="1" width="80%">
		<tr>
			<td>�۹�ȣ</td>
			<td>����</td>
			<td>�ۼ���</td>
			<td>��ȣ</td>
			<td>�۳���</td>
			<td>�����</td>
			<td>��ȸ��</td>
		<tr>
	</table>
</body>
</html>