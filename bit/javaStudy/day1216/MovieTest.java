class Movie {
	private String title;
	private String director;
	private String actors;
	private String releaseDate;
	private String madeByCountry;
	private double rate;
	private int runningTime;

	public void info() {
		System.out.println("��ȭ���� : " + title);
		System.out.println("��ȭ���� : " + director);
		System.out.println("�ֿ���� : " + actors);
		System.out.println("������¥ : " + releaseDate);
		System.out.println("���۱��� : " + madeByCountry);
		System.out.println("��ȭ���� : " + rate);
		System.out.println("�󿵽ð� : " + runningTime + "��");
	}

	public Movie() { // �⺻������ ���� ���� �ʼ�! ���� �� ���� ���� �� �� ����
		
	}

	public Movie(String title, String director, String actors, String releaseDate,
					String madeByCountry, double rate, int runningTime) {
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.releaseDate = releaseDate;
		this.madeByCountry = madeByCountry;
		this.rate = rate;
		this.runningTime = runningTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMadeByCountry() {
		return madeByCountry;
	}

	public void setMadeByCountry (String madeByCountry) {
		this.madeByCountry = madeByCountry;
	}

	public double getRate() {
		return rate;
	}

	public void setRate (double rate) {
		this.rate = rate;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime (int runningTime) {
		this.runningTime = runningTime;
	}
}

class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie("La La Land", "Damien Chazelle", "Ryan Gosling, Emma Stone",
							"2016�� 12�� 07��", "�̱�", 8.34, 127);
		m.info();
	}
}
