package com.bit.exam10;

public class TvArsTest {

	public static void main(String[] args) {
		Account account = new Account();
		Contributer cb1 = new Contributer("ȫ�浿", account);
		Contributer cb2 = new Contributer("�̼���", account);
		Contributer cb3 = new Contributer("������", account);
		Contributer cb4 = new Contributer("������", account);
		Contributer cb5 = new Contributer("������", account);

		cb1.start();
		cb2.start();
		cb3.start();
		cb4.start();
		cb5.start();

		try {
			cb1.join();
			cb2.join();
			cb3.join();
			cb4.join();
			cb5.join();
		} catch (Exception e) {

		}

		System.out.println("��ü ��ݾ� : " + account.getBalance());
	}
}
