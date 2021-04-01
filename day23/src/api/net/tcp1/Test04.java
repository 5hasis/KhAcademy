package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04 {
	public static void main(String[] args) throws IOException {
		int port = 30000;

		// 서버 개방 코드
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버가 준비되었습니다");

		while (true) {
			// 연결 대기 코드
			// =Socket : 연결 클래스
			Socket socket = server.accept();
			System.out.println("사용자가 접속하였습니다");
			System.out.println(socket);
			socket.close();
		}
		
		//server.close();
	}
}
