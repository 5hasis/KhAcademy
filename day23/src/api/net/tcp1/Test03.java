package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03 {
	public static void main(String[] args) throws IOException {
		int port = 30000;
		
		//서버 개방 코드
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버가 준비되었습니다");
		
		//연결 대기 코드
		//=Socket : 연결 클래스
//		동접자가 10000명이다 하면 소켓이 10000개가 생성
		//소켓을 변수로 만들엇기 때문에 연결 1개! -> 리스트나 배열로 만들어야 연결 여러개!
		Socket socket = server.accept();
		System.out.println("사용자가 접속하였습니다");
		System.out.println(socket);
		
		//연결 종료 -> 순서 지키기!
		socket.close();
		server.close();
	}
}
