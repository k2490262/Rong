/*
����ڷκ��� ��ȭ��ȣ�� �Է¹޾� �ùٸ� ��ȭ��ȣ �������� �Ǻ��ϴ� ���α׷��� �ۼ�

010-0000-0000

1) ������ 2���� �����Ͽ� 13�ڸ� ����
2) ù��° ������ ������ 3�ڸ�
3) ù��° �����°� �ι�° ������ ���̿��� 4�ڸ�
4) �ι�° ������ �ڿ��� 4�ڸ�
*/

import java.util.Scanner;

class CheckPhoneNumberTestRex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** ��ȭ��ȣ �Ǻ� ���α׷� ***");
		System.out.print("��ȭ��ȣ�� �Է����ּ��� ==> ");
		String n = sc.next();

		if (n.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
			System.out.println("�ùٸ� ��ȭ��ȣ �����Դϴ�.");
		} else {
			System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�.");
		}
	}
}
