class MultiArrayTest02 {
	public static void main(String[] args) {
		int [][][]a = new int[2][4][3];
		//					  �� �� ��
		// 3ĭ¥���� 4�� �ְ� �׷� ���� 2�� �־��!

		/*
		ù��° �忡�� ��� 0�� �����ϰ�
		�ι�° �忡�� ��� 1�� ������ �� ���
		*/

		for (int i = 0; i < a.length; i++) { // ��
			for (int j = 0; j < a[i].length; j++) { // ��
				for (int k = 0; k < a[i][j].length; k++) { // ��
					a[i][j][k] = i;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
