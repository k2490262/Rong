import java.util.Scanner;

class IfTest01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n;
		System.out.print("n�� �Է� ==> ");
		n = scan.nextInt();

		if (n >= 0) {
			System.out.println(n + 100);
		}
		else {
			System.out.println(n * n);
		}
		System.out.println("�۾�����");
	}
}
