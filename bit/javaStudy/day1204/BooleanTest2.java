//�л��� ������ �Է¹޾� 60�� �̻��̸� "�հ�"
//�׷��� ������ "���հ�"�� ���

import java.util.Scanner;

class BooleanTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		boolean isPass;
		String result;

		System.out.print("������ �Է��ϼ��� : ");
		score = sc.nextInt();
		isPass = score >= 60;
		
		if (isPass)
			result = "�հ��Դϴ�.";
		else
			result = "���հ��Դϴ�.";
		System.out.println("�ش� �л��� " + result);
	}
}
