class MethodTest03 {

	// �޼ҵ��� ����
	public static void sayHello(String ireum, int n // �Ű� ����) {// �޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� (){}�� �;� �Ѵ�.
		for (int i = 1; i <= n; i++) {
			System.out.println(ireum + "��(��), �ȳ�");
		}
	}

	public static void main(String[] args) {

		sayHello("����", 2); // �޼ҵ��� ȣ��ÿ� �޼ҵ��� ��ȣ �ȿ� �ִ� �� �μ���� ǥ���Ѵ�.

		System.out.println("������ ������Դϴ�.");

		sayHello("����", 10);

		int year = 2019;
		System.out.println(year);

		sayHello("����", 5);
	}
}
