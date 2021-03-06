package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;
import com.bit.vo.GoodsVo;

/**
 * Servlet implementation class detailGoodsServlet
 */
@WebServlet("/detailGoods.do")
public class detailGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDao dao = new GoodsDao();
		GoodsVo g = dao.getGoods(no);
		response.setContentType("text/html;charset=utf-8");
		String str = "";
		str += "상품가격";
		str += g.getPrice() + "<br>";
		str += "상품수량";
		str += g.getQty() + "<br>";
		str += "<img src='upload/" + g.getFname() + "' width='200' height='200'<br>";
		str += "상세설명<br>";
		str += "<textarea readonly rows='10' cols='80'>" + g.getDetail() + "</textarea><br>";
		str += "<a href='updateGoods.do?no=" + g.getNo() + "'>수정</a> / ";
		str += "<a href='deleteGoods.do?no=" + g.getNo() + "'>삭제</a>";
		PrintWriter out = response.getWriter();
		out.print(str);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
