class MethodTest02 {

	// �޼ҵ��� ����
	public static void sayHello(String ireum) {// �޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� (){}�� �;� �Ѵ�.
		for (int i = 1; i <= 3; i++) {
			System.out.println(ireum + "��(��), �ȳ�");
		}
	}

	public static void main(String[] args) {

		sayHello("����"); // �޼ҵ��� ȣ��ÿ� �޼ҵ��� ��ȣ �ȿ� �ִ� �� �μ���� ǥ���Ѵ�.

		System.out.println("������ ������Դϴ�.");

		sayHello("����");

		int year = 2019;
		System.out.println(year);

		sayHello("����");
	}
}