abstract class Vehicle {
	abstract public double getKilosPerLiter();
	protected int speed;
	
	public void speedUp(int amount) {
		speed = speed + amount;
	}

	public void speedDown(int amount) {
		speed = speed - amount;
	}

	public void printSpeed() {
		System.out.println("���� �ü� : " + speed);
	}

	public void turnLeft() {
		System.out.println("��ȸ���� �մϴ�");		
	}

	public void turnRight() {
		System.out.println("��ȸ���� �մϴ�");		
	}
}

class Car extends Vehicle {
	private int seater;
	public Car(int seater) {
		this.seater = seater;
	}

	public double getKilosPerLiter() {
		return 10;
	}

	public String toString() {
		return "�� ���� " + seater + "�ν��̸�, ���� �ü��� " + speed + "km �Դϴ�";
	}
}

class VehicleTest {
	public static void main(String[] args) {
		Car c = new Car(4);
		System.out.println(c.getKilosPerLiter());
		c.printSpeed();

		c.speedUp(60);
		c.printSpeed();
		c.speedUp(40);
		c.printSpeed();
		System.out.println(c);
	}
}
