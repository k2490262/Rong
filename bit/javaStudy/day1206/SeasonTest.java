// ��������� ���� �Է¹޾� ������ Ȯ���ϴ� ���α׷� ����

import java.util.Scanner;

class SeasonTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;
		System.out.println("*** ������ Ȯ�� ���α׷� ***");
		System.out.print("���� �Է� ===> ");		
		month = scan.nextInt();

		String r = "�ܿ�";

		if (month < 1 || month > 12) {
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		return;
		}

		if (month >= 3 && month <= 5) {
			r = "��";
		} else if (month >= 6 && month <= 8) {
			r = "����";
		} else if (month >= 9 && month <= 11) {
			r = "����";
		}

		System.out.println(month + "���� " + r + "�Դϴ�.");
	}
}
