/*
��������� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷�
�Է��� ���� 1 ~ 12 ������ ���� �ƴ϶�� ����� �� ���� �Է¹��� ������ �ݺ�����
*/

import java.util.Scanner;

class WhileTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;

		while (true) {
			System.out.print("���� �Է��ϼ��� ==> ");
			month = scan.nextInt();

			if (month >= 1 && month <= 12) {
				break;
			}
		}
		int []lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		System.out.print(month + "���� " + lastDay[month - 1] + "�ϱ��� �ֽ��ϴ�.");
	}
}
