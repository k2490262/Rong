/*
����ڷκ��� �ֹε�Ϲ�ȣ�� �Է¹޾� ���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷��� �ۼ�

<ó������>
- ���� �ϰ��� ����ڴ� 40���̻�
	���ذ� ¦�������̸� ¦���ؿ� �¾ ���
	���ذ� ¦�������̸� Ȧ���ؿ� �¾ ���

- ���̰� 40�� �̻� �����̸� ���� �����׸��� ����, ����
- ���̰� 40�� �̻� �����̸� ���� �����׸��� ����, ����, �����, �ڱþ�
- ���̰� 50�� �̻� �����̸� ���� �����׸��� ����, ����, �����
- ���̰� 50�� �̻� �����̸� ���� �����׸��� ����, ����, �����, �����, �ڱþ�
*/

import java.util.Scanner;
import java.util.Date;

class CancerTestFromJumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է�");
		String jm = sc.next();
		int year = Integer.parseInt(jm.substring(0,2));

		year += 1900;

		int flag = Integer.parseInt(jm.substring(7,8));
		if (flag == 3 || flag == 4 || flag == 7 || flag == 8) {
			flag = year + 100;
		}

		int currentYear = (new Date()).getYear() + 1900;
		int age = currentYear - year;

		String gender = "����";
		if (currentYear % 2 == 0) {
			gender = "����";
		}

		int birthYear = currentYear - age;

		if (birthYear % 2 == 0 && age >= 40 && age < 50 && gender == "����") {
			System.out.println("40�� �̻� 50�� ���� ��������,\n���� �ϰ��� �׸��� ����, �����Դϴ�.");
		} else if (birthYear % 2 == 0 && age >= 40 && age < 50 && gender == "����") {
			System.out.println("40�� �̻� 50�� ���� ��������,\n���� �ϰ��� �׸��� ����, ����, �����, �ڱþ��Դϴ�.");
		}
	}
}
