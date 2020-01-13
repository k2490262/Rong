class PlaneTest {
	public static void main(String[] args) {
		System.out.println("����� ��� : " + Plane.getPlanes());

		Plane p1 = new Plane();
		Plane p2 = new Plane("Air Bus", "A380", 500);

        System.out.println("����� ��� : " + Plane.getPlanes());
        System.out.println("Ŭ�����ɹ��� ��ü�� ���ؼ��� ���ٰ���!");
        System.out.println("p1�� ���ؼ� Ȯ�� : " + p1.getPlanes());
        System.out.println("p2�� ���ؼ� Ȯ�� : " + p2.getPlanes());

		System.out.println(p1.getCompany());
		System.out.println(p1.getModel());
		System.out.println(p1.getSeats());

		p1.setCompany("����");
		p1.setModel("����747");
		p1.setSeats(200);

		System.out.println(p1);
		System.out.println(p2);
	}
}

class Plane {
	private String company;
	private String model;
	private int seats;

	public static int planes;
	public static int getPlanes() {
		return planes;
	}

	public Plane() {
		planes = planes + 1; // planes++�ε� ����!
	}

	public Plane(String company, String model, int seats) {
		this.company = company;
		this.model = model;
		this.seats = seats;
		planes = planes + 1; // planes++�ε� ����!
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String toString() {
		return "���ۻ� : " + company + ", �� : " + model +
		", �ִ� �°��� : " + seats + "]";
	}
}
