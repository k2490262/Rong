package com.bit.exam04;

public class SmsSender {
	private String from;
	private String to;
	
	public SmsSender(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	
	public void send() {
		System.out.println(from + "이 " + to + "에게 메시지를 전송했습니다.");
	}
}
