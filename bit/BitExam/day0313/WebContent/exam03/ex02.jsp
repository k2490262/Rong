<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.high_light{
		background: yellow;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("h2").bind("click", function() {
			alert($(this).html());
		});
		
		$("h2").bind("mouseover", function() {
			$(this).addClass("high_light");
		});
		
		$("h2").bind("mouseleave", function() {
			$(this).removeClass("high_light");
		});
	});
</script>
</head>
<body>
	<h2>홍길동</h2>
	<h2>이순신</h2>
	<h2>유관순</h2>
</body>
</html>