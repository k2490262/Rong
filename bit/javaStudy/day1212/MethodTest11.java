// ������ ���� n�� �Ű������� ���޹޾� n�� ����� ��� ����ϴ� �޼ҵ�

class MethodTest11 {
	public static void printDivisor(int n) {
		System.out.println(n + "�� ����� ������ �����ϴ�.");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printDivisor(8);
		printDivisor(10);
	}
}
