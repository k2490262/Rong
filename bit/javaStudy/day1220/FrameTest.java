import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// ��ư�� �������� �� ��ó������� ���� �������̽��� ActionListener
// �츮�� ���� MyFrame���� ��ư�� ������ �� ��ó���� �ϱ� ���� ActionListener�� ���� �Ѵ�.
// MyFrame�� implements ActionListener �߱� ������ ActionListener �������̽� �ӿ� �ִ� ��� �߻�޼ҵ带 ������ �µ��� ������ �ؾ��Ѵ�.

class MyFrame extends Frame implements ActionListener {
	Button ok;
	public MyFrame(String title) {
		super(title);	//	Frame�� �����ڸ� �䱸, ù��° ���忡 �;���

		ok = new Button("Push Push Baby");	//	��ư�� ������ �ȿ��� ����
		ok.addActionListener(this);	//	�̺�Ʈ ó�� ����ڴ� MyFrame�̶�� ��
		add(ok);
		setSize(400, 300);	//	Frame�� �ƹ����� Window�� �ִ� setSize�� ������
		setVisible(true); //	Frame�� �ƹ����� Window�� �ִ� setVisible�� ������
		setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("�ǵ�������");
	}
}

class FrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("GoogIe");
	}
}
