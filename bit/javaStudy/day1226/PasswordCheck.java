/*
��������� ��ȣ�� ��ȣȮ���� �Է¹޾� ���� ��ġ�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ�
�� ��ȣ�� 6���̻� 10�����Ϸ� ����
������ �����ϴ��� �Ǻ��Ͽ� ������ �޽����� ���
*/

import java.util.Scanner;

class PasswordCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pw, pwCheck;
		System.out.println("��й�ȣ �Է�");
		pw = sc.next();
		System.out.println("��й�ȣ ���Է�");
		pwCheck = sc.next();

		if (!pw.equals(pwCheck)) {
			System.out.println("��й�ȣ�� ��Ȯ�����ּ���.");
			return;
		}

		int n = pw.length();
		if (n >= 6 && n <= 10) {
			System.out.println("������ ��й�ȣ!");
		} else {
			System.out.println("��й�ȣ�� ��Ȯ�����ּ���.");
		}
	}
}
