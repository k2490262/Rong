import java.util.Scanner;

class CreditCard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// double []cards;
		// cards = new double[12];
		double []cards = new double[12];
		// cards[0], cards[1], ... cards[11];

		/*
		double max = cards[0];
		int maxIdx = 0;
		�ʱⰪ�� ���� ���� ��
		��� ���� ã���� ���� ���� �� ã�� �� ����
		*/

		double total = 0; // ������ �����ϱ� ���� 0����
		for (int i = 0; i < cards.length/* 12�� ����(12�� �̹Ƿ�) */; i++) {
			System.out.print((i + 1) + "���� ī�� ���Ḧ �Է� ==> ");
			cards[i] = scan.nextDouble();
			total = total + cards[i];
		}

		double avg = total / cards.length; // 12

		double max = cards[0];
		int maxIdx = 0;
		double min = cards[0];
		int minIdx = 0;

		for (int i = 1; i < cards.length; i++) {
			if (cards[i] > max) {
				max = cards[i];
				maxIdx = i;
			}
			if (cards[i] < min) {
				min = cards[i];
				minIdx = i;
			}
		}

		/*
		max : 2, min : 2
		[2][2][1][3][7]...[100]
		    1
		ū ���� ���ϴ� ���� ���� ���� ���ϴ� ���� ������ �����ؾ���
		���� ������ if�� ���ؾ� ��
		*/

		System.out.println("1�� ������ ��ü ��� �ݾ� : " + total);
		System.out.println("���� ��� ���ݾ� : " + avg);
		System.out.println("���� ������ ���Ҵ� �� : " + (maxIdx + 1));
		System.out.println("���� ������ ������ �� : " + (minIdx + 1));
	}
}
