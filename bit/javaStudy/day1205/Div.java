/*
����) ����ڷκ��� �ΰ��� ������ �Է¹޾� ������ �� ����� ����ϼ���.
(Ŭ������, ������ ���� �����Ӱ� �ϰ� ������ ����� �Ǽ������� ����մϴ�.)
*/

import java.util.Scanner;

class Div{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("ù��° ������ �Է��ϼ���.");
		i = scan.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		j = scan.nextInt();

		double div = (double) i / j;
		System.out.printf("�� ������ �Ǽ��� ���� ������� %.2f�Դϴ�.", div);
	}
}
