class Student {
	protected String name;
	protected int id;
	protected String department;
	protected int grade;
	protected int credit;

	public Student(String name, int id, String department, int grade, int credit) {
		this.name = name;
		this.id = id;
		this.credit = credit;
		this.department = department;
		this.grade = grade;
	}

	public String toString() {
		String r = "";
		r = r + "�̸� : " + name + "\n";
		r = r + "�й� : " + id + "\n";
		r = r + "�а� : " + department + "\n";
		r = r + "�г� : " + grade + "\n";
		r = r + "���� : " + credit + "\n";
		return r;
	}
}

class UnderGraduate extends Student {
	private String crew;

	public UnderGraduate(String name, int id, String department, int grade, int credit, String crew) {
		super(name, id, department, grade, credit);
		this.crew = crew;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String toString() {
		String r = "";
		r = r + super.toString();
		r = r + "���Ƹ� : " + crew;
		return r;
	}
}

class Graduate extends Student {
	private	String type;
	private double rate;

	public Graduate(String name, int id, String department, int grade, int credit, String type, double rate) {
		super(name, id, department, grade, credit);
		this.type = type;
		this.rate = rate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String toString() {
		String r = "\n";
		r = r + super.toString();
		r = r + "�������� : " + type + "\n";
		r = r + "���б� ���� : " + rate;
		return r;
	}
}

class Test {
	public static void main(String[] args) {
		UnderGraduate a = new UnderGraduate("���ߵ���", 201019111, "��ǻ�� ����", 1, 0, "����");

		Graduate b = new Graduate("������", 200019112, "�ΰ�����(AI)", 5, 140, "����", 0.5);

		System.out.println(a);
		System.out.println(b);
	}
}