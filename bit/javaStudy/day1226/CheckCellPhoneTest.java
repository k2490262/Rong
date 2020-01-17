import java.util.Scanner;

class CheckCellPhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ �Է� ==> ");
		String phone = sc.next();

		String[] arr = phone.split("-");
		if (arr.length != 3) {
			System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�.");
			return;
		}
		if (arr[0].length() != 3 || arr[1].length() != 4 || arr[2].length() != 4) {
			System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�.");
			return;
		}

		try {
			for (String str : arr) {
				Integer.parseInt(str);
			}
			System.out.println("�ùٸ� ��ȭ��ȣ �����Դϴ�.");
		} catch (Exception e) {
			System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�.");
			return;
		}
	}
}
