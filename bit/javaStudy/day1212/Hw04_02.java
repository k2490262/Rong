import java.util.Scanner;

class Hw04_02 {
	public static boolean isPassed(String []answer, String []a){
		boolean r = false;
		int cnt = correctAnswers(answer, a);
		if (cnt >= 7) {
			r = true;
		}
		return r;
	}

	public static int correctAnswers(String []answer, String []a) {
		int n = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i].equals(a[i])) {
				n += 1;
			}
		}
		return n;
	}

	public static int incorrectAnswers(String []answer, String []a) {
		int n = 0;
		n = answer.length - correctAnswers(answer, a);
		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a[] = new String[10]; // 정답 저장
		int cnt = 0;
		System.out.println("*** 문제를 풀어봅시다! ***");
		System.out.println();

		String []quiz = {
			"문제 1) 캐나다의 수도는?",
			"문제 2) 이수인의 짝은?",
			"문제 3) 1 + 1 = ?",
			"문제 4) 한국의 수도는?",
			"문제 5) 현재 우리나라 대통령은?",
			"문제 6) 올해는 몇년도인가요?",
			"문제 7) 우리는 언제 수료해요?",
			"문제 8) 현민아의 짝은?",
			"문제 9) 우리 강의장은?",
			"문제 10) 우리 교육기관의 이름은?"};

		String []ex = {
			"a) 벤쿠버 b) 토론토 c) 오타와 d) 재스퍼",
			"a) 홍길동 b) 이원우 c) 이순신 d) 유관순",
			"a) 100 b) -1 c) 2 d) 50",
			"a) 울산 b) 대전 c) 광주 d) 서울",
			"a) 문재인 b) 박근혜 c) 이명박 d) 조국",
			"a) 2020 b) 2019 c) 2018 d) 1991",
			"a) 2020/05/03 b) 2019/12/31 c) 2020/06/03 d) 2019/12/11",
			"a) 홍길동 b) 유관순 c) 이순신 d) 최영수",
			"a) 4강의장 b) 3강의장 c) 2강의장 d) 1강의장",
			"a) 한빛교육센터 b) 비트캠프 c) 비트코인 d) 비트박스"};

		String []answer = { "a", "b", "c", "d", "a",
						"b", "c", "d", "a", "b"};

		String []answer2 = { "1", "2", "3", "4", "1",
						"2", "3", "4", "1", "2"};

		for (int i = 0; i < 10 ; i++) {
			System.out.println(quiz[i]);
			System.out.println(ex[i]);

			while (true) {
			System.out.println((i + 1) + "번의 문제의 정답을 입력하세요 : ");
			a[i] = scan.next();
				if (!a[i].equals("a") && !a[i].equals("b") && !a[i].equals("c") && !a[i].equals("d") && !a[i].equals("1") && !a[i].equals("2") && !a[i].equals("3") && !a[i].equals("4")) {
				System.out.println("잘못된 입력입니다! 다시 입력하세요.");
				continue;
				}
				break;
			}
		}
		cnt = correctAnswers(answer, a);
		int inCorrect = incorrectAnswers(answer, a);
		System.out.println("정답수 : " + cnt);
		System.out.println("오답수 : " + inCorrect);

		if (isPassed(answer, a)) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
	}
}
