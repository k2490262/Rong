import java.util.Scanner;

class StudentTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []score = new int[10];
		int tot = 0;
		double avg;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "��° �л��� ������ �Է����ּ��� : ");
			score[i] = scan.nextInt();
			tot = tot + score[i];
		}
		avg = tot / score.length;
		System.out.println("��ü�հ� : " + tot);
		System.out.println("��ü��� : " + avg);
	}
}
