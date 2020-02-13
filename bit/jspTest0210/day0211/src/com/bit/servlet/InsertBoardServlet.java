package com.bit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDao;
import com.bit.vo.BoardVo;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class InsertBoardServlet
 */
@WebServlet("/board/insertBoard.do")
public class InsertBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String view = "/board/insertBoard.jsp";        
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");  
        String path = request.getRealPath("board/upload");
        System.out.println(path);
        MultipartRequest multi = new MultipartRequest(request, path, "utf-8");      
        BoardVo b = new BoardVo();
        b.setTitle(multi.getParameter("title"));
        b.setWriter(multi.getParameter("writer"));
        b.setPwd(multi.getParameter("pwd"));
        b.setContent(multi.getParameter("content"));
        b.setFname(multi.getOriginalFileName("fname"));
        b.setIp(request.getRemoteAddr());
        BoardDao dao = new BoardDao();
        int re = dao.insertBoard(b);
        if(re > 0) {
            response.sendRedirect("listBoard.do");
        }else {
            request.setAttribute("msg", "�Խù���Ͽ� �����Ͽ����ϴ�.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
            dispatcher.forward(request, response);
        }
	}

}
