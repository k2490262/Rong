<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btn").onclick = function() {
			alert("ok");
		}
	}
</script>
</head>
<body>
	<button id="btn">클릭</button>
</body>
</html>