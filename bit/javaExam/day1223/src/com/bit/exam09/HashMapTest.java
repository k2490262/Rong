package com.bit.exam09;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "ȫ�浿");
		map.put("addr", "����");
		map.put("tel", "111");
		System.out.println(map.get("addr"));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("����");
		list.add("111");
		System.out.println(list.get(1));
	}
}
