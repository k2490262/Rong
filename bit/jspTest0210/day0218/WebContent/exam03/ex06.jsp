<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#img1{
		transform:rotate(45deg);
		margin: 100px;
	}
	
	#img2{
		transform:scale(2,2);
		position: relative;
		left: 100px;
	}
	
	#img3{
		transform:skew(10deg,20deg);
		position: relative;
		left: 100px;
		margin: 100px;
	}
	
	img{
		display: block;
	}
	
</style>
</head>
<body>
	<img src="cloth1.jpg">
	<img id="img1" src="cloth1.jpg">
	<img id="img2" src="cloth1.jpg">
	<img id="img3" src="cloth1.jpg">
</body>
</html>