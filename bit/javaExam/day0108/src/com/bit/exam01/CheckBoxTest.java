package com.bit.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest extends JFrame implements ActionListener {
	JCheckBox jcb01;
	JCheckBox jcb02;
	JLabel result;

	public CheckBoxTest() {
		jcb01 = new JCheckBox("���");
		jcb02 = new JCheckBox("����");
		result = new JLabel();

		setLayout(new FlowLayout());
		add(jcb01);
		add(jcb02);
		add(result);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jcb01.addActionListener(this);
		jcb02.addActionListener(this);

//		jcb01.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (jcb01.isSelected()) {
//					System.out.println("����� �����Ͽ����ϴ�.");
//				}else {
//					System.out.println("����� ���������Ͽ����ϴ�.");
//				}
//			}
//		});
	}

	public static void main(String[] args) {
		new CheckBoxTest();
	}

	public void actionPerformed(ActionEvent e) {
		String str = "�ƹ��͵� �������� �ʾҽ��ϴ�.";

		if (jcb01.isSelected() && jcb02.isSelected()) {
			str = "���, ���� ��� �����Ͽ����ϴ�.";
			// �� if���� ������ �� �� ���� �������� �ɸ��� ������ �� if���� �ֻ��� �������� �ؾ� �Ѵ�.

		} else if (jcb01.isSelected()) {
			str = "����� �����Ͽ����ϴ�.";
		} else if (jcb02.isSelected()) {
			str = "������ �����Ͽ����ϴ�.";
		}

		result.setText(str);
	}
}
