// 사용자한테 두개의 정수를 입력받아 그 중에 큰 수를 찾아 출력하는 프로그램을 작성
// (클래스 이름, 변수명 등은 자유롭게)
// << 실행 예 >>
// 첫번째 수를 입력하세요 ==> 7
// 두번째 수를 입력하세요 ==> 5
// 큰 수는 7입니다.

import java.util.Scanner;

class Big{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("첫번째 수를 입력하세요 : ");
		i = scan.nextInt();
		System.out.println("두번째 수를 입력하세요 : ");
		j = scan.nextInt();

		if (i > j)
			System.out.printf("큰 수는 %d입니다.", i);
		else
			System.out.printf("큰 수는 %d입니다.", j);
	}
}
