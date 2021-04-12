package kh.java.exam;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChattingServer {

	public void chattingServer() {

		int port = 8888;

		System.out.println("서버를 시작합니다.");

		ServerSocket serverSocket = null;

		DataInputStream dis = null;

		DataOutputStream dos = null;

		try {

			serverSocket = new ServerSocket(port);

			Socket clientSocket = serverSocket.accept();

			InputStream in = clientSocket.getInputStream();

			OutputStream out = clientSocket.getOutputStream();

			dis = new DataInputStream(in);

			dos = new DataOutputStream(out);

//			1
			dos.writeUTF("[서버 연결 성공]");

			Date date = new Date();

			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

			String now = sdf.format(date);

//			2
			dos.writeUTF("[현재시간] : " + now);

			BufferedOutputStream buffer = new BufferedOutputStream(out);
			ObjectOutputStream oos = new ObjectOutputStream(buffer);
			oos.writeObject(now);
			oos.flush();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				dis.close();

				dos.close();

				serverSocket.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}
	}

}