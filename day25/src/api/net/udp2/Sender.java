package api.net.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JOptionPane;

public class Sender {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket();

		InetAddress address = InetAddress.getByName("localhost");
		int port = 30000;
		
		while (true) {
			String content = JOptionPane.showInputDialog("보낼 내용");
			if(content == null) break;
			byte[] data = content.getBytes("UTF-8");
			DatagramPacket dp = new DatagramPacket(data, data.length, address, port);

			ds.send(dp);
		}
		
		//종료되었다는 메세지 전송
		byte[] exit = new byte[] {-1};
		DatagramPacket dp = new DatagramPacket(exit, exit.length, address, port);
		ds.send(dp);
		
		ds.close();

	}
}
