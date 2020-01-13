import java.util.Scanner;

class CorrectJuminTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(������ ����!) ==> ");
		jumin = sc.next();
		System.out.println("�Է��� �ֹι�ȣ�� : " + jumin + "�Դϴ�.");

//	920404-2345678
//	�� = 11-{(2����+3����+4����+5����+6����+7����+8����+9����+2����+3����+4����+5����) mod 11}

		int[] arr = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		if (jumin.length() != 14) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�� �ƴմϴ�.");
			return;
		}

		if (jumin.charAt(6) != '-') {
			System.out.println("������(-)�� �Է����ּ���.");
			return;
		}

		int tot = 0;
		for (int i = 0; i < jumin.length() - 1; i++) {
			if (i == 6) {
				continue;
			}
			tot = tot + Integer.parseInt (jumin.charAt(i) + "") * arr[i];
		}
		tot = tot % 11;
		tot = 11 - tot;

		if (tot == 10) {
			tot = 0;
		}
		if (tot == 11) {
			tot = 1;
		}

		int check = Integer.parseInt(jumin.charAt(13) + "");
		if (tot == check) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�� �ƴմϴ�.");
		}
	}
}
