<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#box{
		width: 300px;
		height: 300px;
		background: yellow;
		
		animation-name:changeWidth;
		animation-duration:3s;
		animation-timing-function:ease;
		animation-iteration-count:6;
		animation-direction:alternate;
		animation-delay:2s;
		
		
	}
	
	@keyframes changeWidth{
		0% {width:300px;}
		50% { background:red; }
		100% {width:600px;}
	}
	
	
</style>
</head>
<body>
	<div id="box"></div>
</body>
</html>








