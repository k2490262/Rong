// ������ �迭�� �Ű������� ���޹޾� �迭�� ��Ҹ� ��� ����ϴ� �޼ҵ带 ����

class MethodTest08{
	public static void printArr(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []age = {28, 31, 20, 30, 18, 24, 25};
		printArr(age);

		int []kor = {100, 60, 70};
		printArr(kor);
	}
}
