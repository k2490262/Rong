class PersonTest02 {
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", 20);
		p.info();
	}
}

class Person {
	private String name;
	private int age;
	
	public void info(){
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}
}