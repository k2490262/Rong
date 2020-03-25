package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/deleteCustomer.do")
	public ModelAndView delete(int custid) {
		ModelAndView mav = new ModelAndView();
		int re = dao.deleteCustomer(custid);
		if (re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "�������� �����Ͽ����ϴ�.");
		}
		return mav;
	}

	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}
	// �󼼺����� ���� ����� �ϼ� �� ���ϴ�.

	@RequestMapping("/listCustomer.do")
	public ModelAndView listCustomer() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		return mav;
	}
}
