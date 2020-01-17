package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPClientGUI extends JFrame {
	JTextArea jta; // ��ȭ������ �����Ͽ� ����� �׽�Ʈ �����
	JTextField jtf; // ��ȭ������ �Է��� �ؽ�Ʈ �ʵ�
	OutputStream os; // ������ �����͸� �������� ������ ��Ʈ��
	InputStream is; // �����κ��� �����͸� �����ϱ� ���� ��Ʈ��

	public TCPClientGUI() {
		String host = "192.168.0.55"; // ����� ������ ip�ּ�
		int port = 9002; // ����� ���� ����� port��ȣ

		try {
			Socket socket = new Socket(host, port);
			// ���� ��ü�� �����Ͽ� ������ �����Ѵ�.

			is = socket.getInputStream();
			// ������ ������ ���� �����͸� �����ϱ� ���� ��Ʈ���� �����Ѵ�.

			os = socket.getOutputStream();
			// ������ ������ ���� �����͸� �������� ���� ��Ʈ���� �����Ѵ�.

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		jta = new JTextArea();
		jtf = new JTextField();

		// ���� �޽����� �����ϴ� �Ͱ� ������
		// ������ �������� �޽����� ����Ͽ� �����ϱ� ����
		// �����带 �����.
		class ClientThread extends Thread {
			public void run() {
				try {
					byte[] data = new byte[100];
					// �����κ��� ���ŵ� �����͸� �����ϱ� ���� �迭

					// ����Ͽ� �����͸� �ޱ� ���� �ݺ������� ǥ���Ѵ�.
					while (true) {

						// ������ ������ �����͸� �޴´�.
						is.read(data);

						// ���ŵ� �����͸� ���ڿ��� �����.
						String msg = new String(data);

						// ���õ� ���ڿ��� �ؽ�Ʈ ���� �߰��Ѵ�.
						jta.append(msg + "\n");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

		// �����κ��� ���ŵ� �����͸� ����Ͽ� �ޱ⸦ �����ϴ�
		// ������ ��ü�� �����Ѵ�.
		ClientThread ct = new ClientThread();

		// �����带 �����Ѵ�.
		ct.start();

		JButton btn = new JButton("����");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = jtf.getText();
				byte[] data = msg.getBytes();
				try {
					os.write(data);
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(jtf, BorderLayout.CENTER);
		p.add(btn, BorderLayout.EAST);

		JScrollPane jsp = new JScrollPane(jta);
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TCPClientGUI();
	}
}
