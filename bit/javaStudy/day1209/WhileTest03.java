/*
������ ���� �����ϴ� ���α׷��� while���� �̿��Ͽ� �ۼ��ϼ���.

<< ���� �� >>
�� ���� �Է��ϼ��� ==> 3
ĭ ���� �Է��ϼ��� ==> 4
****
****
****
*/

import java.util.Scanner;

class WhileTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows, cols;
		System.out.print("�� ���� �Է��ϼ��� ==> ");
		rows = scan.nextInt();
		System.out.print("ĭ ���� �Է��ϼ��� ==> ");
		cols = scan.nextInt();

		int i = 1;
		while (i <= rows) {
			int j = 1;
			while (j <= cols) {
				System.out.print("*");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}
