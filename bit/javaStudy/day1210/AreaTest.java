/*
�簢�� ���� = ���� * �غ�
�ﰢ�� ���� = ���� * �غ�
�� ���� = PI * ������ * ������
*/

import java.util.Scanner;

class AreaTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, b, rad;
		double r = 0;
		String a;

		System.out.print("���� �Է� ==> ");
		a = scan.next();

		if (!a.equals("R") && !a.equals("T") && !a.equals("C") && a.equals("r") && a.equals("t") && a.equals("c")) {
			System.out.println("�ùٸ� ���ڸ� Ȯ���ϼ���!");
			return;
		}

		if (a.equals("R") || a.equals("r")) {
			System.out.print("���� �Է� ==> ");
			h = scan.nextInt();
			System.out.print("�غ� �Է� ==> ");
			b = scan.nextInt();
			r = h * b;
		} else if (a.equals("T") || a.equals("t")) {
			System.out.print("���� �Է� ==> ");
			h = scan.nextInt();
			System.out.print("�غ� �Է� ==> ");
			b = scan.nextInt();
			r = h * b;
		} else if ((a.equals("C") || a.equals("c"))) {
			System.out.print("������ �Է� ==> ");
			rad = scan.nextInt();
			r = Math.PI * (double) rad * rad;
		}
		System.out.printf("��� : %.2f", r);
	}
}
