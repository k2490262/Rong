import java.util.Scanner;

class StringReverseTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력 ==> ");
		str = sc.nextLine();

//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//		}

		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
		System.out.print(sb);
	}
}
