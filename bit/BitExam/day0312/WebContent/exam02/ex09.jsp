<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("button").click(function() {
			var sel = "#" + $(this).html();
			$(sel).css("color", "red");
		});
	});
</script>
</head>
<body>
	<div id="a">
		<h1>A입니다.</h1>
		<div id="ad">
			<h1 id="adh1">홍길동</h1>
			<h2 id="adh2">서울</h2>
		</div>
	</div>
	<div id="b">
		<h1>B입니다.</h1>
		<div id="bd">
			<h1 id="bdh1">이순신</h1>
			<h2 id="bdh2">전주</h2>
		</div>
	</div>

	<button>a > h1</button>
	<button>b > h1</button>
	<button>a *</button>
	<button>b *</button>
</body>
</html>