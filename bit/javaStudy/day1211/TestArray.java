import java.util.Scanner;

class TestArray{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 10���� ������ ������ �� �ִ� �迭�� �����ϰ� �����϶�
		int []arr = new int[10];

		// ����ڷκ��� ������ �޾Ƽ� �迭�� �����ϴ� �ݺ� ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է��ϼ��� ==> ");
			arr[i] = scan.nextInt();
		}

		// �迭�� ����� ������ ����ϴ� �ݺ� ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
