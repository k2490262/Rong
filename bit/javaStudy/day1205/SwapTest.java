class SwapTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// a�� b�� ����� ���� ���� �¹ٲپ� ������.

		int tmp = a;
		a = b;
		b = tmp;

		System.out.println("a = " + tmp);
		System.out.println("b = " + a);
	}
}
