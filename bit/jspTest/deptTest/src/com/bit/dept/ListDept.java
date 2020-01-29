package com.bit.dept;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDept {

	public static EmpDao dao = new EmpDao();
	public static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("1. ������");
		System.out.println("2. ������");
		System.out.println("0. ����");
		System.out.print("�޴��� �����ϼ��� ==> ");
	}

	public static void list() {
		ArrayList<EmpVo> list = dao.listAll();
		System.out.println("<�����ȣ>\t<�����>\t<�޿�>\t<�μ���ȣ>");
		for (EmpVo e : list) {
			System.out.print(e.getEno() + "\t");
			System.out.print(e.getEname() + "\t");
			System.out.print(e.getSal() + "\t");
			System.out.println(e.getDno());
		}
	}

	public static void insert() {
		int eno, sal, dno;
		String ename;
		System.out.println("�����ȣ ==> ");
		eno = sc.nextInt();
		System.out.println("����̸� ==> ");
		ename = sc.next();
		System.out.println("�޿� ==> ");
		sal = sc.nextInt();
		System.out.println("�μ���ȣ ==> ");
		dno = sc.nextInt();

		EmpVo e = new EmpVo(eno, ename, sal, dno);
		int re = dao.insertEmp(e);
		String msg = "����� ����Ͽ����ϴ�.";
		if (re < 0) {
			msg = "��Ͽ� �����Ͽ����ϴ�.";
		}
		System.out.println(msg);
	}

	public static void main(String[] args) {
		int cmd = 9;
		while (cmd != 0) {
			menu();
			cmd = sc.nextInt();
			switch (cmd) {
			case 1:
				insert();
				break;
			case 2:
				list();
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
