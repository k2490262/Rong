/*
��������� ��ȣ�� ��ȣȮ���� �Է¹޾� ���� ��ġ�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ�
�� ��ȣ�� 6���̻� 10�����Ϸ� ����
������ �����ϴ��� �Ǻ��Ͽ� ������ �޽����� ���
*/

import java.util.Scanner;

class PwTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pwt;
		while (pwt) {
			String pw, pw1;
			System.out.println("��й�ȣ �Է�");
			pw = sc.next();

			if (pw.length() < 6) {
				System.out.println("��й�ȣ�� 6�� �̻����� �Է����ּž� �մϴ�.");
			} else if (pw.length() >= 10) {
				System.out.println("��й�ȣ�� 10�� ���Ϸ� �Է����ּž� �մϴ�.");
			}

			if (pw1.length() < 6) {
				System.out.println("��й�ȣ�� 6�� �̻����� �Է����ּž� �մϴ�.");
			} else if (pw1.length() >= 10) {
				System.out.println("��й�ȣ�� 10�� ���Ϸ� �Է����ּž� �մϴ�.");
			}

			if (pw == pw1) {
				System.out.println("������ ��й�ȣ!");
			}
		}
	}
}
