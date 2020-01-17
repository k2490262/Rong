package com.bit.exam04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGuess extends JFrame implements ActionListener {
	int com;
	JTextField jtf_user;
	JTextField jlb_msg;
	JLabel jlb_cnt;
	JButton btn;
	int cnt = 0;

	public NumberGuess() {
		jtf_user = new JTextField(5);
		jlb_msg = new JTextField("");
		jlb_cnt = new JLabel("");

		Random rd = new Random();
		com = rd.nextInt(100) + 1;

		setLayout(new FlowLayout());

		setTitle("���� �˾Ƹ��߱�");

		add(new JLabel("�˾Ƹ��� ������"));
		add(jtf_user);

		btn = new JButton("���߱�");
		add(btn);
		
		JButton btn_newGame = new JButton("�� ����");
		add(btn_newGame);
		btn_newGame.addActionListener(this);

		btn.addActionListener(this);

		JButton btn_finish = new JButton("����");
		add(btn_finish);
		btn_finish.addActionListener(this);

		add(jlb_msg);
		add(jlb_cnt);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("���߱�")) {
			int user = Integer.parseInt(jtf_user.getText());

			if (com == user) {
				jlb_msg.setText("�����Դϴ�.");
				jlb_msg.setBackground(Color.blue);
			} else if (com > user) {
				jlb_msg.setText("�� ū ���� �õ����ּ���.");
				jlb_msg.setBackground(Color.red);
			} else {
				jlb_msg.setText("�� ���� ���� �õ����ּ���.");
				jlb_msg.setBackground(Color.red);
			}
			cnt++;

			if (cnt >= 10) {
				btn.setEnabled(false);
			}
			jlb_cnt.setText(cnt + "�� �õ� �߽��ϴ�.");
		} else if (cmd.equals("����")) {
			System.exit(0);
		} else if (cmd.equals("�� ����")) {
			btn.setEnabled(true);
			cnt = 0;
			Random rd = new Random();
			com = rd.nextInt(100) + 1;
			jlb_cnt.setText("");
			jlb_msg.setText("");
			jtf_user.setText("");
		}
	}

	public static void main(String[] args) {
		new NumberGuess();
	}
}
