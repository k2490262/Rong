class CallByValueTest {
	// �Ű����� n�� ���޹޾� n�� ���� 1 �����Ͽ� ����ϴ� �޼ҵ带 ����
	public static void plus(int n) {
		n += 1;
	}

	public static void main(String[] args) {
		int n = 31;
		plus(n);
		System.out.println(n);
	}
}
