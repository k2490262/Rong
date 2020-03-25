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
		$("#insertBefore").click(function() {
			$("<h2></h2>").html("이순신").insertBefore("#div");
		});
		$("#insertAfter").click(function() {
			$("<h2></h2>").html("이순신").insertAfter("#div");
		});
	});
</script>
</head>
<body>
	<h1>Hello</h1>
	<div id="div">
		<h2>홍길동</h2>
		<h2>홍길동</h2>
		<h2>홍길동</h2>
	</div>
	<h1>Java</h1>
	<button id="insertBefore">div 앞에 추가</button>
	<button id="insertAfter">div 뒤에 추가</button>
</body>
</html>