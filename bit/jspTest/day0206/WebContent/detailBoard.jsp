<%@page import="com.bit.vo.BoardVo"%>
<%@page import="com.bit.dao.BoardDao"%>
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
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao dao = new BoardDao();
	dao.updateHit(no);
	BoardVo b = dao.getBoard(no);
%>
�۹�ȣ : <%= b.getNo() %><br>
������ : <%= b.getTitle() %><br>
�ۼ��� : <%= b.getWriter() %><br>
��ȸ�� : <%= b.getHit() %><br>
�۳��� : <br>
<textarea rows="10" cols="80" readonly="readonly"><%= b.getContent() %></textarea>
����� : <%= b.getRegdate() %><br>
IP�ּ� : <%= b.getIp() %><br>
���� : <%= b.getFname() %><br>
<%
	if (dao.isImage(b.getFname())) {
		%>
			<img src="upload/<%= b.getFname() %>" width="200" height="200">
		<%
	}
%>
<hr>
<a href="insertBoard.jsp">���ο� �� �ۼ�</a>
<a href="listBoard.jsp">�۸��</a>
<a href="updateBoard.jsp?no=<%=b.getNo()%>">�ۼ���</a>
<a href="deleteBoard.jsp?no=<%=b.getNo()%>">�ۻ���</a>
</body>
</html>