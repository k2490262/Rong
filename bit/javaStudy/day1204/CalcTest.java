/*
��������� �ΰ��� ������ �Է¹޾�
��Ģ������ ������ ����� ����ϴ� ���α׷�

	<< ���� �� >>
	ù��° ���� �Է��ϼ���? : 4
	�ι�° ���� �Է��ϼ���? : 2
	4 + 2 = __
	4 - 2 = __
	4 * 2 = __
	4 / 2 = __
*/

import java.util.Scanner;

class CalcTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, add, sub, mul;
		double div;
		System.out.println("ù��° ���� �Է��ϼ���? : ");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���? : ");
		b = sc.nextInt();
		add = a + b;
		sub = a - b;
		mul = a * b;
		div = (double)a / b;
		System.out.printf("%d + %d = %d\n", a, b, add);
		System.out.printf("%d - %d = %d\n", a, b, sub);
		System.out.printf("%d * %d = %d\n", a, b, mul);
		System.out.printf("%d / %d = %.1f\n", a, b, div);
		//System.out.printf(a + "+" + b + "=" + add);
	}
}
