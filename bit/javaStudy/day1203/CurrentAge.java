import java.util.Scanner;
import java.util.Date;

class CurrentAge {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("��� ������ �Է��ϼ���.");
	int birthYear;
		birthYear = sc.nextInt();

	Date today = new Date();
	int thisYear = today.getYear() + 1900;
	
	System.out.println("����� ���̴� " + (thisYear - birthYear) + "�� �Դϴ�.");
	}
}