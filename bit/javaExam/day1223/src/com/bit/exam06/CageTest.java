package com.bit.exam06;

public class CageTest {

	public static void main(String[] args) {
		Cage cage = new Cage();
		cage.animal.add(new Lion("��Ʈ����"));
		cage.animal.add(new Tiger(2019));		
		cage.animal.add(new Tiger(2020));		
		cage.animal.add(new Lion("��������"));
		
		for (int i = 0; i < cage.animal.size(); i++) {
			Animal animal = cage.animal.get(i);
			System.out.println(animal);
			
			if (animal instanceof Tiger) {
				// Tiger t = (Tiger)animal;
				// t.proTiger();
				((Tiger)animal).proTiger();
			}
			else if (animal instanceof Lion) {
				((Lion)animal).proLion();
			}
		}
	}
}
