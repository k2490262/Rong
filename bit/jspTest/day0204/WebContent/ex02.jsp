<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	String name = "ȫ�浿";
	public int addAge(int age) {
		return age +1;
	}
%>

<h2>������ �������</h2>
1. ��ũ��Ʈ��<br>
2. ǥ����<br>
3. ����<br>

<%
	int age = 20;
	String addr = "����� ������ �ż���";
%>

�̸� : <%= name %><br>
���� : <%= age %><br>
�ּ� : <%= addr %><br>

<%
	int age2 = addAge(age);
%>
������ ���� : <%= age2 %><br>
������ ���� : <%= addAge(age) %><br>
</body>
</html>