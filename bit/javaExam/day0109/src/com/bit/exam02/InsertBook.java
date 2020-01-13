package com.bit.exam02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.bit.exam01.CustomerDAO;
import com.bit.exam01.CustomerVO;

public class InsertBook extends JFrame {
	JTextField jtf_bookid;
	JTextField jtf_bookname;
	JTextField jtf_publisher;
	JTextField jtf_price;

	public InsertBook() {
		jtf_bookid = new JTextField(10);
		jtf_bookname = new JTextField(10);
		jtf_publisher = new JTextField(10);
		jtf_price = new JTextField(10);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 2));
		p.add(new JLabel("���� ID"));
		p.add(jtf_bookid);
		p.add(new JLabel("������"));
		p.add(jtf_bookname);
		p.add(new JLabel("���ǻ�"));
		p.add(jtf_publisher);
		p.add(new JLabel("����"));
		p.add(jtf_price);

		JButton btnAdd = new JButton("���");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bookid = Integer.parseInt(jtf_bookid.getText());
				String bookname = jtf_bookname.getText();
				String publisher = jtf_publisher.getText();
				String price = jtf_price.getText();

				BookVO bv = new BookVO(bookid, bookname, publisher, price);

				BookDAO dao = new BookDAO();
				int r = dao.insertBook(bv);
				if (r > 0) {
					JOptionPane.showMessageDialog(null, "������ ����Ͽ����ϴ�.");
				} else {
					JOptionPane.showMessageDialog(null, "���� ��Ͽ� �����Ͽ����ϴ�.");
				}
			}
		});

		add(p, BorderLayout.CENTER);
		add(btnAdd, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new InsertBook();
	}
}
