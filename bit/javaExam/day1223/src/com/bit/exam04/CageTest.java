package com.bit.exam04;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal a = new Tiger();
		// Animal b = new Lion();
		// ���������� �ڷ����� Animal�� �����ϰ� �Ǹ�
		// �� �Ͱ� is a ����(��Ӱ���)�� �ִ� �ڽ�Ŭ������
		// ��ü ������ ������ �� �ִ�.
		
		// Cage cage = new Cage();
		// cage.setAnimal(a);
		// Cage�� ��� ���� animal�� �ڷ����� Animal�� �����߱� ������
		// Animal�� is a ���迡 �ִ� ������ ���� �� �ִ�.
		// Tiger�� Lion ��� ���� �� �ִ�.
		
		// cage.setAnimal(new Tiger());
		// Tiger ��ü�� ������ ������ ��Ƶ� �ǰ�
		// �ٷ� ��ü�� �����Ͽ� ���� ���� �ִ�.
		
		// cage.setAnimal(new Lion());
		// Lion lion = cage.getAnimal();
		// �θ�Ŭ������ ���������� �ڽ��� �ٶ� ���� ������
		// �ڽ�Ŭ������ ���������� �θ� �ٶ� ���� ����.
		// Object ob = new Lion(); // ��� ����
		// Lion l = new Object(); // ��� �Ұ���
		
		// Lion lion = (Lion)cage.getAnimal();
		// ���Կ����ڸ� �������� ��, ���� �ڷ����� is a ���谡 ������ �� ��
		// �θ�Ŭ������ ��ü�� �ڽ�Ŭ������ ���������� ��� ���ؼ���
		// ����ȯ������ �����ؾ� �Ѵ�.
		
		// Tiger t = new Tiger();
		// Lion l = (Lion)t();
		// ���� �������� ����ȯ �� �� ����.
		
		Cage cage = new Cage();
		cage.setAnimal(new Lion("��Ʈ����"));
		// Lion l = (Lion)cage.getAnimal();
		// l.proLion();
		
		Tiger t = (Tiger)cage.getAnimal();
		// t.proTiger();
		// System.out.println("ok");
	}
}
