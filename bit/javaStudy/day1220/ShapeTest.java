abstract class Shape {
	protected int x;
	protected int y;
	protected double area;

	public abstract void calcArea();
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "\n도형의 위치 : (" + x + ", " + y + ")\n도형의 면적 : " + area;
	}
}

class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void drawRectangle() {
		System.out.println(toString());
   }

	public void calcArea() {
		area = width * height;
	}

	public String toString() {
		return "< 사각형 >" + super.toString() + "\n가로의 길이 : " + width + "\n세로의 길이 : " + height + "\n";
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

	public void drawTriangle() {
		System.out.println(toString());
	}

	public void calcArea() {
		area = width * height * 0.5;
	}

	public String toString() {
		return "< 삼각형 >" + super.toString() + "\n가로의 길이 : " + width + "\n세로의 길이 : " + height + "\n";
	}
}

class Circle extends Shape {
	private double radius;
	// public static final double PI = 3.141592;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public void drawCircle() {
		System.out.println(toString());
	}

	public void calcArea() {
		area = radius * radius * Math.PI;
	}

	public String toString() {
		return "< 원 >" + super.toString() + "\n반지름의 길이 : " + radius + "\n";
	}
}

class ShapeTest {
	public static void main(String[] args) {
		Shape[] arr = new Shape[3];
		// Drawable[] arr = new Drawable[3];
		arr[0] = new Rectangle(10, 10,	100, 200);
		arr[1] = new Triangle(20, 20, 200, 400);
		arr[2] = new Circle(10, 220, 50);

		for (int i = 0; i < arr.length; i++) {
			arr[i].calcArea();
			if (arr[i] instanceof Rectangle) {
				((Rectangle)arr[i]).drawRectangle();
			} else if (arr[i] instanceof Triangle) {
				((Triangle)arr[i]).drawTriangle();
			} else if (arr[i] instanceof Circle) {
				((Circle)arr[i]).drawCircle();
			}
		}
	}
}
