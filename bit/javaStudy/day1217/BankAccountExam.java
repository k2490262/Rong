/*
pdf "��ü�� Ŭ����"�� Lab 3���� ���α׷��� �մϴ�.
*/

class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		balance -= amount;
	}

	public void printBalance() {
		System.out.println("���� �ܾ� : " + balance);
	}

	public void addInterest() {
		balance = balance * 1.075;
	}

	public static void main(String []args) {
		System.out.println("�̰� �����ؿ�?");
	}
}

class BankAccountExam {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.setBalance(100);
		// a1. deposit(100);
		a2.setBalance(50);

		a1.withdraw(60);
		a2.withdraw(30);

		System.out.println("a1�� �ܰ� : " + a1.getBalance());
		System.out.println("a2�� �ܰ� : " + a2.getBalance());

		a1.printBalance();
		a2.addInterest();

		a1.printBalance();
		a2.printBalance();

        a1.withdraw(30);
        a1.withdraw(20);
        a1.printBalance();
	}
}
