class Person {
	private String name;
	private int age;
	public String toString() {
		return name + ", " + age;
	}
	public Person() {
		/*
		name = "ȫ�浿";
		age = 20;
		*/
		this("ȫ�浿", 20);
		// System.out.println("������ ����");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class PersonTest {
	public static void main(String[] args) {
	Person p1 = new Person("�̼���", 28);
	System.out.println(p1);

	Person p2 = new Person();
	System.out.println(p2);
	}
}