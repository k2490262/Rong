class DivTest02 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a / b;
			System.out.println("��� : " + r);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� �� ���� �Է����ּ���.");
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������� �Ұ����մϴ�.");
		} 
	}
}
