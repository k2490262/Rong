/*
사용자로부터 전화번호를 입력받아 올바른 전화번호 형식인지 판별하는 프로그램을 작성

010-0000-0000

1) 하이픈 2개를 포함하여 13자리 문자
2) 첫번째 하이픈 전에는 3자리
3) 첫번째 하이픈과 두번째 하이픈 사이에는 4자리
4) 두번째 하이픈 뒤에는 4자리
*/

import java.util.Scanner;

class CheckPhoneNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 전화번호 판별 프로그램 ***");
		System.out.print("전화번호를 입력해주세요 ==> ");
		String n = sc.next();

		int n1 = n.indexOf("-");
		int n2 = n.lastIndexOf("-");
		if (n1 != 3 || n2 != 8 || n.length() != 13) {
			System.out.println("전봐번호를 다시 확인 해주세요.");
			return;
		}

		for (int i = 0; i < n.length(); i++) {
			if (i != 3 && i != 8) {
				char ch = n.charAt(i);
				if (ch < '0' || ch > '9') {
					System.out.println("올바른 전화번호 형식이 아닙니다.");
					return;
				}
			}
		}
		System.out.println("올바른 전화번호 형식입니다.");
	}
}
