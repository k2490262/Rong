// << ���� >>
// � ����� ��� ������ �Է¹޾�
// �� ����� ���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷��� ���弼��.
// ***ó������***
// ���̰� 40�� �̻��̰� ��� ������ Ȧ�� ������ �����
// ���� �ϰ��� ������Դϴ�.

import java.util.Scanner;
import java.util.Date;

class CcTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date thisYear = new Date();
		int year;
		System.out.println("��� ������ �Է��ϼ���.");
		year = scan.nextInt();

		int age = thisYear.getYear()+1900;
		int tp = thisYear - year;
		if (tp >= 40 && tp % 2 = 0);
			System.out.println("���� �ϰ��� ������Դϴ�.");
		else
			System.out.println("���� �ϰ����� �ƴմϴ�.");
	}
}
