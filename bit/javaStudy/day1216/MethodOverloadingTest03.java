class MethodOverloadingTest03 {
	public static void main(String[] args) {
		MaxUtil mu = new MaxUtil();

		System.out.println(mu.max(2, 3));
		System.out.println(mu.max(2, 7, 3));
		System.out.println(mu.max(2.5, 2.7));

		int arr []= {4, 7, 10, 2, 3};
		System.out.println(mu.max(arr));

		double brr [] = {2.5, 8.0, 3.2, 9.7, 7.2};
		System.out.println(mu.max(brr));
	}
}

class MaxUtil {
	public int max(int a, int b) {
		int r = a;
		if (b > r) {
			r = b;
		}
		return r;
	}

	public int max(int a, int b, int c) {
		int r;
		r = max(max(a, b), c);
		return r;
	}

	public double max(double a, double b) {
		/*
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
		*/
		if (b > a) {
			a = b;
		}
		return a;
	}

	public int max(int []a) {
		int r = a[0];

		for (int i = 1; i < a.length; i++) {
			if (r < a[i]) {
				r = a[i];
			}
		}
		return r;
	}

	public double max(double []a) {
		double r = a[0];

		for (int i = 1; i < a.length; i++) {
			if (r < a[i]) {
				r = a[i];
			}
		}
	return r;
	}
}
