abstract class Bird {
	public abstract void sound();
}

class Dove extends Bird {
	public void sound() {
		System.out.println("coo coo");
	}
}

class BirdTest {
	public static void main(String[] args) {
		/*
		Bird b = new Bird();
		Bird b = new Dove();
		b.sound();

		Bird[] b = new Bird[5]; ��ü ���������� 5�� ����� ����
		Bird a = new Bird();	��ü ��ü�� �����ϴ� ����
		*/
	}
}
