package com.bit.exam01;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList list = new LinkedList();
			list.add("��");
			list.add("���");
			list.add("��");
			list.add("����");
			list.add("��");
			
			System.out.println(list);
			list.remove(1);
			System.out.println(list);
	}
}
