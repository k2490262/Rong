/*
��������� �ֹι�ȣ�� �Է¹޾� ������ �ľ��ϴ� ���α׷��� �ۼ�
*/

import java.util.Scanner;

class CheckSex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
		String jm = sc.next();
//		int jm = sc.nextInt();
		
		int idx = Integer.parseInt(jm.charAt(7) + "");
		if (idx == 1 || idx == 3) {
			System.out.println("����");
		} else if (idx == 2 || idx == 4) {
			System.out.println("����");
		}
	}
}