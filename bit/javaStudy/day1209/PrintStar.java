/*
ex) ������ ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�

<< ���� �� >>
�ټ��� �Է��ϼ��� ==> 3
ĭ���� �Է��ϼ��� ==> 4
****
****
****
*/

import java.util.Scanner;

class PrintStar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ټ��� �Է��ϼ��� ==> ");
		int a = scan.nextInt();
		System.out.print("ĭ���� �Է��ϼ��� ==> ");
		int b = scan.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
					System.out.print("*");
			}
			System.out.println("");
		}
	}
}
