package api.net.tcp3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) throws IOException {
		//구조 개선
		
//		서버에 접속해서 5 byte 의 내용을 수신하는 예제
		
//		String host = "127.0.0.1";//자기자신(IP)
		String host = "localhost";//자기자신(별칭)
		int port = 30000;
		
//		유효성 검증
		InetAddress address = InetAddress.getByName(host);
		
//		소켓 생성(연결)
		Socket socket = new Socket(address, port);
		
//		전송되는 byte를 수신하여 화면에 출력
		InputStream in = socket.getInputStream();
		
		while(true) {
			int n = in.read();
			if(n == -1) break;
			System.out.println("n = " + n);
		}
		
//		연결 종료
		socket.close();
		
	}
}