class ReturnMethodTest01{
	public static void plus(int a, int b, int c) {
		if (a == 0 && b == 0 && c == 0) {
			return;
		}
		int r = a + b;
		System.out.println("���ϱ� ��� : " + r);
		return;
	}

	public static void main(String[] args) {
		plus(3, 0, 1);
		int year = 2019;
		System.out.print("���ش� " + year + "�� �Դϴ�.");
	}
}
