import java.util.TreeSet;
import java.util.Random;

class AutoLottoSet {
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		Random r = new Random();

		while(hs.size() < 6) { // ��� ���� ��� ���
			hs.add(r.nextInt(45) + 1);
			/*
			if (hs.size() == 6) {
				break;
			}
			*/
		}
		System.out.println("*** �̹��� �ζ� ��÷��ȣ ***");
		System.out.print(hs);
	}
}
