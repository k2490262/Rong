package com.bit.chat;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// ��ȭ��� ������ ������ ip�� �Է¹޾� �ش� ä�ü����� �����ϵ��� �Ѵ�.
public class TCPClientConnect extends JFrame {
	JTextField jtf_name;
	JTextField jtf_host;

	public TCPClientConnect() {
		jtf_name = new JTextField(20);
		jtf_host = new JTextField(20);

		setLayout(new FlowLayout());

		add(new JLabel("��ȭ�� : "));
		add(jtf_name);
		add(new JLabel("������ IP �ּ� : "));
		add(jtf_host);
		JButton btn = new JButton("����");
		add(btn);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				String host = jtf_host.getText();
				TCPClientGUI tcg = new TCPClientGUI(name, host);
			}
		});

		setSize(350, 150);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new TCPClientConnect();
	}
}
