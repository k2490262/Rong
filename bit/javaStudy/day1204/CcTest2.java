// �� �ذ� Ȧ�� �����̸� Ȧ�� ������ �¾ ���
// �� �ذ� ¦�� �����̸� ¦�� ������ �¾ ���
// ���� �ϰ��� ����ڰ� �ǵ��� �ڵ带 ����

import java.util.Scanner;
import java.util.Date;

class CcTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		int birthYear, age;
		String result;

		System.out.println("***���� �ϰ��� ����� �Ǻ� ���α׷�***");
		System.out.print("��������� �Է� : ");
		birthYear = sc.nextInt();
		age = thisYear - birthYear;
		if (age >= 40 && birthYear % 2 != 0)
			result = "���� �ϰ��� ������Դϴ�.";
		if (age >= 40 && age % 2 == 0)
			result = "���� �ϰ��� ������Դϴ�.";
		else
			result = "���� �ϰ��� ����ڰ� �ƴմϴ�.";
		
		System.out.println(result);
	}
}
