package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@GetMapping("/listMember")
	public String listMember() {
		System.out.println("회원목록입니다.");
		return "ok";
	}
	
	@GetMapping("/deleteMember")
	public String deleteMember() {
		System.out.println("회원삭제입니다.");
		return "ok";
	}
}
