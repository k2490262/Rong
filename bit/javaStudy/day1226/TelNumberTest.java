/*
����ڷκ��� ��ȭ��ȣ�� �Է¹޾� �ùٸ� ��ȭ��ȣ �������� �Ǻ��ϴ� ���α׷��� �ۼ�

010-0000-0000

1) ������ 2���� �����Ͽ� 13�ڸ� ����
2) ù��° ������ ������ 3�ڸ�
3) ù��° �����°� �ι�° ������ ���̿��� 4�ڸ�
4) �ι�° ������ �ڿ��� 4�ڸ�
*/

import java.util.Scanner;

class TelNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** ��ȭ��ȣ �Ǻ� ���α׷� ***");
		System.out.print("��ȭ��ȣ�� �Է����ּ��� ==> ");
		String n = sc.next();

		if (n.length() > 13) {
			System.out.println("�߸��� ��ȭ��ȣ �����Դϴ�.");
		} else if (!n.substring(3, 4).equals("-") || !n.substring(8, 9).equals("-")) {
			System.out.println("�������� Ȯ�����ּ���.");
		} else {
			System.out.println("�ùٸ� ��ȭ��ȣ �����Դϴ�.");
		}
	}
}
