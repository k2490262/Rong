import java.util.Scanner;
 
class Quiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a; // ���� ����
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
			"a) ����� b) ����� c) ��Ÿ�� d) �罺��",
			"a) ȫ�浿 b) �̿��� c) �̼��� d) ������",
			"a) 100 b) -1 c) 2 d) 50",
			"a) ��� b) ���� c) ���� d) ����",
			"a) ������ b) �ڱ��� c) �̸�� d) ����",
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
			a = scan.next();
				if (!a.equals("a") && !a.equals("b") && !a.equals("c") && !a.equals("d") && !a.equals("1") && !a.equals("2") && !a.equals("3") && !a.equals("4")) {
					System.out.println("�߸��� �Է��Դϴ�! �ٽ� �Է��ϼ���.");
					continue;
				}
				break;
			}

			if (answer[i].equals(a) || answer2[i].equals(a)) {
				cnt++;
			}
		}
		System.out.println();
		System.out.println("=== ����� ������ �����? ===");
		System.out.println("���� Ƚ�� : " + cnt + "��");
		System.out.println("���� Ƚ�� : " + (10 - cnt) + "��");
    }
}
