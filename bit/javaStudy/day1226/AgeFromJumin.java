/*
����ڷκ��� �ֹε�Ϲ�ȣ�� �Է¹޾� ���̸� ����Ͽ� ���
*/

import java.util.Scanner;
import java.util.Date;

class AgeFromJumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է�");
		String jm = sc.next();
		int year = Integer.parseInt(jm.substring(0,2));

		year += 1900;

		int flag = Integer.parseInt(jm.substring(7,8));
		if (flag == 3 || flag == 4 || flag == 7 || flag == 8) {
			flag = year + 100;
		}

		int currentYear = (new Date()).getYear() + 1900;
		int age = currentYear - year;

		System.out.println("�Է��Ͻ� �ֹε�Ϲ�ȣ�� ���̴� " + age + "�Դϴ�.");
	}
}
