package com.bit.exam05;

public class Lion extends Animal {
	private String title;
		
	public Lion(String title) {
		super();
		this.title = title;
	}

	public void proLion() {
		System.out.println("proLion�Դϴ�.");
		System.out.println(title);
	}
}
