class OverflowTest {
	public static void main(String[] args) {
		byte a;
		a = 127;
		a = (byte)(a + 1); //����ȯ �� ���� ����
		System.out.println(a);
	}
}
