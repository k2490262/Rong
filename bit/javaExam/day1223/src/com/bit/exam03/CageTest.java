package com.bit.exam03;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Tiger();
		Animal b = new Lion();

		Cage cage = new Cage();
		// cage.setAnimal(a);
		// ������ Cage�� animal��������� Tiger�� �����Ǿ� �ִ�.
		// Tiger�� is a ���迡 �ִ� �͸� ���� �� �ִ�.
		// ���� Tiger�� �ļ��� ������ Tiger�� ������ �� �ִ�.
		// ��, Tiger�� �θ�(Animal)�� ���� �� ����.
		
		Tiger c = new Tiger();
		cage.setAnimal(c);
		
		// Lion d = Lion();
		// cage.setAnimal(d);
		// �θ� �� ��Ƴ��� ���� ���������� Lion�� �� ��Ƴ���.
	}
}
