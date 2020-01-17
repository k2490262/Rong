package com.bit.exam09;

import java.util.ArrayList;
import java.util.Scanner;

import com.bit.exam08.Student;

public class BookTest {
	public static Scanner sc;

	public static void printMenu() {
		System.out.println("*** ���� ���� ���α׷� ***");
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ��� ���");
		System.out.println("0. ����");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		
		int menu;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			switch (menu) {
			case 1 : registerBook(list); break;
			case 2 : reviseBook(list); break;
			case 3 : deleteBook(list); break;
			case 4 : printAllBook(list); break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}


	private static void registerBook(ArrayList<BookInfo> list) {
		String number, title, author, price, publisher;
		System.out.println("���ο� ������ ����մϴ�.");
		System.out.print("������ȣ�� �Է��ϼ��� ==> ");
		number = sc.next();
		System.out.print("�������� �Է��ϼ��� ==> ");
		title = sc.next();
		System.out.print("���ڸ� �Է��ϼ��� ==> ");
		author = sc.next();
		System.out.print("������ �Է��ϼ��� ==> ");
		price = sc.next();
		System.out.print("���ǻ縦 �Է��ϼ��� ==> ");
		publisher = sc.next();

		list.add(new BookInfo(number, title, author, price, publisher));
	}
	private static void reviseBook(ArrayList<BookInfo> list) {
		
	}
	private static void deleteBook(ArrayList<BookInfo> list) {
		String number, title, author, price, publisher;
		System.out.println("*** ���� �˻� ***");
		System.out.println("������ ������ ��ȣ�� �Է��ϼ��� ==> ");
		number = sc.next();
		int re = 0;
		
		for (BookInfo bi : list) {
			if (bi.getNumber().equals(number)) {
				list.remove(bi);
				System.out.println("�ش� ������ ������ �����Ͽ����ϴ�.");
				re = 1;
				break;
			}
		}
		if (re == 0) {
			System.out.println("�˻��� ������ �����ϴ�.");
		}
	}
	private static void printAllBook(ArrayList<BookInfo> list) {
		System.out.println("*** ��� ���� Ȯ�� ***");
		System.out.println("������ȣ\t������\t����\t����\t���ǻ�");
		for (BookInfo bi : list) {
			System.out.println(bi.getNumber() + "\t" + bi.getTitle() + "\t" + bi.getAuthor() + "\t" + bi.getPrice() + "\t" + bi.getPublisher());
		}
	}
}
