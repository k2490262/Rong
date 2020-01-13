package com.bit.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest02 extends JFrame implements ActionListener {
	String[] fruits = { "���", "����", "����", "����", "�ٳ���" };
	JCheckBox[] jcb;
	JLabel result;

	public CheckBoxTest02() {
		jcb = new JCheckBox[fruits.length];
		// üũ�ڽ� ������ fruit�迭�� ������ŭ ����

		result = new JLabel("�ƹ��͵� �������� �ʾҽ��ϴ�.");

		setLayout(new FlowLayout());

		// for���� ���� fruits�迭�� ���̱��� üũ�ڽ� �߰�
		for (int i = 0; i < fruits.length; i++) {
			jcb[i] = new JCheckBox(fruits[i]);
			add(jcb[i]);
			jcb[i].addActionListener(this);
		}
		add(result);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CheckBoxTest02();
	}

	public void actionPerformed(ActionEvent e) {
		String str = "";

		// for���� ���� jcb�迭�� ���̱��� if������ ��ư Ŭ���� str��Ʈ���� ", " �߰�
		for (int i = 0; i < jcb.length; i++) {
			if (jcb[i].isSelected()) {
				str = str + fruits[i] + ",";
			}
		}

		// str��Ʈ���� ���ý� ���� if���� ���� �߰�
		if (str.equals("")) {
			str = "�ƹ��͵� �������� �ʾҽ��ϴ�.";
		} else {
			str = str.substring(0, str.length() - 1);
			str = str + "�� �����Ͽ����ϴ�.";
		}

		result.setText(str);
		// result�󺧿� str�� �Է�
	}
}
