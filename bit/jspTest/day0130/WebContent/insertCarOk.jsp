<%@page import="com.bit.dao.CarDao"%>
<%@page import="com.bit.vo.CarVo"%>
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
		
		int car_no = Integer.parseInt(request.getParameter("car_no"));
		String car_type = request.getParameter("car_type");
		String color = request.getParameter("color");
		int seats = Integer.parseInt(request.getParameter("seats"));
		int rent_fee = Integer.parseInt(request.getParameter("rent_fee"));
		String fname = request.getParameter("fname");
		int c_no = Integer.parseInt(request.getParameter("c_no"));
		int t_no = Integer.parseInt(request.getParameter("t_no"));
		
		String[] arr_option = request.getParameterValues("o_no");
		
		// 1. CarVo�� �����ϰ� ����ڰ� ��û�� ������ vo�� ��ƿ�
		CarVo c = new CarVo();
		c.setCar_no(car_no);
		c.setCar_type(car_type);
		c.setColor(color);
		c.setSeats(seats);
		c.setRent_fee(rent_fee);
		c.setFname(fname);
		c.setC_no(c_no);
		c.setT_no(t_no);
//		CarVo c = new CarVo(car_no, car_type, color, seats, rent_fee, fname, c_no, t_no);
		
		// 2. CarDao�� �����Ͽ� insert�� ��û�մϴ�.
		CarDao c_dao = new CarDao();
		int re = c_dao.insertCar(c);
		
		// 3. �ڵ��� ��Ͽ� �����ϸ� �ɼ��� �� ��ŭ options�� ���ڵ带 �߰��մϴ�.
		if (re > 0) {
			for (String option : arr_option) {
				int o_no = Integer.parseInt(option);
				c_dao.insertOptions(car_no, o_no);
			}
			%>
				�Է��� ������ ������ �����ϴ�.<hr>
				������Ϲ�ȣ : <%= car_no %><br>
				���� : <%= car_type %><br>
				���� : <%= color %><br>
				�¼� �� : <%= seats %><br>
				���ϴ뿩�� : <%= rent_fee %><br>
				�������ϸ� : <%= fname %><br>
				���� ��ȣ : <%= c_no %><br>
				�ڵ��� Ÿ�� : <%= t_no %><br>
				�ɼ��� ���� : 
			<%	for (String option : arr_option) {
					out.print(option + " ");
				}
		} else {
			out.print("<font color = 'red'> ������Ͽ� �����Ͽ����ϴ�. </font>");
		}
		%>
</body>
</html>