import java.util.Scanner;

class IfTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, max;

		System.out.print("첫번째 수 입력 : ");
		a = scan.nextInt();
		System.out.print("두번째 수 입력 : ");
		b = scan.nextInt();
		System.out.print("세번째 수 입력 : ");
		c = scan.nextInt();

		if (a > b)
			if (a > c)
				max = a;
			else
				max = c;
		else
			if (b > c)
				max = b;
			else
				max = c;

		System.out.println("큰 수는 " + max + "입니다.");
	}
}
