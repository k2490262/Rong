class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("�ڵ���", "010-1111-1111", 10000, 3.0);
		BankAccount b2 = new BankAccount();

		System.out.println("ù��° ������ ����");
		System.out.println("�̸� : " + b2.getName());
		System.out.println("���¹�ȣ : " + b2.getNo());
		System.out.println("�ܾ� : " + b2.getBalance());
		System.out.println("������ : " + b2.getRate());
		System.out.println("==============================");
		System.out.println("�ι�° ������ ����");
		System.out.println("�̸� : " + b1.getName());
		System.out.println("���¹�ȣ : " + b1.getNo());
		System.out.println("�ܾ� : " + b1.getBalance());
		System.out.println("������ : " + b1.getRate());
	}
}

class BankAccount {
	private String name;
	private String no;
	private double balance;
	private double rate;

	public BankAccount() {	
	}

	public BankAccount(String name, String no, double balance, double rate) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}

