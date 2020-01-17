import java.util.Calendar;

class CalendarTest01 {
	public static void main(String[] args) {
		String[] yoil = {"", "일", "월","화","수","목","금","토"};

		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);

		StringBuffer sb = new StringBuffer();
		sb.append(year + "년 ");
		sb.append(month + "월 ");
		sb.append(date + "일 ");
		sb.append(yoil[day] + "요일 ");
		sb.append(hour + "시 ");
		sb.append(minute + "분 ");
		sb.append(second + "초 ");

		System.out.println(sb);
	}
}
