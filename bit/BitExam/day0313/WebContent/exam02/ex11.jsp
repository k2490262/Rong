<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			$("div").append($("h1").clone());
		});
	});
</script>
</head>
<body>
	<h1>홍길동</h1>
	<hr>
	<div></div>
	<hr>
	<button id="btn">복사</button>
</body>
</html>