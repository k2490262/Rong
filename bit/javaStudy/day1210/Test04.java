import java.util.Scanner;

class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String t = "";

		System.out.print("���ڸ� �Է��ϼ��� ==> ");
		t = scan.next();

		if (t.length() >= 2) {
			System.out.print("�ѱ��ڸ� �Է����ּ���!");
			return;
		}

		switch (t) {
		case "A": case "E": case "I": case "O": case "U": 
		case "a": case "e": case "i": case "o": case "u": 
			System.out.print("�����Դϴ�!"); break;
		default :
			System.out.print("�����Դϴ�!");
		}
	}
}
