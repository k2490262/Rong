package com.bit.exam04;

// 사자는 동물이다.
// Lion is a Animal
// Lion클래스와 Animal클래스는 is a 관계에 있다.
// is a 관계에 있을 때만이 형변환(typecast)이 가능하다.(casting이 가능)
public class Lion extends Animal {
	private String title;
		
	public Lion(String title) {
		super();
		this.title = title;
	}

	public void proLion() {
		System.out.println("proLion입니다.");
		System.out.println(title);
	}
}
