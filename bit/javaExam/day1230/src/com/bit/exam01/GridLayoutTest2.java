package com.bit.exam01;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class GridLayoutTest2 extends JFrame {
	public GridLayoutTest2() {
		setLayout(new GridLayout(3, 5));
		
		for (int i = 1; i <= 12; i++) {
			add(new Button("��ư" + i));
		}
		setSize(400, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridLayoutTest2();
	}
}
