package com.bit.exam02;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal a = new Tiger();
		// Animal b = new Lion();
		// ���������� �ڷ����� Animal�� �����ϰ� �Ǹ�
		// �� �Ͱ� is a ����(��Ӱ���)�� �ִ� �ڽ�Ŭ������
		// ��ü ������ ������ �� �ִ�.
		
		Cage cage = new Cage();
		// cage.setAnimal(a);
		// Cage�� ��� ���� animal�� �ڷ����� Animal�� �����߱� ������
		// Animal�� is a ���迡 �ִ� ������ ���� �� �ִ�.
		// Tiger�� Lion ��� ���� �� �ִ�.
		
		cage.setAnimal(new Tiger());
		// Tiger ��ü�� ������ ������ ��Ƶ� �ǰ�
		// �ٷ� ��ü�� �����Ͽ� ���� ���� �ִ�.
		
		// cage.setAnimal(new Lion());
	}
}
