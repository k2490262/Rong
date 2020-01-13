package com.bit.exam01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {
	
	Button b1;
	Button b2;
	
	public MyFrame(String title) {
		super(title);
		
		b1 = new Button("����");
		b2 = new Button("����");
		
		setLayout(new FlowLayout());
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		String cmd = e.getActionCommand();
		if (cmd.equals("����")) {
			System.out.println("�� ���ھ�");
		}
		else {
			System.out.println("�� ���ھ�");
		}
	}
}
