package com.example.demo.controller;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.GoodsVo;
import com.google.gson.Gson;

@RestController
public class GoodsController {

	@Autowired
	private GoodsDao dao;

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/goodsList", produces = "application/json; charset=UTF-8")
	public String goodsList() {
		return (new Gson()).toJson(dao.listAll());
	}

	@RequestMapping("/insertGoods")
	public String insertGoods(GoodsVo g, HttpServletRequest request) {
		String str = "ok";
		// String path = request.getRealPath("/resources/static/img");
		String path = "C:\\stsAjaxTest\\day0320\\src\\main\\resources\\static\\img";
		MultipartFile uploadFile = g.getUploadFile();
		String fname = "";
		if (uploadFile != null) {
			fname = uploadFile.getOriginalFilename();
			try {
				byte[] data = uploadFile.getBytes();
				FileOutputStream fos = new FileOutputStream(path + "/" + fname);
				fos.write(data);
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		g.setFname(fname);
		dao.insertGoods(g);

		return str;
	}
}
