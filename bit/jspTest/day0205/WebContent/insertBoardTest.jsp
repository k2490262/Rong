<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�Խù� ���</h2>
	<hr>
	<form action="insertBoardTestOk.jsp" method="post" enctype="multipart/form-data">
		<table width="80%">
			<tr>
				<td>������</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>�ۼ���</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>��ȣ</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>�۳���</td>
				<td><textarea rows="10" cols="80" name="content"></textarea></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="file" name="fname"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="���">
					<input type="reset" value="���">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>