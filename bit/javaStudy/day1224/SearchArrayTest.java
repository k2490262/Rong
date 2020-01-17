class NotFoundException extends Exception {
	public NotFoundException(String msg) {
		super(msg);
	}
}

class SearchArray {
	public static int search(int[] arr, int value) throws NotFoundException {
		int idx = -1; // �迭�� index�� �ش��ϴ� ���� ���ٰ� ǥ���� ���� ���� -1�� ���� ����Ѵ�.

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			throw new NotFoundException("ã���� �ϴ� ��Ұ� �迭���� Ȯ�ε��� �ʽ��ϴ�.");
		}
		return idx;
	}
}

class SearchArrayTest {
	public static void main(String[] args) {
		try {
		int[] a = {16, 18, 29, 33, 36, 39};
		// int n = SearchArray.search(a, 33);
		int n = SearchArray.search(a, 2);
		System.out.println(n + "��°�� �ֽ��ϴ�.");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
