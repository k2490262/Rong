/* ����ڷκ��� ������ �� n�� �Է¹޾� 1���� n������ ����
 * �����Ͽ� ����ϴ� ���α׷��� GUI�� �ۼ��մϴ�.
 * ȭ�� ���� �� Ŭ���� �̸� ���� �����Ӱ� �մϴ�.
 */

package com.bit.exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumTest extends JFrame implements ActionListener{
	JTextField jtf_num;
	JTextField jtf_result;
	
	public SumTest() {
		setLayout(new FlowLayout());
		jtf_num = new JTextField(5);
		jtf_result = new JTextField(5);
		
		add(new JLabel("������ ���ұ��?"));
		add(jtf_num);

		JButton btn = new JButton("n������ ��");
		add(btn);
		
		btn.addActionListener(this);
		
		add(new JLabel("��� : "));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SumTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(jtf_num.getText());
		int tot = 0;
		for (int i = 1; i <= n ; i++) {
			tot += i;
		}
		jtf_result.setText(tot + "");
	}
}
