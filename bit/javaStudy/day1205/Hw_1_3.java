import java.util.Scanner;

class Hw_1_3 {
	public static void main(String[] args) {
		int g, m;
		m = 100;
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� �����ϼ̽��ϱ�? ");
		g = scan.nextInt();

		if (g < 10) {
			m *= g; // m * g = m
		} else {
			m *= g;
			m -= m * 0.1; // m * 0.1 - m = m
		} System.out.print("���� ������ " + m + "�Դϴ�.");
	}
}
