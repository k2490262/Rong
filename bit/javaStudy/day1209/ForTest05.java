/*
ex) for���� �̿��Ͽ� ������ ���� �����ϴ� ���α׷��� �ۼ��ϼ���.

<< ���� �� >>
���� � ����ұ��? ==> 5
*****
*/

import java.util.Scanner;

class ForTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String s = "";
		System.out.print("���� � ����ұ��? ==> ");
		n = scan.nextInt();
		for (int i = 1;  i <= n; i++) {
			s += "*";
			System.out.print("*");
		} System.out.print(s);
	}
}
