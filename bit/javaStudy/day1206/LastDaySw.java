/*
��������� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷� ����
	��, switch case ���� ����մϴ�.
<< ���� �� >>
���� �Է��ϼ��� ==> 4
4���� 30�� ���� �ֽ��ϴ�.
<< ó������ >>
31 : 1, 3, 5, 7, 8, 10, 12
30 : 4, 6, 9, 11
28 : 2
*/
import java.util.Scanner;

class LastDaySw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m;
		String ld = "";
		System.out.println("*** ������ �� Ȯ�� ���α׷� ***");
		System.out.print("���� �Է��ϼ��� ==> ");
		m = scan.nextInt();

		if (m < 1 || m > 12) {
		System.out.println("�Է°��� Ȯ���ϼ���!");
		return;
		}

		switch (m) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			ld = "31��"; break;

		case 4 : case 6 : case 9 : case 11 :
			ld = "30��"; break;

		default : System.out.println("2���� 28�ϱ��� �ֽ��ϴ�."); return;

		} System.out.println(m + "���� " + ld + "���� �ֽ��ϴ�.");
	}
}
