package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(200); // auto Boxing�ؼ� list�� ��´�.
		list.add(300);
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			// int data = list.get(i).intValue();
			Integer ob = list.get(i);
			
			// sum = sum + ob.intValue();
			// sum = sum + ob;
			sum = sum + list.get(i); // auto Unboxing
		}
		
		System.out.println("���� : " + sum);
	}
}
