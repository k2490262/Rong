package com.bit.exam05;

// Cage��ü ���� �� animal�� �ڷ����� �����ϵ��� ���׸����� �����Ѵ�.
// class Cage<T>
// T�� �׳� ��Ī�̴� ������� ���ص� �ȴ�.

// main�޼ҵ忡�� Cage<Tiger> c = new Cage<Tige>��� �Ѵٸ�
// T�� Tiger�� ��ȯ�Ǿ� ó���ȴ�. 
// ��, animal�� �ڷ����� Tiger�� �ϰڴٶ�� �ǹ��̴�.

// ���� Cage<Animal> c = new Cage<Animal>�̶�� �Ѵٸ�
// T�� Animal�� ��ȯ�Ǿ� ó���ȴ�.(���׸�)
public class Cage<T> {
	private T animal;

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
}
