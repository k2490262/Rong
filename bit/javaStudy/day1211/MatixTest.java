/*
5�� 5���� 2���� �迭�� �����,
�� �迭�� ��ҿ� 1���� 1�� ������ ���� ���ʷ� ������ �� ���
*/

class MatixTest {
	public static void main(String[] args) {
		int [][]a = new int[5][5];
		int n = 1;

		for (int i = 0; i < a.length /* ���� ���� �˷��� */; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = n++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
