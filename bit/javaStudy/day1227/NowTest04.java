import java.awt.Frame;
import java.awt.Label;
import java.util.Date;

class MyDate {
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

class MyFrame extends Frame {
	Label view;
	public MyFrame() {
		view = new Label("���⿡ �ð��� ǥ�õ�");
		add(view);
		setSize(400, 300);
		setVisible(true);
	}
}

class NowTest04 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();

		while (true) {
			String now = (new MyDate()).toString();
			f.view.setText(now);

			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
			}
		}
	}
}
