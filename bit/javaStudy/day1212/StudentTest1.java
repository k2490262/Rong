import java.util.Scanner;

class StudentTest2 {
	public static void main(String[] args) {
		// �ڹٰ� ������� Ŭ������ ����Ϸ��� �ݵ�� ��ü�� �����ϰ� ����ؾ� ��!

		Date today = new Date;; / ��¥�� ���

		Date a[] = new Date[5]; // ��¥ �迭�� 5�� ����
		a[0] = new Date();
		a[1] = new Date();
		a[2] = new Date();

		Scanner scan = new Scanner(System.in);

		// 5�� �л��� �̸�, ����, ����, ����, ����, ����� ��� ���� �迭�� ����
		String name[] = new String[5];
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
		int tot[] = new int[5];
		double avg[] = new double[5];

		// 5�� �л��� �̸�, ����, ����, ��� �Է¹ް� ������ ����� ���
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "��° �л��� �̸��� �Է��ϼ��� ==> ");
			name[i] = scan.next();

			System.out.print((i + 1) + "��° �л��� ���� ������ �Է��ϼ��� ==> ");
			kor[i] = scan.nextInt();

			System.out.print((i + 1) + "��° �л��� ���� ������ �Է��ϼ��� ==> ");
			eng[i] = scan.nextInt();

			System.out.print((i + 1) + "��° �л��� ���� ������ �Է��ϼ��� ==> ");
			math[i] = scan.nextInt();

			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.0; // �Ǽ��� ��� ����
		}

		// ������ �������� ���������� ����
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (tot[j] > tot[i]) {
					String tname = name[i];
					name[i] = name[j];
					name[j] = tname;

					int tmp = kor[i];
					kor[i] = kor[j];
					kor[j] = tmp;

					tmp = eng[i];
					eng[i] = eng[j];
					eng[j] = tmp;

					tmp = math[i];
					math[i] = math[j];
					math[j] = tmp;

					tmp = tot[i];
					tot[i] = tot[j];
					tot[j] = tmp;

					double tavg = avg[i];
					avg[i] = avg[j];
					avg[j] = tavg;
				}
			}
		}

		// 5�� �л��� ������ ���
		System.out.println("*** ���� ��� ***");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i < name.length; i++) {
			// System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i], tot[i], avg[i]);
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
	}
}
