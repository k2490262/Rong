// ������ �迭�� �Ű������� ���޹޾� �迭�� ��Ҹ� ��� ����ϴ� �޼ҵ带 ����

class MethodTest06{
	public static void printArray(int []k) {
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []arr = {100, 200, 300, 400, 500};
		printArray(arr);
	}
}