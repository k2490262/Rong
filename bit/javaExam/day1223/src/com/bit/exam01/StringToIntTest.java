package com.bit.exam01;

public class StringToIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data1 = "100";
		String data2 = "200";
		
		// data1�� data2�� ���������� ��ȯ�� ���� ���ϱ� ����� ����غ�����.
		
		int r = Integer.parseInt(data1) + Integer.parseInt(data2);
		// String�� Integer��, Integer�� int������ �ڵ� ��ȯ(auto Unboxing) 
		
		System.out.println(r);
	}
}
