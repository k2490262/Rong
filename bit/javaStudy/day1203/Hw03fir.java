import java.util.Scanner;

class Hw03fir{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("����� �ظ��� �������� �Է��Ͻÿ� : ");
	int rad = scan.nextInt();

	System.out.println("������� ���̸� �Է��Ͻÿ� : ");
	int height = scan.nextInt();

	double vol = rad * rad * 3.14 * height;
		System.out.println("������� ���Ǵ� " + vol + "�Դϴ�.");
	}
}