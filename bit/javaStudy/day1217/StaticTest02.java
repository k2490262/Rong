class Family {
	public String name;
	public int age;
	public static String addr; // ��ü���� �������� ����ϴ� ������

	public Family(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println(name + ", " + age + ", " + addr);
	}

	public static void move() {
		System.out.println("�ƾ� ������� ���� ���� ���� �̻縦 ���ϴ�.");
		addr = "����� ������ �ż���"; // ����
		name = "ȫ�浿"; // �Ұ���
		age = 50; // �Ұ���
	}
}

class StaticTest02 {
	public static void main(String[] args) {
		Family.move();
		/*
		Family.addr = "����� ���빮�� ȫ����";
		Family f1 = new Family("�̼���", 20);
		Family f2 = new Family("�̿���", 23);
		f1.info();
		f2.info();
		*/
	}
}