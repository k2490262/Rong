// ��������� ���� �Է¹޾� �������� ����ϴ� ���α׷� ����
// << ���� �� >>
// ���� �Է��ϼ��� ==> 7
// 7���� �����Դϴ�.
// �� : 3, 4, 5
// ���� : 6, 7, 8,
// ���� : 9, 10, 11
// �ܿ� : 12, 1, 2

import java.util.Scanner;

class FourSeason {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month, f;

		System.out.println("���� �Է��ϼ��� == > ");
		month = scan.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println("��");
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
		} else if (month >= 9 && month <= 11) {
			System.out.println("����");
		} else if (month == 1 && month == 2 || month == 12) {
			System.out.println("�ܿ�");
		} else {
		System.out.println("��! ���Է�");
		}
	}
}
