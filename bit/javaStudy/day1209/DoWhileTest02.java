/*
ex) ��������� n�� �Է¹޾� 1 ~ n������ ¦���� ���� �����Ͽ� ����ϴ� ���α׷�
		do ~ while ���� �̿��Ѵ�.
*/

import java.util.Scanner;

class DoWhileTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� ==> ");
		int n = scan.nextInt();

		int i = 1;
		int sum = 0;
		do {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		} while (i <= n);
		System.out.println("1���� " + n + "������ ¦���� ���� : " + sum);
	}
}
