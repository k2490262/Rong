/*
��������� n�� �Է¹޾� 1���� n������ 3�� ����� ��� ����Ͻÿ�.
*/

import java.util.Scanner;

class ForTest07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("n�� �Է��ϼ��� ==> ");
		n = scan.nextInt();

		for (int i = 3; i <= n; i += 3) {
			System.out.println(i);
		}
	}
}
