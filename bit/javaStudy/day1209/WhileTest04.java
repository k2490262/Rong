/*
��������� n�� �Է¹޾� 1 ~ n������ ¦���� ���� �����Ͽ� ����ϴ� ���α׷�
	while ���� �̿��Ͽ� �ۼ�
*/

import java.util.Scanner;
class WhileTest04{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.print("n�� �Է��ϼ��� ==> ");
		n = scan.nextInt();

		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1���� " + n + "������ ¦���� ���� : " + sum);
	}
}
