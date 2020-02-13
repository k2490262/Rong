package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.MemberDao;
import com.bit.vo.MemberVo;

/**
 * Servlet implementation class insertMember
 */
@WebServlet("/insertMember.do")
public class insertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public insertMemberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String str = "";
		str += "<html>";
		str += "<h2>ȸ������</h2>";
		str += "<form method='post' action='insertMember.do'>";
		str += "���̵�:<input type='text' name='id'><br>";
		str += "��ȣ:<input type='password' name='pwd'><br>";
		str += "�̸�:<input type='text' name='name'><br>";
		str += "��ȭ:<input type='tel' name='tel' pattern='[0-9]{3}-[0-9]{4}-[0-9]{4}'><br>";
		str += "����:<input type='radio' value='����' name='gender'>���� <input type='radio' value='����' name='gender'>����<br>";
		str += "����:<input type='date' name='birth'><br>";
		str += "�̸���:<input type='email' name='email'><br>";
		str += "������:";
		str += "<input type='radio' name='bloodtype' value='A'>A��";
		str += "<input type='radio' name='bloodtype' value='B'>B��";
		str += "<input type='radio' name='bloodtype' value='AB'>AB��";
		str += "<input type='radio' name='bloodtype' value='O'>O��<br>";
		str += "���:";
		str += "<input type='checkbox' name='hobby' value='����'>����";
		str += "<input type='checkbox' name='hobby' value='���ǰ���'>���ǰ���";
		str += "<input type='checkbox' name='hobby' value='����'>����";
		str += "<input type='checkbox' name='hobby' value='����'>����";
		str += "<input type='checkbox' name='hobby' value='������'>������";
		str += "<br>";

		str += "url:<input type='url' name='url'>";
		str += "<br>";

		str += "����:";
		str += "<select name='job'>";
		str += "<option value='ȸ���'>ȸ���</option>";
		str += "<option value='��ǥ�̻�'>��ǥ�̻�</option>";
		str += "<option value='������'>������</option>";
		str += "<option value='��ȣ��'>��ȣ��</option>";
		str += "<option value='�ǻ�'>�ǻ�</option>";
		str += "<option value='�л�'>�л�</option>";
		str += "<option value='��Ÿ'>��Ÿ</option>";
		str += "</select>";
		str += "<br>";

		str += "�ڱ�Ұ�:<br>";
		str += "<textarea rows='10' cols='80' name='intro'></textarea><br>";

		str += "<input type='submit' value='����'>";
		str += "<input type='reset' value='���'>";
		str += "</form>";
		str += "</html>";

		out.print(str);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemberVo m = new MemberVo();
		m.setId(request.getParameter("id"));
		m.setPwd(request.getParameter("pwd"));
		m.setName(request.getParameter("name"));
		m.setTel(request.getParameter("tel"));
		m.setGender(request.getParameter("gender"));
		m.setBirth(request.getParameter("birth"));
		m.setEmail(request.getParameter("email"));
		m.setBloodtype(request.getParameter("bloodtype"));
		m.setUrl(request.getParameter("url"));
		m.setJob(request.getParameter("job"));
		m.setIntro(request.getParameter("intro"));
		m.setHobby(Arrays.toString(request.getParameterValues("hobby")));

		MemberDao dao = new MemberDao();
		int re = dao.insertMember(m);
		String str = "ȸ������ ����";
		if (re <= 0) {
			str = "ȸ������ ����";
		}

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(str);
		out.close();
	}
}
