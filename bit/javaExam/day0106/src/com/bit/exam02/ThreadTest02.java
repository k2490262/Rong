package com.bit.exam02;

class Person implements Runnable {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("�ȳ�, " + name + " " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTest02 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("�̼���");
//      p1.start();
//      p2.start();
//      p1.run();      //������ ������ �ƴϰ� run�޼ҵ带 �Ϲ� �޼ҵ�ó�� ���
//      p2.run();
//      1. ��ü�� �����ؼ� ���      
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
//      2. ��ü ���� ���� �ٷ� ���      
		(new Thread(p1)).start();
		(new Thread(p2)).start();
	}
}