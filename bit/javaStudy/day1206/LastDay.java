/* ex) ��������� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷� �ۼ�
<< ���� �� >>
���� �Է��ϼ��� ==> 7
7���� 31�ϱ��� �־��!
<< ó������ >>
31 : 1, 3, 5, 7, 8, 10, 12
30 : 4, 6, 9, 11
28 : 2
*/ 

import java.util.Scanner;

class LastDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� ==> ");
		int m = scan.nextInt();
		String a = "";

		if (m < 1 || m > 12 ) {
			System.out.println("�߸� �Է�");
			return;
		} else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			a = "31��";
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			a = "30��";
		} else {
			System.out.println("28��");
		} System.out.println(m + "���� ������ ���� " + a + "���� �ֽ��ϴ�.");
	}
}
