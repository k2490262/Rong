package com.bit.exam04;

// ���ڴ� �����̴�.
// Lion is a Animal
// LionŬ������ AnimalŬ������ is a ���迡 �ִ�.
// is a ���迡 ���� ������ ����ȯ(typecast)�� �����ϴ�.(casting�� ����)
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
