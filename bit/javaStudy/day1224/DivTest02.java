class DivTest02 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a / b;
			System.out.println("결과 : " + r);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("나누기 할 두 수를 입력해주세요.");
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력이 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가능합니다.");
		} 
	}
}
