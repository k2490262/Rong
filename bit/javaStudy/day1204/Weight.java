import java.util.Scanner;

class Weight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ŀ�带 �Է��ϼ���.");
		int i = scan.nextInt();
		double lb = i * (double) 454;
		System.out.printf("�����Դ� �Ŀ��� %dlb�̰�, �׷����� ȯ��� %.3fg�̴�.", i, lb);
	}
}
