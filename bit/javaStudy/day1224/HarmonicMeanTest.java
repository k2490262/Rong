// 사용자한테 두 수를 입력받아 두 수의 조화평균을 구하여 출력하는 pg

import java.util.Scanner;

class NotFoundHarmonicMeanException {	// 사용자 정의 예외
	public NotFoundException (String msg) {
		super(msg);
	}
}

class HarmonicMeanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("첫번째 수를 입력해주세요 ==> ");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요 ==> ");
		b = sc.nextInt();

		int r = (a * b) * 2 / (a + b);
		System.out.println("두 수의 조화평균의 값은 " + r + "입니다.");
	}
}
