// ������ �迭�� �Ű������� ���޹޾� �迭�� ���հ� ����� ���Ͽ� ����ϴ� �޼ҵ�

class MethodTest10 {
	public static void printSum(int []n) {
		int tot = 0;
		double avg = 0;
		for (int i = 0; i < n.length; i++) {
			tot += n[i]; // 				
		}
		avg = tot / (double)n.length;
		System.out.println("*** �迭�� ��� ���� ***");
		System.out.print("���� : " + tot);
		System.out.printf("��� : %.2f\n", avg);
	}

	public static void main(String[] args) {
		int []age = {28, 31, 20, 30, 18, 24, 25};
		int []kor = {100, 60, 70};
		printSum(age);
		printSum(kor);
	}
}
