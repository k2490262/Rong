// ArraysŬ������ �޼ҵ带 �̿��Ͽ� �� �迭�� ���� ���� ������� �Ǻ��ϵ��� �϶�.

import java.util.Arrays;

class ArraysTest03 {
	public static void main(String[] args) {
		int[] a = {100, 200, 300};
		int[] b = {100, 200, 300};

		if (Arrays.equals(a, b)) {
			System.out.println("�� �迭�� �����ϴ�.");
		} else {
			System.out.println("�� �迭�� �ٸ��ϴ�.");
		}
	}
}
