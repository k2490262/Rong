/*
사용자한테 주민번호를 입력받아 성별을 파악하는 프로그램을 작성
*/

import java.util.Scanner;

class CheckSex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.");
		String jm = sc.next();
//		int jm = sc.nextInt();
		
		int idx = Integer.parseInt(jm.charAt(7) + "");
		if (idx == 1 || idx == 3) {
			System.out.println("남자");
		} else if (idx == 2 || idx == 4) {
			System.out.println("여자");
		}
	}
}
