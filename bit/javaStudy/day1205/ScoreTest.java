// �л��� ������ �Է¹޾� "��", "��", "��", "��", "��" �� �Ǻ��Ͽ� ����ϴ� ���α׷�

import java.util.Scanner;

class ScoreTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		String r;
		System.out.print("�л��� ������ �Է� ===> ");
		score = scan.nextInt();

		if (score >= 90) {
			r = "��";
		} else if (score >= 80) {
			r = "��";
		} else if (score >= 70) {
			r = "��";
		} else if (score >= 60) {
			r = "��";
		} else {
			r= "��";
		}
		System.out.println("��� : " + r + "�Դϴ�.");
	}
}