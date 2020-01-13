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

class MyUtil {
	public static int getYear(String jm) {
		int year = Integer.parseInt(jm.substring(0,2));

		year += 1900;

		int flag = Integer.parseInt(jm.substring(7,8));
		if (flag == 3 || flag == 4 || flag == 7 || flag == 8) {
			flag = year + 100;
		}
		return year;
	}

	public static int getAge(String jm) {
		int year = getYear(jm);
		int currentYear = (new Date()).getYear() + 1900;
		int age = currentYear - year;
		return age;
	}

	public static String getGender(String jm) {
		String re = "����";
		int f = Integer.parseInt(jm.substring(7, 8));
		
		if (f % 2 == 0) {
			re = "����";
		}
		return re;
	}
}

class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** ���� �ϰ��� ����� �Ǻ� ���α׷� ***");		
		System.out.print("�ֹε�Ϲ�ȣ�� �Է� ==> ");
		String jm = sc.next();

		int birthYear = MyUtil.getYear(jm);
		int age = MyUtil.getAge(jm);
		String gender = MyUtil.getGender(jm);
		int currentYear = (new Date()).getYear() + 1900;

		String r = "����, ����";

//		2019-1969
//		if (age < 40 || currentYear % 2 != birthYear % 2) {
		if (age < 40 || age % 2 != 0) {	// ���ؿ��� - ������� = ����
			System.out.println("���� �ϰ��� ����ڰ� �ƴմϴ�.");
			return;
		}

		if (age >= 50) {
			r = r + ", �����";
		}

		if (gender.equals("����")) {
			r = r + ", �����, �ڱþ�";

			System.out.println("���� ���� �ϰ��� ����� �Դϴ�.");
			System.out.println("�����׸��� " + r + "�Դϴ�.");
		}
	}
}
