class CallByReferenceTest01 {
	// ������ �迭�� �Ű������� ���޹޾� �迭�� ��Ҹ� ��� 1�� �����ϴ� �޼ҵ�
	public static void plus(int []a) {
		for (int i = 0; i < a.length; i++) {
			a[i] += 1;
		}
	}

	public static void main(String[] args) {
		int []arr = {10, 20, 30};
		plus(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
