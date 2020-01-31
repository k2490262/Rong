<%@page import="com.bit.vo.CarTypeVo"%>
<%@page import="com.bit.dao.CarTypeDao"%>
<%@page import="com.bit.dao.CenterDao"%>
<%@page import="com.bit.dao.OptionTypesDao"%>
<%@page import="com.bit.vo.CenterVo"%>
<%@page import="com.bit.vo.OptionTypesVo"%>
<%@page import="java.util.ArrayList"%>
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
		CenterDao c_dao = new CenterDao();
		ArrayList<CenterVo> list = c_dao.listAll();
		
		OptionTypesDao ot_dao = new OptionTypesDao();
		ArrayList<OptionTypesVo> ot_list = ot_dao.listAll();
		
		CarTypeDao t_dao = new CarTypeDao();
		ArrayList<CarTypeVo> t_list = t_dao.listAll();
	%>
	<h2>�ڵ��� ���</h2>
	<hr>
	<form action="insertCarOk.jsp" method="post">
		�繫�� ���� : 
		<select name="c_no">
			<%
				for(CenterVo c : list) {
			%>
			<option value="<%= c.getC_no() %>"> <%= c.getC_name() %> </option>
			<%
				}
			%>
		</select>
		<br>
		������Ϲ�ȣ : <input type="number" name="car_no"><br>
		���� : <input type="text" name="c_type"><br>
		���� : 
		<select name="color">
			<option value="red"> ������ </option>
			<option value="white"> ��� </option>
			<option value="black"> ������ </option>
		</select>
		<br>
		���ϴ뿩�� : <input type="number" name="rent_fee"><br>
		���ν� : 
		<select name="seats">
			<option value="4"> 4�ν� </option>
			<option value="8"> 8�ν� </option>
			<option value="12"> 12�ν� </option>
		</select>
		<br>
		���� : <input type="text" name="fname"><br>
		�ɼ� : 
		<%
			for (OptionTypesVo ot : ot_list) {
				%>
					<input type="checkbox" name="o_no" value="<%= ot.getO_no() %>"> <%= ot.getO_name() %>
				<%
			}
		%>
		<br>		
		�ڵ��� Ÿ�� : 
		<select name="t_no">
			<%
				for (CarTypeVo t : t_list) {
					%>
						<option value="<%= t.getT_no() %>"> <%= t.getT_name() %> </option>
					<%
				}
			%>
		</select><br>
		<input type="submit" value="���">
		<input type="reset" value="���">
	</form>
</body>
</html>