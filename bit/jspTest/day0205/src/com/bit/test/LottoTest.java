package com.bit.test;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		TreeSet lotto = new TreeSet();
		/* �ζ� ��ȣ�� �ߺ��� ���� �ʾƾ� �ϹǷ� set�� �����Ѵ�.
			set�� Ư¡�� �ߺ��� ������� �ʱ� ������
			���ο� �����͸� �߰��� �� �̹� �� ���� set�� �ִٸ� ���� �ʴ´�.
		 */
		Random r = new Random();
		// 1~45 ������ ������ ��(����)�� ����� ���� Random��ü�� �����Ѵ�.
		
		while (true) {	// ���(������) �ݺ� �����Ѵ�.
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() >= 6) {	// ���࿡ set�̸��� lotto�� ��� ���� 6�� �̻��̸�
				break;					// �ݺ����� Ż���Ѵ�.
			}
		}
		System.out.println(lotto); // set�� ������ lotto�� ��� 6���� ���ڸ� ����Ѵ�.
								   // TreeSet�� toString()�� �ڽſ��� �µ��� ������ �Ǿ� �ִ�.
	}
}
