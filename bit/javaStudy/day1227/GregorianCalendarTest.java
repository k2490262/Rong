/*
����ڷκ��� ������ �Է¹޾� �� �ذ� �������� �Ǻ��ϴ� ���α׷��� �ۼ�
*/

import java.util.Scanner;
import java.util.GregorianCalendar;

class GregorianCalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String year = "";
		int i = 1;
		while (i == 1) {
			System.out.print("������ �Է��ϼ��� ==> ");
			year = sc.next();
			if (!year.matches("[0-9]{4}")) {
				System.out.println("�ùٸ� �Է��� �������ּ���.");
				continue;
			} else {
				i++;
			}
		}

		/*
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� ����");
		} else {
			System.out.println(year + "���� ���");
		}
		*/
		
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(Integer.parseInt(year))) {
			System.out.println(year + "���� ����");
		} else {
			System.out.println(year + "���� ���");
		}
	}
}
