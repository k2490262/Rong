// ��� ������ �Է¹޾�
// ���̸� ����Ͽ�
// ���� �ϰ��� ��������� �Ǻ��ϵ��� �ڵ带 ����

import java.util.Scanner;
import java.util.Date;

class CancerTest2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("***���� �ϰ��� ����� Ȯ��***");
	System.out.println("���̸� �Է��ϼ���");

	int age;
	age = sc.nextInt();

	if (age >= 40 && age <= 150)
		System.out.println("����ϰ��� ������Դϴ�.");
	else if (age < 40 && age >= 0)
		System.out.println("����ϰ��� ����ڰ� �ƴմϴ�.");
	else
		System.out.println("�߸��� �Է��Դϴ�.");

	Date today = new Date();
	int thisYear = today.getYear() + 1900;
	}
}