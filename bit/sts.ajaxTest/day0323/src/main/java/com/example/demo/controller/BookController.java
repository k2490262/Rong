package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BookVo;

@RestController
public class BookController {
	
	@RequestMapping(value = "/getBook", produces = "application/xml; charset=utf-8")
	public String getBook() {
		String str = "";

		str += "<rows>";
		str += "<page>1</page>";
		str += "<total>10</total>";
		str += "<records>15</records>";
		for (BookVo b : DBManager.listBook()) {
			str += "<row>";
			str += "<cell>" + b.getBookid() + "</cell>";
			str += "<cell>" + b.getBookname() + "</cell>";
			str += "<cell>" + b.getPublisher() + "</cell>";
			str += "<cell>" + b.getPrice() + "</cell>";
			str += "</row>";
		}
		str += "</rows>";
		return str;
	}
	
	@RequestMapping("/updateBook")
	public String updateBook(String oper, BookVo b) {
		String str = "";
		System.out.println("oper:" + oper);
		System.out.println("책번호:" + b.getBookid());
		if (oper.equals("add")) {
			DBManager.insertBook(b);
		} else if (oper.equals("edit")) {
			DBManager.updateBook(b);
		} else if (oper.equals("del")) {
			DBManager.deleteBook(b);
		}
		return str;
	}
}
