import java.util.Scanner;

class SentenceTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String stc = sc.nextLine();

		String[] arr = stc.split(" ");
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (stc.equals(arr[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
