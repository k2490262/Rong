<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${manager != null}">
		관리자 로그인에 성공
	</c:if>
	<c:if test="${manager != null}">
		관리자 로그인에 실패
	</c:if>
</body>
</html>