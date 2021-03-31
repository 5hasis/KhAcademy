package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// 멀티바이트 입력
		// 준비물 : 파일객체, 입력스트림, 버퍼스트림, 조립스트림

		File target = new File("kh", "multi.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);

		// [프로그램] <- data(조립) <-buffer(대기실) <- in(통로)
		int a = data.readInt(); // 4byte를 읽어와서 int로 복원
		double b = data.readDouble(); // 8byte를 읽어와서 double로 복원
		float c = data.readFloat(); // 4byte를 읽어와서 float로 복원
		char d = data.readChar(); // 2byte를 읽어와서 char로 복원
		// *저장된 순서대로 불러와야함!*

		data.close();

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}

}
