package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr = new int[5]; // �⺻�ڷ��� �迭, �ڷ����� �����Ǿ� ����
		
		ArrayList list = new ArrayList(); // �پ��� �ڷ����� ���� �� ����
		list.add("��");
		list.add(28);
		list.add(new Person("ȫ�浿", 20));
		list.add(new Person("�̼���", 40));
		list.add(true);		
		list.add(5.8);
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i); // Object��� ������ ����� list�� �ִ� �����͸� �ϳ��� ������ obj�� �ִ´�.
			System.out.println(obj);
			if (obj instanceof Person) {
				((Person)obj).sayHello();
			}
		}
	}
}
