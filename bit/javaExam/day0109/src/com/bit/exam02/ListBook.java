package com.bit.exam02;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListBook extends JFrame {
	Vector<Vector<String>> rowData;
	JTable table;

	public ListBook() {
		Vector<String> colNames = new Vector<String>();
		colNames.add("���� ID");
		colNames.add("������");
		colNames.add("���ǻ�");
		colNames.add("����");

		BookDAO dao = new BookDAO();
		rowData = dao.listBook();

		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ListBook();
	}
}
