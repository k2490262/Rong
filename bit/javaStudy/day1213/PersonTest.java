/*
��� Person
	�Ӽ�
		�̸�	String name;	"�̼���"
		����	String gender;	"����"
		����	int age;	20

	����
		�Դ´�	void eat(String food)
		�ܴ�	void sleep()
*/

class Person {
	String name;
	String gender;
	int age;

	void eat(String food) {
		System.out.println("������ " + gender + "�̰�, ���̰� " + age + "���� " + name + "��(��) " + food + "��(��) �Ծ��.");
	}

	void sleep() {
		System.out.println(name + "��(��) ���� �ڿ�.");
	}
}

class PersonTest {
	public static void main(String[] args) {
		Person p/*p = ��ü��������*/ = new Person();
		p./*. = �������������*/name = "�ֿ���";
		p.age = 28;
		p.gender = "����";
		p.eat("����");
		p.sleep();
	}
}
