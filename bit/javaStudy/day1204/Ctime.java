import java.util.Scanner;

class Ctime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, m, s;
		System.out.println("�ʸ� �Է����ּ���.");
		s = scan.nextInt();

		m = s / 60;
		h = m / 60;
		s = s % 60;
		m = m % 60;
		System.out.printf("�Է��Ͻ� �ʸ� �ð����� ȯ�� �� %d�� %d�� %d�ʷ� ȯ��˴ϴ�.", h, m, s);
	}
}
