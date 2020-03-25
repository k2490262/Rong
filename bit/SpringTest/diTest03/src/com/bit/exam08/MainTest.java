package com.bit.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam08/beans.xml");
		
		Person p1 = (Person)context.getBean("p");
		Person p2 = (Person)context.getBean("p");
		
		if (p1 == p2) {
			System.out.println("���ƿ�"); // ����Ʈ�� singleton
		} else {
			System.out.println("�޶��"); // prototype���� ���� ����, bean�� ����� ������
		}
		
		// TODO Auto-generated method stub
//		System.out.println("1");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam08/beans.xml");
//		// ������ �ҷ����� �� ��ü�� �����ȴ�.
//		
//		System.out.println("2");
//		Person pe = (Person)context.getBean("p");
//		System.out.println("3");
//		pe.info();
	}
}
