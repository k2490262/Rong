<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btnRemove").onclick = function() {
			var img = document.getElementsByTagName("img");
			document.body.removeChild(img[2]);
		}
	}
</script>
</head>
<body>
	<img src="../cloth1.jpg">
	<img src="../cloth2.jpg">
	<img id="img" src="../cloth3.jpg">
	<img src="../cloth4.jpg">
	<img src="../cloth5.jpg">
	<button id="btnRemove">삭제</button>
</body>
</html>