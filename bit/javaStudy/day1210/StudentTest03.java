// �ְ������� �ְ������� ���� �л��� �̸��� ����ϵ��� ����� �߰��ϼ���.

import java.util.Scanner;

class StudentTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String []name = new String[5];
		int []score = new int[5];
		int tot = 0;
		int avg = 0;
		int max = score[0];
		int maxIndex = 0;
/*
		
*/
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "��° �л��� �̸� : ");
			name[i] = scan.next();
			System.out.print((i + 1) + "��° �л��� ���� : ");
			score[i] = scan.nextInt();
			tot = tot + score[i];
		}

		avg = tot / score.length;
		System.out.println();
		System.out.println("*** �л��� ���� ***");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + score[i]);
		}

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				maxIndex = i;
			}
		}

		System.out.println("�ְ����� : " + max);
		System.out.println("���� ���� ������ ���� �л��� : " + name[maxIndex]);
	}
}
