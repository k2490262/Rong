/*
��������� ������ �� n�� �Է¹޾� �� ���� �Ҽ����� �Ǻ��ϴ� ���α׷� �ۼ�

<< ���� �� >>
n �� �Է��ϼ��� ==> 7
7�� �Ҽ��Դϴ�.

<< �Ҽ� >>
����� ���� 2���� ���� ���մϴ�.
*/

import java.util.Scanner;

class ForTest09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		System.out.print("n�� �Է��ϼ��� ==> ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt += 1;
			}
		}
		if (cnt == 2) {
			System.out.print(n + "��(��) �Ҽ��Դϴ�.");
		} else {
			System.out.print(n + "��(��) �Ҽ��� �ƴմϴ�.");
		}
	}
}
