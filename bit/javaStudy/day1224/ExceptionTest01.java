class ExceptionTest01 {
	public static void div(int a, int b) {
		try {
			int r = a / b;
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����.");
		}
	}
	public static void main(String[] args) {
		div(4, 0);
	}
}
