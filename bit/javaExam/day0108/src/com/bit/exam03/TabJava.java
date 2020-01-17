package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TabJava extends JPanel implements ActionListener {
	String[] arr = { "��ü����", "Interpreter ���", "���� �̽ļ�", "MultiThread ����" };
	JCheckBox jcb[] = new JCheckBox[arr.length];
	JTextField jtf;

	public TabJava() {
		setLayout(new FlowLayout());
		for (int i = 0; i < arr.length; i++) {
			jcb[i] = new JCheckBox(arr[i]);
			add(jcb[i]);
			jcb[i].addActionListener(this);
		}
		jtf = new JTextField(20);
		add(jtf);
	}

	public void actionPerformed(ActionEvent e) {
		String str = "";
		for (int i = 0; i < jcb.length; i++) {
			if (jcb[i].isSelected()) {
				str = str + jcb[i].getText() + ",";
			}
		}
		if (str.equals("")) {

		} else {
			str = str.substring(0, str.length() - 1);
			str = str + "��(��) �����Ͽ����ϴ�.";
		}
		jtf.setText(str);
	}
}
