package com.bit.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame {
	JRadioButton jrb01;
	JRadioButton jrb02;
	JLabel result;
	ButtonGroup bg;

	public JRadioButtonTest() {
		bg = new ButtonGroup();
		jrb01 = new JRadioButton("����");
		jrb02 = new JRadioButton("����");
		bg.add(jrb01);
		bg.add(jrb02);

		result = new JLabel("");
		setLayout(new FlowLayout());
		add(jrb01);
		add(jrb02);
		add(result);

		jrb01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("����� �����Դϴ�.");
			}
		});

		jrb02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("����� �����Դϴ�.");
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JRadioButtonTest();
	}
}
