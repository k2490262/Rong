package com.bit.exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest02 extends JFrame {
	public JTableTest02() {
		Vector<String> colNames = new Vector<String>();
		Vector<Vector<String>> rowData = new Vector<Vector<String>>();
		
		colNames.add("�̸�");
		colNames.add("����");
		colNames.add("����");
		colNames.add("����");
		
		Vector<String> s1 = new Vector<String>();
		s1.add("�̼���");
		s1.add("100");
		s1.add("100");
		s1.add("100");
		
		Vector<String> s2 = new Vector<String>();
		s2.add("������");
		s2.add("100");
		s2.add("100");
		s2.add("100");
		
		Vector<String> s3 = new Vector<String>();
		s3.add("ȫ�浿");
		s3.add("100");
		s3.add("100");
		s3.add("100");
		
		rowData.add(s1);
		rowData.add(s2);
		rowData.add(s3);
		
		JTable table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest02();
	}
}
