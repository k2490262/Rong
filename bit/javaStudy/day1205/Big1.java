// ����) ��������� �ΰ��� ������ �Է¹޾� ���߿� ū ���� ã�� ����ϴ� ���α׷�
//			��, ���׿����ڸ� �̿��մϴ�.

import java.util.Scanner;

class Big1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
			System.out.print("ù��° ���� �Է��ϼ���.");
			a = scan.nextInt();

			System.out.print("�ι�° ���� �Է��ϼ���.");
			b = scan.nextInt();

		int i = (a > b) ? a : b;
			System.out.println("�Է��� �� �߿� ū ���� " + i + " �Դϴ�.");
	}
}