package api.net.tcp1;

import java.net.ServerSocket;

public class Test01 {
	public static void main(String[] args) {
//		TCP 통신 : 연결지향형 통신
//		=연결을 위해 대기하는 프로그램과 접속하는 프로그램 2가지 필요
//		=연결을 대기하는 쪽을 서버라고 부름.
//		=연결을 시도하는 똑을 클라이언트라고 부름
		
//		서버코드
//		=통신을 위해서는 반드시 상대방의 IP와 Port를 알아야함
//		=서버 입장에서는 IP는 정해져 있고, Port만 설정하면 됨.
//		=어떤 포트가 사용할 수 있는지, 없는지를 파악해야 함
//		=ServerSocket이라는 클래스를 이용하여 포트를 지정한 뒤 서버를 개방해본다..
		
		try {
			ServerSocket server = new ServerSocket(30000);
			System.out.println("30000번 포트 사용 시작");
		}
		catch(Exception e) {
			System.out.println("30000번 포트 사용 중");
		}
		
	}

}
