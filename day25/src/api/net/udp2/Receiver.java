package api.net.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
	public static void main(String[] args) throws IOException {
		//receiver 먼저 실행 후 sender 실행
		//sender가 종료되도 receiver가 끊어지지 않음 => 연결방식이 아니기 때문

		DatagramSocket ds = new DatagramSocket(30000);

		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);

		while (true) {
			ds.receive(dp);
			if(dp.getLength() == 1 && data[0] == -1) break;
			String content = new String(data, 0, dp.getLength());
			System.out.println("content : " + content);
		}
		
		ds.close();
	}
}
