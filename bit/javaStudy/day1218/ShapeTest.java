abstract class Shape {
	protected int x;
	protected int y;
	protected double area;
	abstract public void calcArea();

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "������ ��ġ : (" + x + ", " + y + ") ������ ���� : " + area;
	}
}

class Rect extends Shape {
	private double width;
	private double height;

	public Rect(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void calcArea() {
		area = width * height;
	}

	public String toString() {
		return "�簢�� = " + super.toString() + " ������ ���� : " + width + " ������ ���� : " + height;
	}
}

class Circle extends Shape {
	private double radius;
	public Circle(int x, int y, double radius) {
		super(x, y); // super Ű����� �θ�κ��� ���� �����޶�� �ǹ��̱� ������ ù ���忡 �;� ��
		this.radius = radius;
	}

	public void calcArea() {
		area = radius * radius * Math.PI;
	}

	public String toString() {
		return "�� = " + super.toString() + " �������� ���� : " + radius;
	}
}

class Triangle extends Shape {
	private double width;
	private double height;

	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void calcArea() {
		area = width * height * 0.5;
	}

	public String toString() {
		return "�ﰢ�� = " + super.toString() + " ������ ���� : " + width + " ������ ���� : " + height;
	}
}

class ShapeTest {
	public static void main(String[] args) {
		Rect r = new Rect(20, 10, 10.5, 20.5);
		r.calcArea();
		System.out.println(r);

		Circle c = new Circle(20, 10, 10.5);
		c.calcArea();
		System.out.println(c);

		Triangle t = new Triangle(20, 10, 10.5, 20.5);
		t.calcArea();
		System.out.println(t);
	}
}
