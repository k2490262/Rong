<%@page import="com.bit.vo.GoodsVo"%>
<%@page import="java.util.ArrayList"%>
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
	<h2>��ǰ���</h2>
	<hr>
	<%
		String path = request.getRealPath("upload");
		System.out.println(path);
	
		GoodsDao dao = new GoodsDao();
		ArrayList<GoodsVo> list = dao.listAll();
	%>
	<a href="insertGoods.html">��ǰ���</a><br>
	<table border="1" width="80%">
		<tr>
			<td>��ǰ��ȣ</td>
			<td>��ǰ��</td>
			<td>����</td>
			<td>����</td>
			<td>����</td>
		</tr>
		
		<%
			for (GoodsVo g : list) {
				%>
					<tr>
						<td><%=g.getNo()%></td>
						<td>
							<a href="detailGoods.jsp?no=<%=g.getNo()%>"><%= g.getItem() %></a>
						</td>
						<td><%=g.getPrice()%></td>
						<td><%=g.getQty()%></td>
						<td><img src="../upload/<%=g.getFname()%>" width="50" height="50"></td>
					</tr>
				<%
			}
		%>
	</table>
</body>
</html>