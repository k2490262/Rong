<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementsByTagName("a")[0].onclick = function() {
			this.style.color = "red";
			return false;
		}
	}
</script>
</head>
<body>
	<a href="hello.jsp">안녕</a>
</body>
</html>