import java.util.Scanner;

class ForTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ����� ����ұ��? ==> ");
		int dan = scan.nextInt();

		System.out.println(dan + "�� ���");

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			System.out.println(i++);
		}
	}
}
