package com.bit.exam12;

import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {
		// File file = new File("c:/javeExam");
		File file = new File("c:/javeExam");

		if (file.isDirectory()) {
			System.out.println("���丮");
		} else {
			System.out.println("����");
		}
	}

}
