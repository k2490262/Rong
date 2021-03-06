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
		String head = "새글작성";
		String title = "";
		int no = 0;
		if(request.getParameter("no") != null) {
			no = Integer.parseInt(request.getParameter("no"));
			head = "답글작성";
			BoardDao dao = new BoardDao();
			title = "답글)" + dao.getBoard(no).getTitle();
		}
		String view = "/board/insertBoard.jsp";
		request.setAttribute("no", no);
		request.setAttribute("head", head);
		request.setAttribute("title", title);
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
        //새로 등록하려는 글의 글번호가 아니라
        //부모글의 글번호를 vo에 담아요.
        //만약, 새글이라면 0이 담겨요.
        //만약 답글이라면 부모글의 글번호가 담겨요.
        b.setNo(Integer.parseInt(multi.getParameter("no")));
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
            request.setAttribute("msg", "게시물등록에 실패하였습니다.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
            dispatcher.forward(request, response);
        }
	}

}
