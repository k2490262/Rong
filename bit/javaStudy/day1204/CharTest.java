/*
자바의 자료형(Data Type)
	char - 하나의 글자를 저장하기 위한 자료형
	자바는 하나의 문자와 문자열의 처리가 다름

*/

class CharTest {
	public static void main(String[] args) {
		char like;
		like = 'J';
		System.out.println('J');
		System.out.println("J");
		System.out.println("like");
		System.out.println(like);

		//char a;
		//a = "J";
		//System.out.println(a);
		//error: incompatible types: String cannot be converted to char
		//a = "J";

		char b;
		b = '홍';
		System.out.println(b);
	}
}
