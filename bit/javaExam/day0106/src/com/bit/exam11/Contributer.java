package com.bit.exam11;

public class Contributer extends Thread {
	private String name;
	Account account;

	public Contributer(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	public void run() {
		for (int i = 1;; i++) {
			if (account.getBalance() >= 500000) {
				break;
			}
			account.deposit(1000);
			System.out.println(name + "��(��)" + i + "��° ��ȭ�� �Ǵ�.");
			try {
				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}
}
