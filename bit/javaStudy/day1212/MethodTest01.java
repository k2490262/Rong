class MethodTest01 {

	// �޼ҵ��� ����
	public static void sayHello() {// �޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� (){}�� �;� �Ѵ�.
		for (int i = 1; i <= 3; i++) {
			System.out.println("������, �ȳ�");
		}
	}

	public static void main(String[] args) {

		sayHello(); // �޼ҵ��� ȣ��

		System.out.println("������ ������Դϴ�.");

		sayHello();

		int year = 2019;
		System.out.println(year);

		sayHello();
	}
}
