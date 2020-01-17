package com.bit.chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class TCPChatServer {

	// ������ ��� Ŭ���̾�Ʈ�� �ϴ��� ����� ���� ��� ���������
	// ��� ���� ����Ʈ�� �����.
	public static ArrayList<TCPServerThread> list;

	public static void main(String[] args) {
		list = new ArrayList<TCPServerThread>();

		try {
			ServerSocket server = new ServerSocket(9002);
			System.out.println("������ ����Ǿ����ϴ�.");

			while (true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				TCPServerThread tst = new TCPServerThread(socket);
				tst.start();
				list.add(tst);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
