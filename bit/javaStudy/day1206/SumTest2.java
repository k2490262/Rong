import java.util.Scanner;

class SumTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, n, sum = 0;

		System.out.print("������ ���ұ��?");
		n = scan.nextInt();

		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.print("1���� " + n + "������ ���� : " + sum);
	}
}
