<%@page import="java.io.File"%>
<%@page import="com.bit.vo.GoodsVo"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	<%
		GoodsDao dao = new GoodsDao();
		request.setCharacterEncoding("euc-kr");
		String path = request.getRealPath("upload");
		System.out.println(path);
		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");
		
		int no = Integer.parseInt(multi.getParameter("no"));
		
		// ��ǰ�� �����ϱ� ���� ���� ��ǰ���� ���ϸ��� ��ƵӴϴ�.
		String oldFname = dao.getGoods(no).getFname();
		
		String item = multi.getParameter("item");
		int price = Integer.parseInt(multi.getParameter("price"));
		int qty = Integer.parseInt(multi.getParameter("qty"));
		// String fname = multi.getParameter("fname");
		
		// ���� ���ε��� ��ǰ���� �Ĺи��� ��ƿͿ�
		String fname = multi.getOriginalFileName("fname");
		String detail = multi.getParameter("detail");

		// GoodsVo g = new GoodsVo(100, item, price, qty, fname, detail);
		GoodsVo g = new GoodsVo();
		g.setNo(no);
		g.setItem(item);
		g.setPrice(price);
		g.setQty(qty);
		g.setDetail(detail);
		
		// ��ǰ������ �������� ������ ������ ���� ���ϸ��� vo�� ���
		// ��ǰ������ �����Ѵٸ� ���ε��� ���� ���ϸ��� vo�� ��ƿ�
		g.setFname(oldFname);
		if (fname != null) {
			g.setFname(fname);
		}
		
		int re = dao.updateGoods(g);
		if (re > 0) {
			if (fname != null) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
			response.sendRedirect("listGoods.jsp");
		} else {
			out.print("<font color='red'>������ �����Ͽ����ϴ�.</font>");
		}
	%>
</body>
</html>