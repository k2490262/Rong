class MethodTest12 {
	public static void printArr(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	System.out.print("\b\b ");
	System.out.println();
	}

	public static void sortArr(int []b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[j] < b[i]) {
					int tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int []a = {8, 5, 2, 9, 3};
		printArr(a); // ������ �迭�� �Ű������� ���޹޾� ��� ����ϴ� �޼ҵ�
		sortArr(a); // ������ �迭�� �Ű������� ���޹޾� �������� ���� �޼ҵ�
		printArr(a);
	}
}
