// ���ο� �ڷ����� ���� ��
class Person {
	String name;
	int age;
}

class CallByReferenceTest02 {
	// Ŭ���� Person�� �Ű������� ���޹޾� ���̸� 1 �����ϴ� �޼ҵ带 ����
	public static void plus(Person p) {
		p.age += 1;
	}

	public static void main(String[] args) {
		Person suin/*suin = ��ü��������*/ = new Person();
		suin.name = "�̼���";
		suin.age = 20;
		plus(suin);
		System.out.println(suin.name);
		System.out.println(suin.age);
	}
}
