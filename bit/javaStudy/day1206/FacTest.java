import java.util.Scanner;

class FacTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, r = 1;

		System.out.println("*** ���丮�� ��� �ý��� ***");
		System.out.print("n�� �Է��ϼ��� ==> ");
		n = scan.nextInt();

		for (int i = n; i >= 1; i--) {
			r = r * i;
			System.out.print(i);
			if(i != 1)
				System.out.print(" * ");
		} System.out.print(" = " + r);
	}
}
