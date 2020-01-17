class BankAccountTest03 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("박도형", "010-1111-1111", 10000, 3.0);
		BankAccount b2 = new BankAccount();

		System.out.println("첫번째 계좌의 정보");
		System.out.println(b2);
		System.out.println("==============================");
		System.out.println("두번째 계좌의 정보");
		System.out.println(b1);
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
/*
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + no);
		System.out.println("잔액 : " + balance);
		System.out.println("이자율 : " + rate);
	}
*/

	public String toString() {
		return "[이름 : " + name + ", 계좌번호 : " + no + ", 잔액 : " + balance +
		", 이자율 : " + rate + "]";
	}
}
