import java.util.Scanner;

class StudentTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 5명 학생의 이름, 국어, 영어, 수학, 총점, 평균을 담기 위한 배열을 생성
		String name[] = new String[5];
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
		int tot[] = new int[5];
		double avg[] = new double[5];

		// 5명 학생의 이름, 국어, 수학, 영어를 입력받고 총점과 평균을 계산
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 ==> ");
			name[i] = scan.next();

			System.out.print((i + 1) + "번째 학생의 국어 점수를 입력하세요 ==> ");
			kor[i] = scan.nextInt();

			System.out.print((i + 1) + "번째 학생의 영어 점수를 입력하세요 ==> ");
			eng[i] = scan.nextInt();

			System.out.print((i + 1) + "번째 학생의 수학 점수를 입력하세요 ==> ");
			math[i] = scan.nextInt();

			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.0; // 실수를 얻기 위해
		}

		// 총점을 기준으로 성적순으로 정렬
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (tot[j] > tot[i]) {
					String tname = name[i];
					name[i] = name[j];
					name[j] = tname;

					int tmp = kor[i];
					kor[i] = kor[j];
					kor[j] = tmp;

					tmp = eng[i];
					eng[i] = eng[j];
					eng[j] = tmp;

					tmp = math[i];
					math[i] = math[j];
					math[j] = tmp;

					tmp = tot[i];
					tot[i] = tot[j];
					tot[j] = tmp;

					double tavg = avg[i];
					avg[i] = avg[j];
					avg[j] = tavg;
				}
			}
		}

		// 5명 학생의 정보를 출력
		System.out.println("*** 성적 결과 ***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < name.length; i++) {
			// System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i], tot[i], avg[i]);
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
	}
}
