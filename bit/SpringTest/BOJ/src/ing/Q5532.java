package ing;

import java.util.Scanner;

/**
 * 1. ��������� ���ϸ��� �����°�?
 * 2. ���м����� ���ϸ��� �����°�?
 * 3. 1���� 2���� ���ؼ� ū ���� ����
 * 4. �� �����ϼ� - * 3��
 * @author quadcore
 */
public class Q5532 {
	Scanner sc = new Scanner(System.in);
	public static int l, a, b, c, d, result;

	public static void main(String[] args) {
		int vacation = l;
		int korDay = koreanDay(a, c);
		int mathDay = mathDay(b, d);
		result = compare(korDay, mathDay);
		// 4. �� �����ϼ� - 3��
		System.out.println(vacation - result);
	}

	// 1. ��������� ���ϸ��� �����°�?
	public static int koreanDay(int mountOfKor, int dayOfKor) {
		if (mountOfKor % dayOfKor == 0) {
			mountOfKor = mountOfKor / dayOfKor;
		} else {
			mountOfKor = mountOfKor / dayOfKor + 1;
		}
		return a;
	}

	// 2. ���м����� ���ϸ��� �����°�?
	public static int mathDay(int mountOfMath, int dayOfMath) {
		if (mountOfMath % dayOfMath == 0) {
			mountOfMath = mountOfMath / dayOfMath;
		} else {
			mountOfMath = mountOfMath / dayOfMath + 1;
		}
		return b;
	}

	// 1���� 2���� ���ؼ� ū ���� ����
	public static int compare(int korDay, int mathDay) {
		if (mathDay > korDay) {
			System.out.println(l - a);
		} else {
			System.out.println(l - b);
		}
		return result;
	}
}
