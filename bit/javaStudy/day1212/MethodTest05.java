// �ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū ���� ã�� ����ϴ� �޼ҵ带 ����

import java.util.Scanner;

class MethodTest05 {
	public static void max(int a, int b) {
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		System.out.println("�� ���� �� ū ���� : " + r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է����ּ��� ==> ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ��� ==> ");
		int b = sc.nextInt();
		max(a, b);
	}
}
