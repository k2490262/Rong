package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("ȫ�浿");
		s1.add("100");
		s1.add("100");
		s1.add("100");
		
		System.out.println(s1);
		
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("�̼���");
		s2.add("80");
		s2.add("90");
		s2.add("100");
		
		System.out.println(s2);
		
		ArrayList<String> s3 = new ArrayList<String>();
		s3.add("������");
		s3.add("70");
		s3.add("90");
		s3.add("80");
		
		System.out.println(s3);
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("ȫ�浿");
//		list.add("100");
//		list.add("80");
//		list.add("70");
//		
//		System.out.println(list);
	

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("�̸�");
//		list.add("����");
//		list.add("����");
//		list.add("����");
//		
//		System.out.println(list);
	}
}
