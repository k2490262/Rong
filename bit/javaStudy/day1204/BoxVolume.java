import java.util.Scanner;

class BoxVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***상자의 부피를 출력하는 프로그램***\n");
		System.out.print("상자의 길이를 입력하시오 : ");
		int l = scan.nextInt();
		System.out.print("상자의 너비를 입력하시오 : ");
		int w = scan.nextInt();
		System.out.print("상자의 높이를 입력하시오 : ");
		int h = scan.nextInt();
		int i = l * h * h;
		System.out.println("상자의 부피는 " + i + " 입니다.");
	}
}
