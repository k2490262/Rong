import java.util.Calendar;
import java.awt.Frame;
import java.awt.Label;

class MyFrame extends Frame {
	Label view;
	public MyFrame() {
		view = new Label("���⿡ ����ð� ǥ��");
		add(view);
		setSize(400, 300);
		setVisible(true);
	}
}

class CalendarTest02 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		String[] yoil = {"", "��", "��","ȭ","��","��","��","��"};

		while (true) {
			Calendar today = Calendar.getInstance();
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH) + 1;
			int date = today.get(Calendar.DATE);
			int day = today.get(Calendar.DAY_OF_WEEK);
			int hour = today.get(Calendar.HOUR_OF_DAY);
			int minute = today.get(Calendar.MINUTE);
			int second = today.get(Calendar.SECOND);

			StringBuffer sb = new StringBuffer();
			sb.append(year + "�� ");
			sb.append(month + "�� ");
			sb.append(date + "�� ");
			sb.append(yoil[day] + "���� ");
			sb.append(hour + "�� ");
			sb.append(minute + "�� ");
			sb.append(second + "�� ");

//			f.view.setText(sb); // �̷��Դ� �Ұ���, StringBuffer�� ������� ����
			f.view.setText(sb.toString());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
