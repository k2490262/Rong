package com.bit.exam01;

public class MessageBeanKo implements MessageBean {
	
	// MessageBeanKo�� �⺻�����ڸ� �����
	// ������ ��¹����ۼ��Ͽ� �����ϴ��� Ȯ���غ��ϴ�.
	public MessageBeanKo() {
		// TODO Auto-generated constructor stub
		System.out.println("������ ����");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���, " + name);
	}

}
