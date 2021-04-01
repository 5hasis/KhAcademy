package api.net.tcp1;

import java.net.ServerSocket;

public class Test02 {
	public static void main(String[] args) {
//		Port는 char와 범위가 같다(0부터 65535까지)
		
//		포트 스캔
		for(int port = 0; port <= 65535; port++) {
			try {
				ServerSocket server = new ServerSocket(port);
				//System.out.println(port + "번 포트 사용 시작");
			}
			catch(Exception e) {
				System.out.println(port + "번 포트 사용 중");
			}
		}
		
	}

}
