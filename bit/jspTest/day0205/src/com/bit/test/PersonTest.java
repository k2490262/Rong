package com.bit.test;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", 20);
		System.out.println(p);
		
		Person p2 = new Person("ȫ�浿", 20);
		// if (p == p2) {
		if (p.equals(p2)) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}
