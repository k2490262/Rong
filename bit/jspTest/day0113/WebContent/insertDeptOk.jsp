<%@page import="com.bit.dao.DeptDao"%>
<%@page import="com.bit.vo.DeptVo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		int dno = Integer.parseInt(request.getParameter("dno"));
		String dname = request.getParameter("dname");
		String dloc = request.getParameter("dloc");
		DeptDao dao = new DeptDao();
		DeptVo d = new DeptVo(dno, dname, dloc);
		int re = dao.insertDept(d);
		if (re > 0) {
	%>
	<font color="blue">�μ���Ͽ� �����Ͽ����ϴ�.</font>
	<%
		} else {
	%>
	<font color="red">�μ���Ͽ� �����Ͽ����ϴ�.</font>
	<%
		}
	%>
</body>
</html>