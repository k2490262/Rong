import java.util.Scanner;

class CancerTest {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("***���� �ϰ��� ����� Ȯ��***");
	System.out.println("���̸� �Է��ϼ���");

	int age;
	age = sc.nextInt();

	if (age >= 40)
		System.out.println("����ϰ��� ������Դϴ�.");
	else
		System.out.println("����ϰ��� ����ڰ� �ƴմϴ�.");
	}
}