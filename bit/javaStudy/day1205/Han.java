// ����) ��������� 0~9 ������ ������ �Է¹޾� �ѱ�ǥ��� ����ϴ� ���α׷� ����
// << ���� �� >>
// 0~9 ������ ���� �Է��ϼ��� ==> 7
// ĥ!
// if (a==9)	a�� 9�ϰ� ��������?

import java.util.Scanner;

class Han {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~9 ������ ���� �Է��ϼ��� ==> ");
		int a = scan.nextInt();

		if (a == 9) {
			System.out.println("��!");
		} else if (a == 8){
			System.out.println("��!");
		} else if (a == 7){
			System.out.println("ĥ!");
		} else if (a == 6){
			System.out.println("��!");
		} else if (a == 5){
			System.out.println("��!");
		} else if (a == 4){
			System.out.println("��!");
		} else if (a == 3){
			System.out.println("��!");
		} else if (a == 2){
			System.out.println("��!");
		} else if (a == 1){
			System.out.println("��!");
		} else if (a == 0){
			System.out.println("��!");
		} else
			System.out.println("�߸��� �Է��Դϴ�!");
	}
}
