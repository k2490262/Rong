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

		switch (n) {
		case 0 : r = "��"; break;
		case 1 : r = "��"; break;
		case 2 : r = "��"; break;
		case 3 : r = "��"; break;
		case 4 : r = "��"; break;
		case 5 : r = "��"; break;
		case 6 : r = "��"; break;
		case 7 : r = "ĥ"; break;
		case 8 : r = "��"; break;
		case 9 : r = "��"; break;
		}
		System.out.println(r);
	}
}
