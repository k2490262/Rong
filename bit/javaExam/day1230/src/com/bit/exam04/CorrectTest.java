///*1~100 ������ ���� �߿� ��ǻ�Ͱ� �����ϰ� �ִ� ���ڸ� �˾� ���ߴ� ���α׷��� �ۼ�
// * ȭ�� �����̳� Ŭ������, ������ ���� �����Ӱ�
// * 
// * ����, �Է¼��ڰ� �´ٸ� "�¾ҽ��ϴ�"
// * Ʋ���ٸ� "�� ū ���� �õ��ϼ���"�� "�� ���� ���� �õ��ϼ���"
// * �޽����� ���
// */
//
//package com.bit.exam04;
//
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class CorrectTest extends JFrame implements ActionListener {
//	Random rd = new Random();
//	JTextField jtf_tryNum;
//	JTextField jtf_result;
//	
//	public CorrectTest() {
//		jtf_num = new JTextField(5);
//		jtf_result = new JTextField(5);
//		
//		setTitle("���ڰ���");
//		
//		setLayout(new FlowLayout());
//		add(new JLabel("���ڸ� �����Ͻÿ�"));
//		add(jtf_tryNum);
//		
//		JButton btn = new JButton("Ȯ��!");
//		add(btn);
//		
//		btn.addActionListener(this);
//		
//		add(new JLabel(""));
//		add(jtf_result);
//		
//		setSize(400, 300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		int n = Integer.parseInt(jtf_num.getText());
//		
//		if(tryNum < ) {
//			
//		}
//	}
//
//	public static void main(String[] args) {
//		new CorrectTest();
//	}
//}
