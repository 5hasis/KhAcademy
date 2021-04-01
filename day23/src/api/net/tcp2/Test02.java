package api.net.tcp2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//클라이언트
		//정보 저장
		String host = "172.30.1.52";
		int port = 30000;
		
		//유효성 검사 (생략가능)
		InetAddress address = InetAddress.getByName(host);
		
		//연결(=Socket 생성)
//		Socket socket = new Socket(host, port);
		Socket socket = new Socket(address, port);
		System.out.println("서버와 연결되었습니다");
		
		//연결 종료
		socket.close();
		
	}

}
