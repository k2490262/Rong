package com.bit.exam01;

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

public class InsertCustomer extends JFrame {
	JTextField jtf_custid;
	JTextField jtf_name;
	JTextField jtf_address;
	JTextField jtf_phone;

	public InsertCustomer() {
		jtf_custid = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_address = new JTextField(10);
		jtf_phone = new JTextField(10);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 2));
		p.add(new JLabel("ID"));
		p.add(jtf_custid);
		p.add(new JLabel("����"));
		p.add(jtf_name);
		p.add(new JLabel("�ּ�"));
		p.add(jtf_address);
		p.add(new JLabel("��ȭ"));
		p.add(jtf_phone);

		JButton btnAdd = new JButton("���");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. ������� �Է°����� CustomerVO�� ��´�.
				// 2. CustomerDAO�� insertCustomer�޼ҵ带 ����Ѵ�.
				// 3. insert �������ο� ���� ������ �޼����� ����Ѵ�.

//				CustomerVO cv = new CustomerVO();
				int custid = Integer.parseInt(jtf_custid.getText());
				String name = jtf_name.getText();
				String addr = jtf_address.getText();
				String phone = jtf_phone.getText();

				CustomerVO cv = new CustomerVO(custid, name, addr, phone);

//				cv.setCustid(custid);
//				cv.setName(name);
//				cv.setAddress(addr);
//				cv.setPhone(phone);

				CustomerDAO dao = new CustomerDAO();
				int re = dao.insertCustomer(cv);
				if (re > 0) {
					JOptionPane.showMessageDialog(null, "���� ����Ͽ����ϴ�.");
				} else {
					JOptionPane.showMessageDialog(null, "�� ��Ͽ� �����Ͽ����ϴ�.");
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
		new InsertCustomer();
	}
}
