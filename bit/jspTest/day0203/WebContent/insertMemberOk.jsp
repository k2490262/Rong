<%@page import="com.bit.dao.MemberDao"%>
<%@page import="com.bit.vo.MemberVo"%>
<%@page import="java.util.Arrays"%>
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
		// ����ڰ� ��û�� �����ʹ� �ѱ��Դϴٸ� ����
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String bloodType = request.getParameter("bloodType");
		String[] hobby = request.getParameterValues("hobby");
		String url = request.getParameter("url");
		String job = request.getParameter("job");
		String intro = request.getParameter("intro");
		String hobbys = Arrays.toString(hobby);
	%>
�Է������� ������ �����ϴ�.<br>
���̵� : <%= id %><br>
��ȣ : <%= pwd %><br>
�̸� : <%= name %><br>
��ȭ��ȣ : <%= tel %><br>
���� : <%= birth %><br>
�̸��� : <%= email %><br>
���� : <%= gender %><br>
������ : <%= bloodType %><br>
��� : 
<%
	hobbys = Arrays.toString(hobby);
/*
		for (String s : hobby) {
			hobbys = hobbys + s + ",";
			}
*/
%>
<%= hobbys %><br>
url : <%= url %><br>
���� : <%= job %><br>
�ڱ�Ұ� : <%= intro %><br>
<%
MemberVo m = new MemberVo(id, pwd, name, tel, birth, email, gender, bloodType, hobbys, url, job, intro);
MemberDao dao = new MemberDao();
int re = dao.insertMember(m);

if (re > 0) {
	out.print("<font color='blue'>ȸ������ �Ϸ�Ǿ����ϴ�.</font>");
} else {
	out.print("<font color='red'>ȸ�����Կ� �����Ͽ����ϴ�.</font>");
}
%>
</body>
</html>