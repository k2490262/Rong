package com.bit.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDao dao;

	// dao�� �������踦 setter�� ���ؼ� �����ϱ� ���� setter �޼ҵ� ����
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listCustomer.do")
	public ModelAndView listCustomer(String keyword, String searchColumn, String sortColumn, HttpSession session) {
		System.out.println("�˻��� : " + keyword);

		// ���ǿ� ��� �˻�� �켱������ �������?
		// ���� �˻��� �˻�� �켱������ �������?
		// ===>���� �˻��� �˻�� �켱������ ���ƿ�!!!
		if (keyword == null) {
			keyword = (String) session.getAttribute("keyword");
			searchColumn = (String) session.getAttribute("searchColumn");
		}

		HashMap map = new HashMap();
		map.put("keyword", keyword);
		map.put("searchColumn", searchColumn);
		map.put("sortColumn", sortColumn);

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll(map)); // addObject�� list ��������

		session.setAttribute("searchColumn", searchColumn);
		session.setAttribute("keyword", keyword);

		return mav;
	}

	@RequestMapping("/detailCustomer.do")
	public ModelAndView getCustomer(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}

	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.GET)
	public void insertForm() {
		// �������� ȣ���� ���̱⿡ �߰� ���� �ʿ� ����
	}

	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(CustomerVo c) { // html �±��� name�� vo�� �������� ��ġ�ؾ� �ڵ������� ���� ���
		ModelAndView mav = new ModelAndView(); // jsp:useBean�� �Ķ������ setProperty�±׿� property="*"�� ������ ����
		int re = dao.insertCustomer(c);
		if (re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "����Ͽ� �����Ͽ����ϴ�.");
		}
		return mav;
	}

	@RequestMapping("/deleteCustomer.do")
	public ModelAndView deleteCustomer(int custid, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/listCustomer.do");
		int re = dao.deleteCustomer(custid);
		if (re <= 0) {
			// mav.addObject("msg", "�������� �����Ͽ����ϴ�.");
			session.setAttribute("msg", "�������� �����Ͽ����ϴ�.");
		}
		return mav;
	}
}
