<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("button").click(function() {
			$("*").css("color", "blue");
			$(this).css("color", "black");
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>홍길동</h2>
	<h4>서울</h4>
	
	<h2>이순신</h2>
	<h4>부산</h4>
	
	<h2>유관순</h2>
	<h4>전주</h4>
	
	<button id="btn">파랗게!</button>
</body>
</html>