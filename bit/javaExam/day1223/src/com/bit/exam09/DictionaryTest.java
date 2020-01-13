package com.bit.exam09;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
	
	public static Scanner sc;

	public static void printMenu() {
		System.out.println("*** ������� ���α׷� ***");
		System.out.println("1. �߰�");
		System.out.println("2. �˻�");
		System.out.println("3. ����");
		System.out.println("0. ����");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("orange", "������");
		map.put("banana", "�ٳ���");
	
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			switch (menu) {
				case 1 : registerWord(map); break;
				case 2 : searchWord(map); break;
				case 3 : deleteWord(map); break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static void registerWord(HashMap<String, String> map) {
		System.out.println("*** ���ο� �ܾ� ��� ***");
		String key, value;
		System.out.print("����Ϸ��� ���� �ܾ �Է��ϼ��� ==> ");
		key = sc.next();
		System.out.println("����Ϸ��� �ܾ��� ���� �Է��ϼ��� ==> ");
		value = sc.next();
		map.put(key, value);
		System.out.println("���ο� �ܾ ����Ͽ����ϴ�.");
	}
	private static void searchWord(HashMap<String, String> map) {
		String key;
		System.out.println("*** �ܾ� �˻� ***");
		System.out.print("�������� ã�� �ܾ �Է��ϼ��� ==> ");
		key = sc.next();
		String value = map.get(key);
		if (value == null) {
			System.out.println("ã�� �ܾ �����ϴ�.");
			String sel;
			System.out.println("�ܾ ����ұ��?(Y / N)");
			sel = sc.next();
			if (sel.equals("Y") || sel.equals("y")) {
				String v;
				System.out.print("�ܾ��� ���� �Է��ϼ��� ==>");
				v = sc.next();
				map.put(key, v);
				System.out.println("�ܾ� ����� �Ϸ�Ǿ����ϴ�.");
			}
			if (sel.equals("N") || sel.equals("n")) {
				System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
				return;
			}
		} else {
		System.out.println("�ܾ��� ���� " + value + "�Դϴ�.");
		}
	}
	private static void deleteWord(HashMap<String, String> map) {
		String key;
		System.out.println("*** �ܾ� ���� ***");
		System.out.print("�������� ������ �ܾ �Է��ϼ��� ==> ");
		key = sc.next();
		String v = map.remove(key);
		if (v != null) {
			System.out.println("�ش� �ܾ� " + key + "��(��) �����߽��ϴ�.");
		} else {
			System.out.println("�ش� �ܾ ã�� ���߽��ϴ�. ������ �����߽��ϴ�.");
			System.out.println("�ش� �ܾ� " + key + "��(��) ������ ���� �ܾ��Դϴ�.");
		}
	}
}
