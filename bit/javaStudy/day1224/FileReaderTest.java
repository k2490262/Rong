import java.io.FileReader;
import java.io.IOException;

class FileReaderTest {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("c:/javaStudy/day1224/hello.txt");
		int mc;
		while ((mc = fr.read()) != -1) { // ������ ���� �ƴҶ����� ���Ϸκ��� �ѱ��ھ� �о���� ���� mc�� ��´�.
			System.out.print((char)mc);
		}
		fr.close();
		} catch(IOException e) {
			System.out.println("������ �ҷ����� ���߽��ϴ�.");
		}
	}
}
