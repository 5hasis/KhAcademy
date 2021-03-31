package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test04_1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		// 문자열 입력을 Reader로 진행
		// =BufferedReader : 글자를 개행 전까지 모아주는 역할을 수행

		File target = new File("kh", "string2.kh");
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine(); // 한줄읽기
			System.out.println("line : " + line);
			if(line == null) break;
			
			//Thread.sleep(500L); //시간지연
		}

		br.close();

	}

}
