package api.net.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test02 {
	public static void main(String[] args) throws IOException {
//		UDP 수신
		
//		DatagramSoket(우체국)은 수신을 위한 포트를 지정해야함
		int port = 30000;
		DatagramSocket ds = new DatagramSocket(port);
		
		//받을 수 있는 공간 확보
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		//수신
		ds.receive(dp);
		
		//문자열 복원
		int size = dp.getLength(); //실제 읽은 byte 크기
		System.out.println("size : " + size);
		String content = new String(data, 0, size); //data를 0위치부터 size개만큼 문자열로 복원
		
		ds.close();
		
	}

}
