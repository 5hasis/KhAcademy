package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) throws IOException {
//		복사 프로그램에 버퍼를 적용시켜 성능을 향상시킨 버전

//		준비물 : 파일2개, 스트림2개
		File origin = new File("file", "practice.kh"); // 입력용
		FileInputStream in = new FileInputStream(origin);

		File copy = new File("file", "copy.kh");
		FileOutputStream out = new FileOutputStream(copy);

		byte[] buffer = new byte[10];

		while (true) {
			int size = in.read(buffer);
			if(size == -1) break;
			out.write(buffer, 0, size); // 0부터 size까지
	
		}

		in.close();
		out.close();
	}

}
