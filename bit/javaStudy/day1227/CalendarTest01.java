import java.util.Calendar;

class CalendarTest01 {
	public static void main(String[] args) {
		String[] yoil = {"", "��", "��","ȭ","��","��","��","��"};

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

		System.out.println(sb);
	}
}