package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/listMember.do")
	public ModelAndView listMember() {
		ModelAndView mav = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("������");
		list.add("������");
		list.add("������");
		
		mav.addObject("list", list);
		mav.setViewName("listMember");
		return mav;
	}
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("msg", "�ȳ��ϼ���");
		mav.addObject("year", 2020);
		return mav;
	}
}
