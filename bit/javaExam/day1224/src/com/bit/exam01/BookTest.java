package com.bit.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	public static Scanner sc;
	
	public static void printMenu() {
		System.out.println("*** ���� ���� ���α׷� ***");
		System.out.println("1. ���, 2. ����, 3. ����, 4. ��� ���, 5. ���� �������� ����, 0. ����");
		System.out.print("�޴��� �����ϼ��� ==> ");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;	
			}
			switch(menu) {
			case 1 : insertBook(list); break;
			case 2 : updateBook(list); break;
			case 3 : deleteBook(list); break;
			case 4 : printAllBook(list); break;
			case 5 : sortBook(list); break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	private static void insertBook(ArrayList<Book> list) {
		int no, price;
		String title, writer, publisher;
		System.out.println("*** ��� ***");
		System.out.print("����� ������ȣ : ");
		no = sc.nextInt();
		System.out.print("����� ������ : ");
		title = sc.next();
		System.out.print("����� ������ ���� : ");
		writer = sc.next();
		System.out.print("����� ���� ���� : ");
		price = sc.nextInt();
		System.out.print("����� ���� ���ǻ� : ");
		publisher = sc.next();
		
		Book b = new Book(no, title, writer, price, publisher);
		list.add(b);
	}

	private static void updateBook(ArrayList<Book> list) {
		int no, price;
		String title, writer, publisher;
		System.out.println("*** ���� ���� ***");
		System.out.print("������ ������ȣ : ");
		no = sc.nextInt();
		System.out.print("������ ������ : ");
		title = sc.next();
		System.out.print("������ ������ ���� : ");
		writer = sc.next();
		System.out.print("������ ���� ���� : ");
		price = sc.nextInt();
		System.out.print("������ ���� ���ǻ� : ");
		publisher = sc.next();
		
		Book b = new Book(no, title, writer, price, publisher);
		int i;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				list.set(i, b);
				System.out.println("�ش� ������ �����߽��ϴ�.");
				break;
			}
		}
		if (i == list.size()) {
			System.out.println("���� ������ �����߽��ϴ�.");
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}

	private static void deleteBook(ArrayList<Book> list) {
		int no;
		System.out.println("*** ���� ���� ***");
		System.out.println("������ ������ ��ȣ�� �Է��ϼ��� ==> ");
		no = sc.nextInt();
		boolean flag = false;
		
		for (Book b : list) {
			if (b.getNo() == no) {
				list.remove(b);
				System.out.println("�ش� ������ �����߽��ϴ�.");
				break;
			}
		}
		if (flag == false) {
			System.out.println("���� ������ �����߽��ϴ�.");
		}
	}

	private static void printAllBook(ArrayList<Book> list) {
		System.out.println("*** ��� ���� ��� ***");
		System.out.println("������ȣ\t������\t����\t����\t���ǻ�");
		for (Book b : list) {
			System.out.println(b.getNo() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getPrice() + "\t" + b.getPublisher());
		}
	}
	private static void sortBook(ArrayList<Book> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).getPrice() < list.get(i).getPrice()) {
					Book b = list.get(i);
					list.set(i, list.get(j));
					list.set(j, b);
				}
			}
		}
	}
}
