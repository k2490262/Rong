import java.util.Scanner;

class Iam {
	public static void main(String[] args) {
	String name;
	int age;

	Scanner sc = new Scanner(System.in);
	System.out.println("�̸�? ");
	name = sc.next();

	System.out.println("����? ");
	age = sc.nextInt();

	System.out.println("�̸��� " + name + "���̴� " + age + "��");
	}
}