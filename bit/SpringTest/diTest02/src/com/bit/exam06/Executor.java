package com.bit.exam06;

public class Executor {
	private Worker worker;

	public Executor(Worker worker) {
		super();
		this.worker = worker;
		System.out.println("������1 ������");
		this.worker.pro();
	}
	
	public Executor(String run) {
		System.out.println("������2 ������");
	}
}
