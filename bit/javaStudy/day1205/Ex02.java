// ����) ��������� 3���� ������ �Է¹޾�
//			�� �߿� ���� ū ���� ã�� ����ϴ� ���α׷� ����

import java.util.Scanner;

class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;

		System.out.print("ù��° �� �Է� : ");
		a = scan.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		b = scan.nextInt();
		System.out.print("����° �� �Է� : ");
		c = scan.nextInt();

		if (a > b)
			if (a > c)
				System.out.println("���� ū ���� " + a + "�Դϴ�.");
			else
			System.out.println("���� ū ���� " + c + "�Դϴ�.");
		else
			if (b > c)
				System.out.println("���� ū ���� " + b + "�Դϴ�.");
			else
				System.out.println("���� ū ���� " + c + "�Դϴ�.");
	}
}
