// 사용자한테 임의의 수 n을 입력받아 짝수인지 홀수인지 판별하는 프로그램
// << 실행 예 >>
// 수를 입력하세요 ==> 4
// 4는 짝수입니다.

import java.util.Scanner;

class EvenOddTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.print("수를 입력하세요 : ");
	n = sc.nextInt();

	if (n % 2 == 0)
		System.out.print("짝수입니다.");
	else
		System.out.print("홀수입니다.");
	}
}