import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest02 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/javaStudy/day1224/hello.txt");
			fw.write("Merry Christmas��");
			fw.close();
			System.out.println("������ �����Ͽ����ϴ�.");
		} catch(IOException e) {
			System.out.println("���� ó�� �߿� ������ �߻��Ͽ����ϴ�.");
		}
	}
}
