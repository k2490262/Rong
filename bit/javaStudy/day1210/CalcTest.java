import java.util.Scanner;

class CalcTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String op;
		int a, b;
		double r = 0;
		System.out.println("*** ������ ���� ***");
		System.out.print("�����ڸ� �Է�(+, -, *, /) ==> ");
		op = scan.next();

		if (!op.equals("+") && !op.equals("-") && !op.equals("*") &&  !op.equals("/")) {
			System.out.println("�ùٸ� �����ڸ� Ȯ���ϼ���!");
			return;
		}

		System.out.print("ù��° ���� �Է� ==> ");
		a = scan.nextInt();
		System.out.print("�ι�° ���� �Է� ==> ");
		b = scan.nextInt();

		if (op.equals("+")) {
			r = a + b;
		} else if (op.equals("-")) {
			r = a - b;
		} else if (op.equals("*")) {
			r = a * b;
		} else if (op.equals("/")) {
			if (b == 0) {
				System.out.println("0���� ���� ���� �����!");
				return;
			}
			r = a / (double) b;
		}
		System.out.printf("��� : %.2f", r);
	}
}
