/*
��ǻ�Ϳ� ����� ���� ����, ����, �� ������ ���� ���α׷�
��������� 0, 1, 2�� �Է��� �޾� "����","����","��"�� ����ϼ���.
<< ���� �� >>
����[0], ����[1], ��[2] �߿� �����ϼ��� ==> 1
����� ������ ���̽��ϴ�.
*/

import java.util.Scanner;

class Rsp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*** ��ǻ�Ϳ� ����! ����! ��! ***");
		System.out.print("����[0], ����[1], ��[2] �߿� �����ϼ��� ==> ");
		int n = scan.nextInt();
		String r = "";

		switch (n) {
		case 0 : System.out.println(r = "����"); break;
		case 1 : System.out.println(r = "����"); break;
		case 2 : System.out.println(r = "��"); break;
		default : System.out.print("����[0], ����[1], ��[2] �߿����� �Է����ּ���!"); return;
		}
		System.out.println("����� " + r + "�� ���̽��ϴ�.");
	}
}
