<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>도서상세</h2>
	도서번호 : ${b.bookid }<br>
	도서이름 : ${b.bookname }<br>
	출판사명 : ${b.publisher }<br>
	도서가격 : ${b.price }<br>
	<a href="deleteBook.do?bookid=${b.bookid }">삭제</a>
</body>
</html>