import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = 0, b = 1, c;
		int i;

		for (i = 2; i <= 10; i++) {
			c = a + b; // ���� a�� b�� ���Ͽ� ���� c�� �����Ѵ�.
			a = b; // ���� b�� ���� ���� a�� �ű��.
			b = c; // ���� c�� ���� ���� b�� �ű��.
			// a = 34, b = 55, c = 55

			System.out.println();
		}
	}
}

/*
2 / c = 1, a = 1, b = 1
3 / c = 2, a = 1, b = 2
4 / c = 3, a = 2, b = 3
5 / c = 5, a = 3, b = 5
6 / c = 8, a = 5, b = 8
7 / c = 13, a = 8, b = 13
8 / c = 21, a = 13, b = 21
9 / c = 34, a = 21, b = 34
10 / c = 55, a = 34, b = 55
*/