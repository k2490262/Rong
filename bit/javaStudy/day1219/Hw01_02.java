import java.util.Random;

interface Drawble {
	public void draw();
}

class Rectangle implements Drawable {
   public void draw() {
      System.out.println("�簢��");
   }
}

class Triangle implements Drawable {
   public void draw() {
      System.out.println("�ﰢ��");
   }
}

class Circle implements Drawable {
   public void draw() {
      System.out.println("��");
   }
}

class Hw01_02 {
	public static void main(String[] args) {
		Random r = new Random();
	}
}
