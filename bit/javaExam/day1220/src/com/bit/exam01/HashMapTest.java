package com.bit.exam01;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("name", "�̼���");
		map.put("age", 20);
		map.put("addr", "����� ������ �ż���");
		
		ArrayList list = new ArrayList();
		list.add("�̼���");
		list.add(20);
		list.add("����� ������ �ż���");
		
		System.out.println(map.get("name"));
		System.out.println(list.get(0));
		System.out.println(map);
		System.out.println(list);
	}
}
