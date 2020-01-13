abstract class Book {
	protected int number;
	protected String title;
	protected String author;
	abstract public int getLateFees(int day);

	public Book(int number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public boolean equals(Object obj) {
		Book b = (Book)obj;
		if (number == b.number) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "\n������ȣ : " + number + "\n���� : " + title + "\n���� : " + author + "\n";
	}
}

class Novel extends Book {
	public Novel(int number, String title, String author) {
		super(number, title, author);
	}

	public int getLateFees(int day) {
		return day * 300;
	}

/*
	public String toString() {
		return super.toString() + ", ��ü�� : ";
	}
*/
}

class Poet extends Book {
	public Poet(int number, String title, String author) {
		super(number, title, author);
	}

	public int getLateFees(int day) {
		return day * 200;
	}

/*
	public String toString() {
		return super.toString() + ", ��ü�� : ";
	}
*/
}

class ScienceFiction extends Book {
	public ScienceFiction(int number, String title, String author) {
		super(number, title, author);
	}

	public int getLateFees(int day) {
		return day * 600;
	}

/*
	public String toString() {
		return super.toString() + ", ��ü�� : ";
	}
*/
}

class BookTest {
	public static void main(String[] args) {
		Novel n1 = new Novel(1000, "���̾�", "�츣�� �켼");
		Poet p1 = new Poet(2000, "���� ���� �ʸ� ����", "������");
		ScienceFiction s1 = new ScienceFiction(3000, "��", "�׵� â");

		System.out.println(n1 + "��ü�� : " + n1.getLateFees(2));
		System.out.println(p1 + "��ü�� : " + p1.getLateFees(2));

		Poet p2 = new Poet(2000, "���� ���� �ʸ� ����", "������");
		if (p1.equals(p2)) {
			System.out.println("\n������ å�� �뿩�� �Ұ��մϴ�.");
		}
		else {
			System.out.println("\n�뿩�� �����մϴ�.");
		}
	}
}
