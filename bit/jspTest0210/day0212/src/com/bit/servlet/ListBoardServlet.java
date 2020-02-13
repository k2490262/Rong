package com.bit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDao;

/**
 * Servlet implementation class ListBoardServlet
 */
@WebServlet("/board/listBoard.do")
public class ListBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		System.out.println("��������ȣ:"+pageNUM);
		String view = "/board/listBoard.jsp";
        BoardDao dao = new BoardDao();
        request.setAttribute("list", dao.listAll(pageNUM));
        //��ü ������ ���� ���������մϴ�.
        request.setAttribute("totalPage", BoardDao.totalPage);
        //startPage�� endPage�� ����Ͽ� ����� Ȯ���� ���ϴ�.
        //���� ���� �������� 1,2,3,4,5��� startPage = 1
        //���� ���� �������� 6,7,8,9,10 �̶�� startPage = 6
        //				11,12,13
        //���� ������ ��ȣ�� pageNUM
        //�� ȭ�鿡 ������ ������ ���� pageGROUP�� 5�� �����Ǿ� �־��.
        int startPage = (pageNUM - 1) / BoardDao.pageGROUP * BoardDao.pageGROUP + 1;
        //					(8 - 1)	/	5	*	5 + 1
        int endPage = startPage + BoardDao.pageGROUP - 1;
        if(endPage > BoardDao.totalPage) {
        	endPage = BoardDao.totalPage;
        }
        request.setAttribute("startPage", startPage);
        request.setAttribute("endPage", endPage);
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
