class RectangleTest {
	public static void main(String[] args) {
		Rectangle r;					// �����ڷ��� ����(Ŭ������ ����)
										// ���� �ڽ��� "��"�� ������ ����
										// "��"�� �ִ� �޸� ���� �ּҸ� ����

										// Ŭ������ ������ ��ü�� �����ϰ�
										// �� ��ü�� ���ؼ� ����� �� ����

		r = new Rectangle();			// ��ü�� ������
										// Rectangle�� �ڷ����� ������ �� �ִ� ����
										// r�� Rectangle�� ��ü�� �����ϰ�
										// ������ �� ��ü�� �޸� ���� �ּҸ� ������

										// ��, Rectangle�� �ڷ����� ������ �� �ִ�
										// ���� r�� Rectangle�� ��ü�� �����ϰ�
										// ������ �� ��ü�� �ּҸ� ������

										// r.width = 20; ���ٺҰ�
										// setter�� ���ؼ� �����ؾ� ��

		int n;							// �⺻�ڷ��� ����
										// ���� �ڽ��� "��"�� ����
		n = 29;

		// r.setWidth(20);
		// r.setLength(10);
		System.out.println("�簢���� ���� : " + r.calcArea());

		r.setWidth(40);
		System.out.println("�簢���� ���� : " + r.calcArea());

		Rectangle r2 = new Rectangle(5, 7);
		System.out.println("r2�� ���� : " + r2.calcArea());

		Rectangle r3 = new Rectangle(10);
		System.out.println("r3�� ���� : " + r3.calcArea());

		Rectangle r4 = new Rectangle(10.8);
		System.out.println("r4�� ���� : " + r4.calcArea());
	}
}

class Rectangle {
	private int width;
	private int length;

	public Rectangle() {
		width = 10;
		length = 20;
	}
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(int width) {
		this.width = width;
		length = 2;
	}
	public Rectangle(double width) {
		this.width = (int) width;
		length = 2;
	}
/*
	public Rectangle(int length) {
		this.length = length;
		width = 2;
	}
	��� �Ұ�!
*/

	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}

	public int calcArea() { // �޼ҵ�
		return width * length;
	}
}
