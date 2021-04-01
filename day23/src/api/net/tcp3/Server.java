package api.net.tcp3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//싱글바이트 
		//접속하면 5byte 전송하는 예제
		
		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
		
		//byte를 전송하던가 수신하던가 둘 중 하나를 수행
		
//		FileOuputStream 대신에 socket.getOutputStream() 사용
		OutputStream out = socket.getOutputStream();
		
		out.write(104); //h
		out.write(101); //e
		out.write(108); //l
		out.write(108); //l
		out.write(111); //o
		
//		out.close(); //socket도 close() 됨
		socket.close();
		server.close();
		
		
		
	}

}
