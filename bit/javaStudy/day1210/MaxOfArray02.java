// ���� ū ���� ��ġ�� index�� ���Ͽ� ����غ�����.

import java.util.ArrayList;

class MaxOfArray02 {
	public static void main(String[] args) {
		int []a = {10, 31, 100, 11, 100};
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		ArrayList<Integer> position = new ArrayList<Integer>(); // ���� �迭
		for (int i = 0; i < a.length; i++) {
			if (max == a[i]) {
				position.add(i);
			}
		}
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ū ���� �ִ� �ڸ� : " + position);
	}
}
