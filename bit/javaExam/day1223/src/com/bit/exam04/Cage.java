package com.bit.exam04;

// CageŬ������ ��������� Animal�� ��ü�� ������.
// Cage has a Animal�� ǥ���� �� �ִ�.
// �̷��� ���踦 has a ������ �Ѵ�.
public class Cage {
	private Animal animal;
	// Cage�� ���� �� �ִ� �ڷ����� ��� ������ �����Ϸ��� �Ѵ�.
	// �׷��ϱ� Tiger�� ���� �� �ְ�, Lion�� ��� �ʹ�.
	// �׷��� animal�� �ڷ����� Animal�� �����Ѵ�.
	// �� Animal�� �ļ��� ������ ���� �� �ִ�.

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
