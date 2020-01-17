import java.util.Scanner;

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

class BookTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book[] arr = new Book[5]; // ��������[]
		arr[0] = new Novel(1000, "���ξ� ����", "�̿���");
		arr[1] = new Novel(1001, "����ִ� �ڹ�", "������");
		arr[2] = new Novel(1002, "��ſ� �ڹ�", "���ַ�");
		arr[3] = new Poet(2000, "��ſ� �λ�", "�̿���");
		arr[4] = new ScienceFiction(3000, "�ڹ��� �̷�", "������");

		System.out.print("ã�� ������ ������ȣ�� �Է��ϼ��� ==>");
		int searchNumer = sc.nextInt();

		int i;
		// for (Book b : arr) {}
		for (i = 0 ; i < arr.length; i++) {
			if (searchNumer == arr[i].getNumber()) {
				System.out.println("������ ã�ҽ��ϴ�.");
				System.out.println(arr[i]);
				break;
			}
		}
		if (i == arr.length) {
			System.out.println("ã�� ������ �����ϴ�.");
		}
	}
}