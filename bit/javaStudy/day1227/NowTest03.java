/*
���� �ð��� 2019�� 12�� 27�� �ݿ��� 14�� 51�� 30��
*/

import java.util.Date;

class Now {
	public String toString() {
		Date d = new Date();

		int year = d.getYear() + 1900;
		int month = d.getMonth()+1;
		int date = d.getDate();
		int day = d.getDay();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();

		String[] yoil = {"��", "��", "ȭ", "��", "��", "��", "��"};
		String str = year + "�� " + month + "�� " + date + "�� " + yoil[day] + "���� " + hours + "�� " + minutes + "�� " + seconds + "�� ";

		return str;
	}
}

class NowTest03 {
	public static void main(String[] args) {
		while(true) {
			System.out.println(new Now());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
