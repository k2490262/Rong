import java.util.Scanner;

class LastDayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m;
		int ld = 31;
		System.out.println("*** ������ �� Ȯ�� ���α׷� ***");
		System.out.print("���� �Է��ϼ��� ==> ");
		m = scan.nextInt();

		if (m < 1 || m > 12) {
			System.out.println("�Է°��� �߸� �Ǿ����ϴ�.");
			return;
		}
		if (m == 2) {
			ld = 28;
		}
		else if (m == 4 || m == 6 || m == 9 || m == 11) {
			ld = 30;
		}
		System.out.println(m + "����" + ld + "�ϱ��� �ֽ��ϴ�.");
	}
}
