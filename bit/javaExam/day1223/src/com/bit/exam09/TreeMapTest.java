package com.bit.exam09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("name", "ȫ�浿");
		map.put("addr", "����");
		map.put("tel", "111");
		
		System.out.println(map);
	}
}
