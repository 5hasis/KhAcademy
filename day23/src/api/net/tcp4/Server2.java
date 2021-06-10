  
package api.net.tcp4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	public static void main(String[] args) throws IOException {
//		준비물 : 출력파일, 출력스트림, 소켓
		
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버를 시작합니다");
		
		Socket socket = server.accept();
		System.out.println("사용자가 접속하였습니다. IP는 "+socket.getInetAddress());

		InputStream in = socket.getInputStream();

		File dir = new File("kh");
		dir.mkdirs();
		
		File target = new File(dir, "test");
		FileOutputStream out = new FileOutputStream(target);
		
//		in 에서 입력받은 내용을 out 으로 내보낸다
		byte[] buffer = new byte[1024];
		System.out.println("사용자가 보낸 파일을 수신합니다");
		while(true) {
			int n = in.read(buffer);
			if(n == -1) break;
			out.write(buffer, 0, n);
		}
		System.out.println("사용자가 보낸 파일을 모두 수신하였습니다");
		
//		연결 종료
		out.close();
		socket.close();
		System.out.println("연결을 종료합니다");
		
//		서버 종료
		server.close();
		System.out.println("서버를 종료합니다");
		
	}
}