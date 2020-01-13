package com.bit.exam12;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListTest extends JFrame {
	Vector<String> data;
	JList<String> list;

	public ListTest() {
		data = new Vector<String>();
		list = new JList<String>(data);
		data.add("�ູ");
		data.add("�ǰ�");
		data.add("���");
		data.add("��");
		data.add("�ڽŰ�");

		list.updateUI();
		JScrollPane jsp = new JScrollPane(list);
		setLayout(new FlowLayout());
		add(jsp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ListTest();
	}
}
