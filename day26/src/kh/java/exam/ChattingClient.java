package kh.java.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {

	public void chattingClient() {

		String serverIp = "127.0.0.1";
		//InetAddress address = InetAddress.getByName(serverIp);

		int serverPort = 8888;

		Socket socket = null;

		DataInputStream dis = null;

		DataOutputStream dos = null;

		try {

			socket = new Socket(serverIp, serverPort);
			System.out.println("서버와 연결되었습니다.");

			InputStream in = socket.getInputStream();

			OutputStream out = socket.getOutputStream();

			dis = new DataInputStream(in);

			dos = new DataOutputStream(out);

//			readUTF 두번해줘야댐
//			while(true) {
//				String serverMsg = dis.readUTF();
//				if(serverMsg == null) break;
//				System.out.println(serverMsg);
//			}
			
			String serverMsg = dis.readUTF();
			System.out.println(serverMsg);
			
			serverMsg = dis.readUTF();
			System.out.println(serverMsg);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				dis.close();

				dos.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}

}