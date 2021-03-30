package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
//		목표 : 싱글 바이트 출력을 여러개 묶어서 처리
//		=byte -> byte[]
		
//		준비
		File target = new File("file", "single2.kh");
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] data = new byte[] {104, 101, 108, 108, 111};
		
		out.write(data); //data 배열의 내용을 전부 다 출력
		out.write(data, 1, 3); //data 배열의 내용을 1번부터 3개 출력(ell)
		out.write(data, 0, 4); //data 배열의 내용을 0번부터 4개 출력(hell)
		
//		정리
		out.close();
		
	}

}
