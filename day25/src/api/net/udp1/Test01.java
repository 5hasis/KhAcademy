package api.net.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test01 {
	public static void main(String[] args) throws SocketException, IOException {
//		UDP통신
//		= User Datagram Protocol
//		= 비연결형 통신(ex 문자 우편)
//		= 신뢰도는 낮지만 빠른 전송을 추구하는 통신 방식
//		= 안정적인 환경(ex 근거리)에서 사용하면 높은 효율을 보장하는 통신 방식
//		= 서버와 클라이언트의 개념이 없고, 전송자/수신자의 개념이 존재
//		- 문자열 전송 x, 오직 바이트만 전송 가능
		
		InetAddress address = InetAddress.getByName("localhost");
		int port = 30000;
		
		DatagramSocket ds = new DatagramSocket(); //전송용 우체국
		
		String content = "Hello UDP"; //편지 내용
		
		//편지봉투 + 내용
		byte[] data = content.getBytes(); //바이트로 변환
//		DatagramPacket dp = new DatagramPacket(내용, 내용크기, 수신인IP, 수신인Port)
		DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
		
		//전송
		ds.send(dp);
		
		//종료
		ds.close();
		
	}

}
