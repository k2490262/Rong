// ����) ��������� ������ ���� n�� �Է¹޾� �� ���� 0�� ������ ����̸�
//			�� ���� 100�� ���� ���� ����ϰ� "�۾�����"�� ����մϴ�.
//			�׷��� �ʴٸ� �� ���� ������ ����ϰ� "�۾�����"�� ����մϴ�.

// << ���� �� >>
// ������ �Է��ϼ��� ==> 5
// 105
// �۾�����

// ������ �Է��ϼ��� ==> -5
// 25
// �۾�����

import java.util.Scanner;

class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int n = scan.nextInt();

		if (n >= 0)
			System.out.print((n + 100) + "\n�۾�����");
		else
			System.out.print((n * n) + "\n�۾�����");
	}
}
