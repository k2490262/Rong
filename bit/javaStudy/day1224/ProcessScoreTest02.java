class IllegalScoreException extends Exception {
	public IllegalScoreException(String msg) {
		super(msg);
	}
}

class ProcessScore {
	public ProcessScore(int[] score) throws IllegalScoreException {
		int tot = 0;
		for (int s : score) {
			if (s < 0) {
				throw new IllegalScoreException("������ ������ ���ԵǾ� �ֽ��ϴ�.");
			}
			tot += s;
		}
		int avg = tot / score.length;
		System.out.println("��� ������ : " + avg);
	}
}

class ProcessScoreTest02 {
	public static void main(String[] args) {
		try {
		int[] arr = {80, 90, 90, 100, 70};
		// ProcessScore ps = new ProcessScore(arr);
		new ProcessScore(arr);
		} catch (IllegalScoreException e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
	}
}
