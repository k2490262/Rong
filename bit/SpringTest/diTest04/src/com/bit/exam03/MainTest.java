package com.bit.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context
		= new AnnotationConfigApplicationContext(SpringConfig.class);
		Person p1 =(Person) context.getBean("p");
		Person p2 =(Person) context.getBean("p");
		
		if(p1 == p2) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
	}
}
