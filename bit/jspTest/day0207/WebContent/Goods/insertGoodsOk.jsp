<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.bit.dao.GoodsDao"%>
<%@page import="com.bit.vo.GoodsVo"%>
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
		// ��ǰ���, ��ǰ��, ��ǰ����, ��ǰ������ ���� ����� ���ʴ�� �����մϴ�.
		
		request.setCharacterEncoding("euc-kr");
		String path = request.getRealPath("img");
		System.out.println(path);
		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");

		int no = Integer.parseInt(multi.getParameter("no"));
		String item = multi.getParameter("item");
		int price = Integer.parseInt(multi.getParameter("price"));
		int qty = Integer.parseInt(multi.getParameter("qty"));
// 		String fname = multi.getParameter("fname");
		String fname = multi.getOriginalFileName("fname");
		String detail = multi.getParameter("detail");
	%>
	
	<%
		// GoodsVo g = new GoodsVo(no, item, price, qty, fname, detail);
		GoodsVo g = new GoodsVo();
		g.setItem(item);
		g.setPrice(price);
		g.setQty(qty);
		g.setFname(fname);
		g.setDetail(detail);
		// ��ǰ��ȣ�� �������� ���� �ڵ����� �ο������� �������� �ʾƿ�.
		
		GoodsDao dao = new GoodsDao();
		int re = dao.insertGoods(g);

		if (re > 0) {
			response.sendRedirect("listGoods.jsp");
		} else {
			out.print("<font color='red'>��ǰ��Ͽ� �����Ͽ����ϴ�.</font>");
		}
	%>
</body>
</html>