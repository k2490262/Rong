class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ", " + age + "��";
	}
}

class EqualsTest {
	public static void main(String[] args) {
		Person p1 = new Person("�ֿ���", 20);
		Person p2 = new Person("�ֿ���", 20);

		System.out.println(p1);
		System.out.println(p2);

		if (p1 == p2) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("�޶� �Ф�");
		}
	}
}
