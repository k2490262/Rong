/*
ex) ��������� ������ �� n�� �Է¹޾� n!�� ���Ͽ� ����ϴ� ���α׷��� ���� �� ����
	<< ���� �� >>
	n�� �Է��ϼ��� ==> 5
	5 * 4 * 3 * 2 * 1 =__
*/

import java.util.Scanner;

class Fac01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j = 1;

		System.out.println("*** ���丮�� ��� �ý��� ***");
		System.out.print("n�� �Է��ϼ��� ==> ");
		int n = scan.nextInt();

		for (i = n; i >= 1; i--) {
			j *= i;
		} System.out.print("n�� ���� : " + j + "�Դϴ�.");
	}
}
