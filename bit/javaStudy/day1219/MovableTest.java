interface Movable {
	public void speedUp(int mount);
	public void speedDown(int mount);
}

class Car implements Movable {
	private String fuel;
	private double distance;
	private String company;
	private String color;
	private String name;
	int speed = 100;

	public Car(String fuel, String company, String color, String name) {
		this.fuel = fuel;
		this.company = company;
		this.color = color;
		this.name = name;
	}

	public void speedUp(int amount) {
		System.out.println(amount + "만큼 속도증가");
		speed += amount;
		System.out.println("시속 " + speed + "km로 주행합니다.");
	}

	public void speedDown(int amount) {
		System.out.println(amount + "만큼 속도감소");
		speed -= amount;
		System.out.println("시속 " + speed + "km로 주행합니다.");
	}

	public void turnLeft() {
		System.out.println("좌회전");
	}

	public void turnRight() {
		System.out.println("우회전");
	}

	public String toString() {
		return fuel + ", " + company + ", " + color + ", " + name;
	}
}

class MovableTest {
	public static void main(String[] args) {
		Car c = new Car("하이브리드", "현대", "빨강", "그랜져");
		System.out.println(c);
		c.speedUp(20);
		c.speedDown(50);
		c.turnLeft();
	}
}
