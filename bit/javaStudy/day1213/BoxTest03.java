class Box {
	private double width;
	private double length;
	private double height;
	private double volume;

	public Box() { // 생성자는 객체 생성시 자동 수행, 리턴이 없음.
		width = 10;
		length = 5;
		height = 4;

		System.out.println("생성자 자동 동작!");
	}

/* 생성자의 중복
	매개변수의 자료형이 다르거나 매개변수의 개수가 달라야 생성이 가능 */
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		/*System.out.println(width * length * height);*/
		volume = width * length * height;
	}
}

class BoxTest03 {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20, 30, 5);
		/* b1.setWidth(10);
		b1.setLength(5);
		b1.setHeight(2); */
		b1.calcVolume();
		System.out.println("** 첫번째 박스의 정보 **");
		System.out.println("가로 : " + b1.getWidth());
		System.out.println("세로 : " + b1.getLength());
		System.out.println("높이 : " + b1.getHeight());
		System.out.println("부피 : " + b1.getVolume());

		b2.calcVolume();
		System.out.println("** 두번째 박스의 정보 **");
		System.out.println("가로 : " + b2.getWidth());
		System.out.println("세로 : " + b2.getLength());
		System.out.println("높이 : " + b2.getHeight());
		System.out.println("부피 : " + b2.getVolume());
	}
}
