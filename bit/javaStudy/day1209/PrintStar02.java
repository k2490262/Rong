/*
ex) ������ ���� �����ϴ� ���α׷��� ����

<< ���� �� >>
�� ���� �Է��ϼ��� ==> 5
*
**
***
****
*****
*/

import java.util.Scanner;

class PrintStar02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ��� ==> ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
