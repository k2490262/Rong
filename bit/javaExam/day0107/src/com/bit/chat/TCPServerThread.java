package com.bit.chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class TCPServerThread extends Thread {
	Socket socket;
	OutputStream os;
	InputStream is;

	// ������ ���ŵ� �޽����� ������ ����� ��� Ŭ���̾�Ʈ�鿡�� �����Ѵ�.
	public void broadCast(byte[] data) {
		for (TCPServerThread tst : TCPChatServer.list) {
			tst.send(data);
		}
	}

	// ���� ����� Ŭ���̾�Ʈ �Ѹ��� �����͸� �߼��ϱ� ���� �޼ҵ�
	public void send(byte[] data) {
		try {
			os.write(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public TCPServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		try {
			byte[] data = new byte[100];
			while (true) {
				is.read(data);
				broadCast(data);
				// os.write(data);
				String msg = new String(data);
				System.out.println("���ŵ� �޽��� : " + msg);
				Arrays.fill(data, (byte) 0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
