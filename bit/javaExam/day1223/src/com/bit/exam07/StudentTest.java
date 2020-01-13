package com.bit.exam07;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTest {
	private static void registerStudent(ArrayList<Student> list) {
		String name, addr, tel;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ο� �л��� ����մϴ�.");
		System.out.print("�л��� �̸��� �Է��ϼ��� ==> ");
		name = sc.next();
		System.out.print("�л��� �ּҸ� �Է��ϼ��� ==> ");
		addr = sc.next();
		System.out.print("�л��� ��ȭ��ȣ�� �Է��ϼ��� ==> ");
		tel = sc.next();
		
		// Student st = new Student(name, addr, tel);
		// list.add(st);
		list.add(new Student(name, addr, tel));
	}
	public static void searchStudent(ArrayList<Student> list) {
	}
	public static void deleteStudent(ArrayList<Student> list) {
	}
	private static void printAllStudent(ArrayList<Student> list) {
		System.out.println("*** ��� �л� ��� ***");
		System.out.println("�̸�\t�ּ�\t��ȭ");
		for (int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			System.out.println(st.getName() + "\t" + st.getAddr() + "\t" + st.getTel());
		}
	}
	
	public static void printMenu () {
		System.out.println();
		System.out.println("1 : ���");
		System.out.println("2 : �˻�");
		System.out.println("3 : ����");
		System.out.println("4 : ��� ���");
		System.out.println("0 : ����");
		System.out.print("�޴��� �����ϼ��� ==> ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		int menu;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			switch (menu) {
			case 1 : registerStudent(list); break;
			case 2 : searchStudent(list); break;
			case 3 : deleteStudent(list); break;
			case 4 : printAllStudent(list); break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
