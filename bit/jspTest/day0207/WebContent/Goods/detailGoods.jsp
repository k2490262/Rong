<%@page import="com.bit.vo.GoodsVo"%>
<%@page import="com.bit.dao.GoodsDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�󼼺���</h2>
	<hr>
	<%
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDao dao = new GoodsDao();
		GoodsVo g = dao.getGoods(no);
	%>
	��ǰ��ȣ : <%= g.getNo() %><br>
	��ǰ�� : <%= g.getItem() %><br>
	���� : <%= g.getPrice() %><br>
	���� : <%= g.getQty() %><br>
	<img src="../upload/<%=g.getFname()%>" width="200" height="200"><br>
	�󼼼��� : <br>
	<textarea rows="10" cols="80" readonly="readonly"><%= g.getDetail() %></textarea>
	<hr>
	<a href="updateGoods.jsp?no=<%=g.getNo()%>">����</a>
	<a href="deleteGoods.jsp?no=<%=g.getNo()%>">����</a>
</body>
</html>