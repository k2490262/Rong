import java.util.Scanner;

class Hw02 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("x�� �� : ");
	int x = scan.nextInt();

	System.out.println("y�� �� : ");
	int y = scan.nextInt();

	System.out.println("z�� �� : ");
	int z = scan.nextInt();

	int sum = x + y + z;

	System.out.println("1. x�� y�� ���� �������� z�� ���� �� : ");
	System.out.println((y % x) + z);

	System.out.println("2. x�� y�� ���� x�� y�� ������ ������ z�� ������ �� : ");
	z = (x * y) / (x + y);
	System.out.println(z);

	z = (x + y);
	x += 1;
	System.out.println("3. x�� y�� ���� z�� �����ϰ� ������ ������ x�� 1��ŭ ������Ų �� : " + z + ", " + x);

	x -= 1;
	System.out.println("4. x�� 1 ���ҽ�Ų �� ���� sum���� x�� �� �� : " + (sum - x));

	sum = sum + x;
	x += 1;
	System.out.println("5. x�� sum�� ���� �� x�� ���� 1 ������Ų �� : " + sum +  ", " + x);
	}
}