import java.util.Scanner;

class BoxVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***������ ���Ǹ� ����ϴ� ���α׷�***\n");
		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
		int l = scan.nextInt();
		System.out.print("������ �ʺ� �Է��Ͻÿ� : ");
		int w = scan.nextInt();
		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
		int h = scan.nextInt();
		int i = l * h * h;
		System.out.println("������ ���Ǵ� " + i + " �Դϴ�.");
	}
}