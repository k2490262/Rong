package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/beans2.xml");
		// spring container�� ������ BeanFactory������ �ַ� ApplicationContext�� ���
		MessageBean mb = (MessageBean)context.getBean("mb");
		mb.sayHello("ȫ�浿");
	}

}
