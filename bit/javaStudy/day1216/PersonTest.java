class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
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
}