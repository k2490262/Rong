import java.util.Scanner;
import java.util.Random;

class GameTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rdm = new Random();

		int user, com;
		String userStr = "", comStr = "";

		com = rdm.nextInt(3);

		System.out.println("*** ����, ����, �� ���� ***");
		System.out.print("����[0], ����[1], ��[2] �߿� �����ϼ��� ==> ");
		user = scan.nextInt();

		if (user < 0 || user > 2) {
			System.out.println("�Է°��� Ȯ���ϼ���!");
			return;
		}

		switch(user) {
			case 0 : userStr = "����"; break;
			case 1 : userStr = "����"; break;
			case 2 : userStr = "��"; break;
		} System.out.println("����� " + userStr + "�� �½��ϴ�.");

		switch(com) {
			case 0 : comStr = "����"; break;
			case 1 : comStr = "����"; break;
			case 2 : comStr = "��"; break;
		} System.out.println("��ǻ�ʹ� " + comStr + "�� �½��ϴ�.");
		/*
		��ǻ�Ͱ� �̰����, ����ڰ� �̰����, ������ �Ǵ��Ͽ�
		���Ӱ���� ����ϵ��� ����� �߰��غ�����.
		*/

		if (user == com) {
			System.out.println("�����ϴ�=_=");
		} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("�̰���ϴ�*^^*");
		} else {
			System.out.println("�����ϴ٤Ф�");
		}
	}
}