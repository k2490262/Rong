<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${head }</h2>
	<hr>
	<form action="insertBoard.do" method="post"
		encType="multipart/form-data">
		<table>
			<input type="hidden" name="no" value="${no }">
			<tr>
				<td>글 제목</td>
				<td><input type="text" name="title" value="${title }"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td><textarea rows="10" cols="80" name="content"></textarea></td>
			</tr>
			<tr>
				<td>파일</td>
				<td><input type="file" name="uploadFile"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>