/*
���� �ð��� 2019�� 12�� 27�� �ݿ��� 14�� 51�� 30��
*/

import java.util.Date;

class NowTest {
	public static void main(String[] args) {
		Date d = new Date();

		int year = d.getYear() + 1900;
		int month = d.getMonth()+1;
		int date = d.getDate();
		int day = d.getDay();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();

		String[] yoil = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(year + "�� " + month + "�� " + date + "�� " + yoil[day] + "���� " + hours + "�� " + minutes + "�� " + seconds + "�� ");
	}
}
