package com.bit.exam05;

// ����) Person ��ü�� �����ϴ� xml�� �ۼ��ϰ� main�޼ҵ带 �ۼ��Ͽ� ����� Ȯ���غ��ϴ�.
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat(String food) {
		System.out.println(age + "�� " + name + "��(��) " + food + "�� �Ծ��.");
	}
}
