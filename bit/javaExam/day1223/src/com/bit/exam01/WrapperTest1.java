package com.bit.exam01;

public class WrapperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;						// �⺻�ڷ��� ����
		Integer ob = new Integer(a);	// �����ڷ���(��ü)���� ��ȯ
		System.out.println(a);
		System.out.println(ob);
		
		Integer ob2 = a;				// auto Boxing
		System.out.println(ob2);
		
		int b = ob.intValue();
		System.out.println(b);
		
		int c = ob;						// auto Unboxing
		System.out.println(c);
	}
}
