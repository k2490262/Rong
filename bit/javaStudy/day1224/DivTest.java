// 프로그램 실행 시에 두개의 정수를 전달받아 나누기 한 결과를 출력하는 pg
// java DivTest 4 2
// 결과 : 2

class DivTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int r = a / b;
		System.out.println("결과 : " + r);
	}
}
