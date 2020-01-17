package com.bit.exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HanTest extends JFrame implements ActionListener {
	JTextField jtf_num;
	JTextField jtf_conversion;
	
	public HanTest() {
		setLayout(new FlowLayout());
		jtf_num = new JTextField(2);
		jtf_conversion = new JTextField(10);
		
		setTitle("�ѱ�ǥ��� ��� ���α׷�");
		
		add(new JLabel("0~9 ������ ���� : "));
		add(jtf_num);
		
		JButton btn = new JButton("�ѱ۷� ��ȯ!");
		add(btn);
		
		add(new JLabel("�ش� ���ڸ� �ѱ۷� ��ȯ�� : "));
		add(jtf_conversion);
		
		btn.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int n = Integer.parseInt(jtf_num.getText());
			
			if(n >= 0 && n < 10) {
				String[] han = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
				jtf_conversion.setText(han[n]);
			} else {
				jtf_conversion.setText("0~9 ���� ���ڸ�!");
			}
		} catch(Exception ex){
			jtf_conversion.setText("���ڸ� �Է°���!");
		}
	}

	public static void main(String[] args) {
		new HanTest();
	}
}
