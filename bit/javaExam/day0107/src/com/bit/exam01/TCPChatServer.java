package com.bit.exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9002);
			// TCP����� ����� ���� ���������� �����Ѵ�.
			// �ٸ� ��Ʈ��ũ ���α׷��� �����ϱ� ���Ͽ� ��Ʈ��ȣ�� 9002������ �����Ѵ�.

			System.out.println("������ ����Ǿ����ϴ�.");
			while (true) { // Ŭ���̾�Ʈ�� ������ ����Ѵ�.
				Socket socket = server.accept();
				// Ŭ���̾�Ʈ ���� �ÿ� ������ �����ϱ� ����
				// accept�޼ҵ尡 ȣ��ǰ� �� �� Ŭ���̾�Ʈ�� �����͸� �ְ� �ޱ� ����
				// ������ �����ȴ�.

				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				// ����� Ŭ���̾�Ʈ�� �����͸� �ְ� �ޱ� ���� ������ ���� ��Ʈ���� �����Ѵ�.

				byte[] data = new byte[100];
				// Ŭ���̾�Ʈ�κ��� ���ŵ� �����͸� �����ϱ� ���� �迭�� �����.
				// ������ Ŭ���̾�Ʈ�� ����ؼ� �����͸� �ְ� �ޱ� ���� �ݺ������� ǥ���Ѵ�.
				while (true) { // <- �̺κ��� �������� Ŭ���̾�Ʈ�� ����Ϸ��� Thread�� ǥ���ؾ� �Ѵ�.
					is.read(data); // Ŭ���̾�Ʈ�� ������ �����͸� �޴´�.
					os.write(data); // ���� �����͸� �״�� �������� ==> �޾Ƹ�
					String msg = new String(data); // ���� �����͸� ���ڿ��� �����.
					System.out.println("���ŵ� �޽��� : " + msg);
					Arrays.fill(data, (byte) 0); // ���� ���ŵ� �����͸� ���Ͽ� �迭�� �ʱ�ȭ ��Ų��.
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
