class A {
	public void pro() {
		System.out.println("A�� ����");
	}

	public void test() {
		System.out.println("test");
	}
}

class B extends A {
	public void pro(){
		System.out.println("B�� ����");
	}
}

class AbstractTest {
	public static void main(String[] args) {
		B ob = new B();
		ob.pro();
		ob.test();
	}
}
