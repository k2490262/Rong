import java.util.Scanner;

class DigitToKor {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("0~9 ������ ���� ==> ");
		n = sc.nextInt();

		if(n < 0 || n > 9) {
			System.out.println("�Է� ���� Ȯ���ϼ���!");
			return;
		}
		String r = "";

		if (n == 0)
			r = "��";
		else if (n == 1)
			r = "��";
		else if (n == 2)
			r = "��";
		else if (n == 3)
			r = "��";
		else if (n == 4)
			r = "��";
		else if (n == 5)
			r = "��";
		else if (n == 6)
			r = "��";
		else if (n == 7)
			r = "ĥ";
		else if (n == 8)
			r = "��";
		else if (n == 9)
			r = "��";
		System.out.println(r);
	}
}
