package api.io.string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		//앞선 문제를 해결하기 위해 Writer 계열을 사용
		//=FileOutputStream -> FileWriter
		//=BufferedOutputStream -> BufferedWriter
		
		File target = new File("kh", "string2.kh");
		FileWriter fw = new FileWriter(target);
		
		fw.write("Hello 자바1"); //flush() 안해주면 안들어감 -> buffer가 잇다는 뜻
		// 내장버퍼 존재
		
		fw.flush();
		fw.close();
		
	}

}
