import java.util.Scanner;

class StudentTest {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int com, c, eng, math;

	System.out.print("��ǻ�� ���� : ");
	com = scan.nextInt();

	System.out.print("C��� ���α׷��� : ");
	c = scan.nextInt();

	System.out.print("���� : ");
	eng = scan.nextInt();

	System.out.print("�Ϲݼ��� : ");
	math = scan.nextInt();

	double avg = (com + c + eng + math) / 4.0;

	System.out.println("������� : " + avg);
	}
}