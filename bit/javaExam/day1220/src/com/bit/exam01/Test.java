package com.bit.exam01;

import java.util.Random;

class GameCharacter {
	Random r = new Random();
	
	public void draw() {
		System.out.println("GameCharacter()�� draw()");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()�� getLife()");
	}
	
	public String toString() {
		return "";
	}
}

class Hobitt extends GameCharacter {
	public void draw() {
		System.out.println("ȣ���� �׸��ϴ�.");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()�� getLife()");
	}
}

class Titan extends GameCharacter {
	public void draw() {
		System.out.println("Ÿ��ź�� �׸��ϴ�.");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()�� getLife()");
	}
}

class Sorcerer extends GameCharacter {
	public void draw() {
		System.out.println("�ּ��縦 �׸��ϴ�.");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()�� getLife()");
	}
}

public class Test {

	public static void main(String[] args) {
		GameCharacter g1 = new Hobitt();
	}
}
