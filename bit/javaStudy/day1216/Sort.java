class Sort {
	public static void main(String[] args) {
		int []a = {1, 2, 3};
		sortArr(a);
	}

	public static void sortArr(int []a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
