package com.bit.test;

public class Person {
	private String name;
	private int age;
	
	public void run () {
		System.out.println(age + "살 " + name + "이(가) 달려요");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "이름 : " + name + ", 나이 " + age;
	}

	public boolean equals(Object o) {
		boolean r = false;
		Person p = (Person) o;
		if (name.equals(p.name) && age == p.age) {
			r = true;
		}
		return r;
	}
}
