package com.bit.exam06;

public class Tiger extends Animal {
	private int year;
	
	public Tiger(int year) {
		super();
		this.year = year;
	}

	public void proTiger() {
		System.out.println("proTiger�Դϴ�.");
		System.out.println(year);
	}

	@Override
	public String toString() {
		return "Tiger [year=" + year + "]";
	}
}
