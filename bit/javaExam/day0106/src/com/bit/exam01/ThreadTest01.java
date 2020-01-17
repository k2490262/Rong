package com.bit.exam01;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void sayHello() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("�ȳ�, " + name + " " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("�̼���");
		p1.sayHello();
		p2.sayHello();
	}
}