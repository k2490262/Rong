class Father {
	public void make() {
		System.out.println("¥��");
	}
}

class Son extends Father {
	public void make() {
		System.out.println("��¥��");
	}

	public void service() {
		System.out.println("������");
	}
}

class ChineseFood {
	public static void main(String[] args) {
		Father f = new Father();
		f.make();

		Father s = new Son();
		s.make();
		((Son)s).service();
	}
}
