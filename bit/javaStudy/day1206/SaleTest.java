import java.util.Scanner;

class SaleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int base = 100;
		int cnt, total;
		System.out.println("*** 100�� ���� ***");
		System.out.print("���Լ����� �Է��ϼ��� ==> ");
		cnt = scan.nextInt();

		total = base * cnt;
		if (cnt >= 10) {
			total = (int) (total * 0.9);
			/*
			int discount = total *= 0.1;
			total -= discount;
			*/
			System.out.println("10�� �̻� �����Ͻþ� 10%���� �Ǿ����ϴ�.");
		}
		System.out.println("��ü �ݾ��� " + total + "�� �Դϴ�.");
	}
}
