package com.bit.test;

public class MyUtil {

	// ������ ���� 2���� ���޹޾� �� �߿� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	public int max(int a, int b) {
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		return r;
	}

	// �Ǽ��� ���� 2���� ���޹޾� �� �߿� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	public double max(double a, double b) {
		double r = a;
		if (b > r) {
			r = b;
		}
		return r;
	}
	
	
}
