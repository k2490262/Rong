package com.bit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BookDao;
import com.bit.vo.BookVo;

/**
 * Servlet implementation class InsertBookServlet
 */
@WebServlet("/book/insertBook.do")
public class InsertBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/book/insertBook.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		BookVo b = new BookVo();
		b.setBookid(Integer.parseInt(request.getParameter("bookid")));
		b.setBookname(request.getParameter("bookname"));
		b.setPublisher(request.getParameter("publisher"));
		b.setPrice(Integer.parseInt(request.getParameter("price")));
		
		BookDao dao = new BookDao();
		int re = dao.insertBook(b);
        if(re > 0) {
            response.sendRedirect("listBook.do");
        }else {
            request.setAttribute("msg", "������Ͽ� �����Ͽ����ϴ�.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
	}

}
