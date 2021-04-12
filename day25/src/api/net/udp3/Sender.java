package api.net.udp3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender {
	public static void main(String[] args) throws IOException {
//		UDP 멀티캐스트 예제
//		= 채널에 가입하여 그룹 전송이 가능하도록 하는 UDP 통신 방식
//		= 채널은 IP범위가 존재(224.0.0.0 ~ 239.255.255.255)
		
		MulticastSocket ms = new MulticastSocket();
		
		InetAddress address = InetAddress.getByName("234.234.234.234");
		int port = 30000;
		ms.joinGroup(address); //채널 가입
		
		String content = "Hello Multicast!";
		byte[] data = content.getBytes();
//		DatagramPacket dp = new DatagramPacket(데이터, 데이터크기, 채널IP, 채널Port );
		DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
		
		ms.send(dp); //전송
		
		ms.close(); //종료
	}

}
