/*
����ڷκ��� n�� �Է¹޾� 1���� n������ ¦������, Ȧ���� ��, ¦���� ����, 
	Ȧ���� ������ ���� ���Ͽ� ����ϼ���.
*/

import java.util.Scanner;

class SumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sumEven = 0, sumOdd = 0, cntEven = 0,cntOdd = 0;

		System.out.print("n�� �Է��ϼ��� ==> ");
		n = scan.nextInt();
		// i : 1, 2, 3, 4, 5...n

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sumEven += i;
				cntEven ++;
				// cntEven += 1;
				// cntEven = cntEven + 1;
			} else {
				sumOdd += i;
				cntOdd++;
			}
		}
		System.out.println("¦���� �� : " + sumEven);
		System.out.println("Ȧ���� �� : " + sumOdd);
		System.out.println("¦���� ���� : " + cntEven);
		System.out.println("Ȧ���� ���� : " + cntOdd);

	}
}
