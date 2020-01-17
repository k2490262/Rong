<%@page import="com.bit.dao.DeptDao"%>
<%@page import="com.bit.vo.DeptVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function pro (tr) {
		
		// class���� tdlist�� ���� ã�Ƽ� ��� ������ ������� ��ĥ�Ѵ�.
		var tdlist = document.getElementsByClassName("tdlist");
		for (i = 0; i < tdlist.length; i++) {
			tdlist[i].style.background = "white";
		}
		
		tr.style.background = "hotpink";
		
		var list = tr.childNodes;
		// alert(list[0].innerHTML);
		var dno = document.getElementById("dno");
		var dname = document.getElementById("dname");
		var dloc = document.getElementById("dloc");
		
		// td���� ���� �о� ���ų� �����Ϸ���		=> innerHTML
		// input�±׿� ���� �о���ų� �����Ϸ���	=> value
		dno.value = list[0].innerHTML;
		dname.value = list[1].innerHTML;
		dloc.value = list[2].innerHTML;
	}
	
	function update() {
		document.getElementById("op").value = "update";
		document.F.submit();
	}
	
	function del() {
		document.getElementById("op").value = "delete";
		document.F.submit();
	}
</script>
</head>
<body>
	<h2>�μ�����</h2>
	<%
		String method = request.getMethod();
		// getMethod()�� �빮�ڸ� ��ȯ�Ѵ�.
	
		DeptDao dao = new DeptDao();
		if (method.equals("POST")) {
			request.setCharacterEncoding("euc-kr");
			int dno = Integer.parseInt(request.getParameter("dno"));
			String dname = request.getParameter("dname");
			String dloc = request.getParameter("dloc");
			
			DeptVo d = new DeptVo(dno, dname, dloc);
			
			String oper = request.getParameter("op");
			
			if (oper.equals("insert")) {
				dao.insertDept(d);
			} else if (oper.equals("update")) {
				dao.updateDept(d);
			} else if (oper.equals("delete")) { // ���̺��� �����ϱ� ���ؼ��� ������ �Ǿ� �ִ� ���̺���� ���� Ʃ���� �ͼӵǾ� �ֱ� ������ ������ �Ұ� = �������Ἲ   
				dao.deleteDept(dno);
			}
		}
		ArrayList<DeptVo> list = dao.listAll();
	%>

	<form name="F" action="deptTest.jsp" method="post"> <!-- method�� ����(get, post ��)�� ������ ���� ��ҹ��ڸ� �������� ������ request.getMethod()�� �빮�ڸ� ��ȯ�Ѵ�. -->
		<input type="hidden" name="op" id="op" value="insert"> <!-- name�� java�̰� id�� JavaScript�� �ʿ��ϴ� -->
		�μ���ȣ : <input type="number" name="dno" id="dno"><br>
		�μ��� : <input type="text" name="dname" id="dname"><br>
		�μ���ġ : <input type="text" name="dloc" id="dloc"><br>
		<input type="submit" value="���">
		<input type="button" value="����" onclick="update()">
		<input type="button" value="����" onclick="del()">
	</form>

	<table border="1" width="80%">
		<tr>
			<td>�μ���ȣ</td>
			<td>�μ���</td>
			<td>�μ���ġ</td>
		</tr>
		<%
			for (DeptVo d : list) {
		%>
		<tr class="tdlist" onclick="pro(this)"><td><%=d.getDno()%></td><td><%=d.getDname()%></td><td><%=d.getDloc()%></td></tr>
		<%
			}
		%>
	</table>
</body>
</html>