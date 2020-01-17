import java.util.Scanner;

class Hw04_02 {
	public static boolean isPassed(String []answer, String []a){
		boolean r = false;
		int cnt = correctAnswers(answer, a);
		if (cnt >= 7) {
			r = true;
		}
		return r;
	}

	public static int correctAnswers(String []answer, String []a) {
		int n = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i].equals(a[i])) {
				n += 1;
			}
		}
		return n;
	}

	public static int incorrectAnswers(String []answer, String []a) {
		int n = 0;
		n = answer.length - correctAnswers(answer, a);
		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a[] = new String[10]; // ���� ����
		int cnt = 0;
		System.out.println("*** ������ Ǯ��ô�! ***");
		System.out.println();

		String []quiz = {
			"���� 1) ĳ������ ������?",
			"���� 2) �̼����� ¦��?",
			"���� 3) 1 + 1 = ?",
			"���� 4) �ѱ��� ������?",
			"���� 5) ���� �츮���� �������?",
			"���� 6) ���ش� ��⵵�ΰ���?",
			"���� 7) �츮�� ���� �����ؿ�?",
			"���� 8) ���ξ��� ¦��?",
			"���� 9) �츮 ��������?",
			"���� 10) �츮 ��������� �̸���?"};

		String []ex = {
			"a) ������ b) ����� c) ��Ÿ�� d) �罺��",
			"a) ȫ�浿 b) �̿��� c) �̼��� d) ������",
			"a) 100 b) -1 c) 2 d) 50",
			"a) ��� b) ���� c) ���� d) ����",
			"a) ������ b) �ڱ��� c) �̸��� d) ����",
			"a) 2020 b) 2019 c) 2018 d) 1991",
			"a) 2020/05/03 b) 2019/12/31 c) 2020/06/03 d) 2019/12/11",
			"a) ȫ�浿 b) ������ c) �̼��� d) �ֿ���",
			"a) 4������ b) 3������ c) 2������ d) 1������",
			"a) �Ѻ��������� b) ��Ʈķ�� c) ��Ʈ���� d) ��Ʈ�ڽ�"};

		String []answer = { "a", "b", "c", "d", "a",
						"b", "c", "d", "a", "b"};

		String []answer2 = { "1", "2", "3", "4", "1",
						"2", "3", "4", "1", "2"};

		for (int i = 0; i < 10 ; i++) {
			System.out.println(quiz[i]);
			System.out.println(ex[i]);

			while (true) {
			System.out.println((i + 1) + "���� ������ ������ �Է��ϼ��� : ");
			a[i] = scan.next();
				if (!a[i].equals("a") && !a[i].equals("b") && !a[i].equals("c") && !a[i].equals("d") && !a[i].equals("1") && !a[i].equals("2") && !a[i].equals("3") && !a[i].equals("4")) {
				System.out.println("�߸��� �Է��Դϴ�! �ٽ� �Է��ϼ���.");
				continue;
				}
				break;
			}
		}
		cnt = correctAnswers(answer, a);
		int inCorrect = incorrectAnswers(answer, a);
		System.out.println("����� : " + cnt);
		System.out.println("����� : " + inCorrect);

		if (isPassed(answer, a)) {
			System.out.println("�հ�!");
		} else {
			System.out.println("���հ�!");
		}
	}
}