import java.io.FileWriter;

class FileWriterTest {
	public static void main(String[] args) {
		FileWriter fw = new FileWriter("c:/javaStudy/day1224/hello.txt");
		fw.write("Merry Christmas��");
		fw.close();
	}
}

/*
FileWriterTest.java:5: error: unreported exception IOException; must be caught or declared to be thrown
                FileWriter fw = new FileWriter("c:/javaStudy/day1224/hello.txt");

FileWriterTest.java:6: error: unreported exception IOException; must be caught or declared to be thrown
                fw.write("Merry Christmas��");

FileWriterTest.java:7: error: unreported exception IOException; must be caught or declared to be thrown
*/
