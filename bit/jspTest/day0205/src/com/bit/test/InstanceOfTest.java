package com.bit.test;

import java.util.ArrayList;

public class InstanceOfTest {

	public static void main(String[] args) {
		/*
		Person p = new Person("ȫ�浿", 20);
		Bird b = new Bird("����", "���", true);
		
		if (p instanceof Person) {
			System.out.println("p���������� Person�� �ڷ����Դϴ�.");
		} else {
			System.out.println("p���������� Person�� �ڷ����� �ƴմϴ�.");
		}
		*/
		
		ArrayList<Object> bus = new ArrayList<Object>();
		bus.add(new Person("������", 20));
		bus.add(new Bird("����", "���", true));
		bus.add(new Person("���Ƹ�", 21));
		
		for (Object ob : bus) {
			if (ob instanceof Person) {
				((Person)ob).run();
			} else if (ob instanceof Bird) {
				((Bird)ob).fly();
			}
		}
	}
}
