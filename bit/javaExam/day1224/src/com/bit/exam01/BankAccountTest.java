package com.bit.exam01;

import java.util.Scanner;

class NegativeBalnceException extends Exception {
	public NegativeBalnceException(String msg) {
		super(msg);
	}
}

class BankAccount {
	int balance;
	
	public void deposit(int d) {
		balance += d;
	}
	
	public void withdraw(int w) throws NegativeBalnceException {
		if (balance < w) {
			throw new NegativeBalnceException("�ܾ��� �����մϴ�.");
		}
		balance -= w;
		if (balance == 0) {
			throw new NegativeBalnceException("�ܾ��� 0���Դϴ�.");
		}
		System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
	}
}

public class BankAccountTest {
	public static Scanner sc;
	public static void printMenu() {
		System.out.println("*** ���� ���� ���α׷� ***");
		System.out.println("1. �Ա�, 2. ���, 3. �ܾ�, 4. ����");		
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			BankAccount ba = new BankAccount();
			ba.balance = 10000;
			int menu;
			while(true) {
				printMenu();
				menu = sc.nextInt();
				if (menu == 0) {
					break;	
				}
				switch (menu) {
				case 1 : depositMoney(ba);break;
				case 2 : withdrawMoney(ba);break;
				case 3 : printAllMoney(ba);break;
				}
			}
			System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
			ba.deposit(sc.nextInt());
//			System.out.println("����� �ݾ��� �Է��ϼ���.");
//			ba.withdraw(sc.nextInt());
		} catch (NegativeBalnceException e) {
			System.out.println("�ߺ�!" + e.getMessage());
		}
	}

	private static void depositMoney(BankAccount ba) throws NegativeBalnceException {
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
		ba.deposit(sc.nextInt());
	}

	private static void withdrawMoney(BankAccount ba) throws NegativeBalnceException {
		System.out.println("����� �ݾ��� �Է��ϼ���.");
		ba.withdraw(sc.nextInt());
	}
	
	private static void printAllMoney(BankAccount ba) throws NegativeBalnceException {
		
	}
}
