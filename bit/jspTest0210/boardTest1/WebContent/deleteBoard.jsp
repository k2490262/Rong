<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css">
</head>
<body>
	<h2>게시물 삭제</h2>
	<form action="deleteBoardOk.do" method="post">
		<input type="hidden" name="no" value="${no }">
		<input type="password" name="pwd">
		<input type="submit" value="삭제">
	</form>
</body>
</html>









