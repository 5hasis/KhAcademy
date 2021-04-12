package api.net.udp3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receiver {
	public static void main(String[] args) throws IOException {
//		UDP 멀티캐스트 수신자
//		= 송신자와 마찬가지로 채널에 가입을 해야한다
//		= 채널에서 전송되는 메세지를 수신해서 후속 작업을 수행
		
		MulticastSocket ms = new MulticastSocket(30000);
		
		InetAddress address = InetAddress.getByName("234.234.234.234");
		ms.joinGroup(address);
		
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		ms.receive(dp);//수신
		String content = new String(data, 0, dp.getLength());
		
		System.out.println("content : " + content);
		
		ms.close();
	}

}
