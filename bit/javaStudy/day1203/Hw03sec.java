import java.util.Scanner;

class Hw03sec{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int com;
		System.out.println("��ǻ�� ���� : ");
			com = scan.nextInt();
	int cPro;
		System.out.println("C��� ���α׷��� : ");
			cPro = scan.nextInt();
	int eng;
		System.out.println("���� : ");
			eng = scan.nextInt();
	int math;
		System.out.println("�Ϲݼ��� : ");
			math = scan.nextInt();

	int i = (com + cPro + eng + math) / 4;

	System.out.println("������� : " + i);
	}
}