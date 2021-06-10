package api.net.tcp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) throws IOException {
		//바이트 배열 사용
		//준비물 : 파일, 입력스트림, 소켓 
		
		String host = "1.220.236.75";//
		int port = 30000;

//		유효성 검증
		InetAddress address = InetAddress.getByName(host);

//		소켓 생성(연결)
		Socket socket = new Socket(address, port);
		System.out.println("서버와 연결되었습니다");
		
		OutputStream out = socket.getOutputStream();
		
		File target = new File("kh", "test");
		FileInputStream in = new FileInputStream(target);

		//in 에서 입력받은 byte를 out으로 출력
		byte[] buffer = new byte[1024];
		System.out.println("파일 전송을 시작합니다. 총 " + target.length() + "bytes");
		while (true) {
			int n = in.read();
			if (n == -1)
				break;
			out.write(buffer, 0, n);
			System.out.println("n = " + n);
		}
		System.out.println("파일 전송이 완료되었습니다.");

//		연결 종료
		in.close();
		socket.close();
		System.out.println("서버와의 연결을 종료합니다.");
	}

}
