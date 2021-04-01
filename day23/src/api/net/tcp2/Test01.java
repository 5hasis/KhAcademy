package api.net.tcp2;

import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) {
		// TCP 클라이언트 코드
		// =반드시 접속해야할 서버의 IP와 Port를 알아야함.
		// =IP의 경우는 돈을 내고 등록하거나 DDNS 설정을 하면 영문으로 바꿀 수 있음

		
		String host = "172.30.1.52";
		int port = 30000;

		//실제 연결이랑 관계가 없음, 양식만 검사
		try {
			InetAddress address = InetAddress.getByName(host);
			System.out.println("접속 가능한 주소입니다.");
		} 
		catch (Exception e) {
			System.out.println("접속 불가능한 주소입니다");
		}
	}
}
