package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("ȫ�浿", 20));
		list.add(new Person("�̼���", 40));
		list.add(new Person("������", 30));
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);
			p.sayHello();
		}
	}
}
