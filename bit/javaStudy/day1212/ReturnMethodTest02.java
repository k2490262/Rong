class ReturnMethodTest02 {
	public static int plus(int a, int b) { /* void = ���� ���� ���ٴ� �� */
		int r = a + b;
		return r;
	}
	public static void main(String[] args) {
		int r = plus(2, 3);
		System.out.println("��� : " + r);
	}
}
