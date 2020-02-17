<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#parent{
		width: 300px;
		height: 300px;
		background: yellow;
	}
	
	#child{
		position:static;
		margin-top:100px;
		width: 600px;
		height: 600px;
		background: blue;
	}
</style>
</head>
<body>
	<div id="parent">
		<div id="child"></div>
	</div>
	
	<!-- 
		position의 기본값은 static 이며
		부모의 margin이 설정되지 않으면
		자식의 margin이 설정됩니다.	
	 -->
</body>
</html>












