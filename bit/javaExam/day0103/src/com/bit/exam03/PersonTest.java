package com.bit.exam03;

class Person extends Thread {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("�ȳ�, " + name + " " + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("������");
		p1.start();
		p2.start();
	}
}
