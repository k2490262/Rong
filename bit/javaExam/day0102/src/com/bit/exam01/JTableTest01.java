package com.bit.exam01;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest01 extends JFrame {
	public JTableTest01() {
		String[] colName = {"�̸�", "����", "����", "����"};
		String[][] rowData = {{"ȫ�浿", "100", "100", "100"},
								{"�̼���", "80", "90", "100"},
								{"������", "70", "80", "90"}};
		
		JTable table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest01();
	}
}
