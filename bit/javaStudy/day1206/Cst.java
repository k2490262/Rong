/*
��������� ����, ������ �Է¹޾� ���ڸ��� ���Ͽ� ����ϴ� ���α׷��� ����� ���ϴ�.
	<< ���� �� >>
	�̸��� �����ΰ���? ȫ�浿
	�� ���� �¾����? 3
	�� �Ͽ� �¾����? 15
	ȫ�浿���� ���ڸ��� ___�ڸ��Դϴ�.

	<< ó������ >>
	�����ڸ�	01/20 ~ 02/18
	������ڸ�	02/19 ~ 03/20
	���ڸ�		03/21 ~ 04/19
	Ȳ���ڸ�	04/20 ~ 05/20
	�ֵ����ڸ�	05/21 ~ 06/21
	���ڸ�		06/22 ~ 07/22
	�����ڸ�	07/23 ~ 08/22
	ó���ڸ�	08/23 ~ 09/23
	õĪ�ڸ�	09/24 ~ 10/22
	�����ڸ�	10/23 ~ 11/22
	����ڸ�	11/23 ~ 12/24
	�����ڸ�	12/25 ~ 01/19
*/

import java.util.Scanner;

class Cst {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int m, d;
		String r = "";

		System.out.print("�̸��� �����ΰ���? ");
		String name = scan.next();
		System.out.print("�� ���� �¾����? ");
		m = scan.nextInt();
		System.out.print("�� �Ͽ� �¾����? ");
		d = scan.nextInt();
		
		if ((m <= 0) || (m > 12) || (d <= 0) || (d > 31)) {
			System.out.println("�� �� �Է��߾�");
			return;
		}	else {
				switch (m) {
				case 1 : if (d >= 20) {r = "�����ڸ�";} else r = "�����ڸ�"; break;
				case 2 : if (d <= 19) {r = "�����ڸ�";} else r = "������ڸ�"; break;
				case 3 : if (d <= 21) {r = "������ڸ�";} else r = "���ڸ�"; break;
				case 4 : if (d <= 20) {r = "���ڸ�";} else r = "Ȳ���ڸ�"; break;
				case 5 : if (d <= 21) {r = "Ȳ���ڸ�";} else r = "�ֵ����ڸ�"; break;
				case 6 : if (d <= 22) {r = "�ֵ����ڸ�";} else r = "���ڸ�"; break;
				case 7 : if (d <= 23) {r = "���ڸ�";} else r = "�����ڸ�"; break;
				case 8 : if (d <= 23) {r = "�����ڸ�";} else r = "ó���ڸ�"; break;
				case 9 : if (d <= 24) {r = "ó���ڸ�";} else r = "õĪ�ڸ�"; break;
				case 10 : if (d <= 23) {r = "õĪ�ڸ�";} else r = "�����ڸ�"; break;
				case 11 : if (d <= 23) {r = "�����ڸ�";} else r = "����ڸ�"; break;
				case 12 : if (d <= 25) {r = "����ڸ�";} else r = "�����ڸ�"; break;
			}
		} System.out.println(name + "���� ���ڸ��� " + r + "�Դϴ�.");
	}
}