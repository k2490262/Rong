class Person {
	public void sayHalo() {
		System.out.println("�ҷ�!");
	}
}

class Student extends Person {
	public void sayHalo() {
		System.out.println("�� ������?");
	}
}

class FinalTest02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.sayHalo();
	}
}
