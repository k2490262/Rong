class DivTest03 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a / b;
			System.out.println("��� : " + r);
		} catch (Exception e) {
			System.out.println("������ �� �� ������ Ȯ�����ּ���.");
		}
	}
}
