import java.util.Scanner;

class CalcArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type;
		double area = 0, width, height, radius;
		System.out.println("*** ���� ���� ��� ���α׷� ***");
		System.out.print("������ ������ �Է��ϼ��� ==> ");
		type = scan.next();

		switch(type) {
			case "R" : case "r" :
				System.out.print("�簢���� ���� ���� ==> ");
				width = scan.nextDouble();
				System.out.print("�簢���� ���� ���� ==> ");
				height = scan.nextDouble();
				area = width * height;
				break;

			case "T" : case "t" :
				System.out.print("�ﰢ���� ���� ���� ==> ");
				width = scan.nextDouble();
				System.out.print("�ﰢ���� ���� ���� ==> ");
				height = scan.nextDouble();
				area = width * height / 2;
				break;

			case "C" : case "c" :
				System.out.print("���� ������ ==> ");
				radius = scan.nextDouble();
				area = Math.PI * radius * radius;
				break;
		}
		System.out.printf("������ ���� : %.2f", area);
	}
}
