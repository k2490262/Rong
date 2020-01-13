package com.bit.exam09;

import java.util.Random;

public class Product {
	private int number;
	public boolean isNew;
	
	public synchronized int getNumber() {

		while(isNew == false) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		
		System.out.println("�Һ��ڰ� �Һ��� : " + number);
		isNew = false;
		notify();
		return number;
	}
	
	public synchronized void makeNumber() {
		
		while(isNew == true) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		
		Random r = new Random();
		number = r.nextInt(100) + 1;
		System.out.println("�����ڰ� ������ : " + number);
		isNew = true;
		notify();
	}
}
