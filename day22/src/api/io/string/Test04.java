package api.io.string;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//문자열 입력을 Reader로 진행
		
		File target = new File("kh", "string2.kh");
		FileReader fr = new FileReader(target);
		
		char[] buffer = new char[10];
		StringBuffer sb = new StringBuffer(); //StringBuilder도 괜찮아요...
		
		while(true) {
			int size = fr.read(buffer);
			if(size == -1) break;
			sb.append(buffer, 0, size);
		}
		
		fr.close();
		
		System.out.println(sb.toString());
		
		
	}

}
