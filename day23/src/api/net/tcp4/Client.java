package api.net.tcp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		
		//준비물 : 파일, 입력스트림, 소켓
		
		String host = "localhost";//
		int port = 30000;

//		유효성 검증
		InetAddress address = InetAddress.getByName(host);

//		소켓 생성(연결)
		Socket socket = new Socket(address, port);
		System.out.println("서버와 연결되었습니다");
		
		OutputStream out = socket.getOutputStream();
		
		File target = new File("kh", "test1");
		FileInputStream in = new FileInputStream(target);

		//in 에서 입력받은 byte를 out으로 출력
		System.out.println("파일 전송을 시작합니다. 총 " + target.length() + "bytes");
		while (true) {
			int n = in.read();
			if (n == -1)
				break;
			out.write(n);
			//System.out.println("n = " + n);
		}
		System.out.println("파일 전송이 완료되었습니다.");

//		연결 종료
		in.close();
		socket.close();
		System.out.println("서버와의 연결을 종료합니다.");
	}

}
