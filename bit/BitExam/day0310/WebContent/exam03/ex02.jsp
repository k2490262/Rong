<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../bit.js"></script>
<script type="text/javascript">
window.onload = function() {
	var arr = [];
	for (var i = 0; i < 100; i++) {
		arr.push(new MovingText()); // 비어있는 배열에 데이터를 추가하는 함수가 push
	}
	
	setInterval(function() {
		for (var i = 0; i < arr.length; i++) {
			arr[i].move();
		}
	}, 100);
}
</script>
</head>
<body>
</body>
</html>