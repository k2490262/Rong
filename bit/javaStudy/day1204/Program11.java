import java.util.Scanner;

class Program11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int r, h;
	double v;
	System.out.println("원기둥 밑면의 반지름을 입력하시오 : ");
	r = sc.nextInt();
	System.out.println("원기둥의 높이를 입력하시오 : ");
	h = sc.nextInt();
	v = 3.141592 * r * r * h;

	System.out.println("원기둥의 부피는 " + v + " 입니다.");
	}
}
