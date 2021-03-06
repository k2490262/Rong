// 사용자한테 두 수를 입력받아 두 수의 조화평균을 구하여 출력하는 pg

import java.util.Scanner;

class NotFoundHarmonicMeanException extends Exception {	// 사용자 정의 예외
	public NotFoundHarmonicMeanException (String msg) {
		super(msg);
	}
}

class HarmonicMeanTest02 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("첫번째 수를 입력해주세요 ==> ");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요 ==> ");
		b = sc.nextInt();

		if (a == -b) {
			throw new NotFoundHarmonicMeanException("두 수의 조화평균은 없습니다.");
		}

		int r = (a * b) * 2 / (a + b);
		System.out.println("두 수의 조화평균의 값은 " + r + "입니다.");
		} catch(NotFoundHarmonicMeanException e) {
			System.out.println(e.getMessage());
		}
	}
}
