/*
ex) ��������� ������ �� n�� �Է¹޾� 1���� n������ ���� �����Ͽ�
����ϴ� ���α׷� ����
<< ���� �� >>
n�� �Է��ϼ��� ==> 10
1���� 10������ ���� __�Դϴ�.
*/

import java.util.Scanner;

class AccuTotal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n�� �Է��ϼ��� ==> ");
		int n = scan.nextInt();
		int i, j = 0;

		for (i = 1; i <= n; i++) {
				j += i;
		} System.out.println("1���� n������ ���� : " + j + "�Դϴ�.");
	}
}
