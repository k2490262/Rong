/*
ex) ��������� n�� �Է¹޾� n�� ����� ��� ����ϴ� ���α׷��� ����

<< ���� �� >>
n�� �Է��Ͻÿ� ==> 8
1 2 4 8
*/

import java.util.Scanner;

class ForTest08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n�� �Է��Ͻÿ� ==> ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.out.print("�۾�����");
	}
}
