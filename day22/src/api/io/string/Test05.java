package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
		File target = new File("kh", "song.txt");
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);
		
//		System.out.println("파일 유무 : " + target.exists());
//		System.out.println("파일 여부 : " + target.isFile());
		
		int charCnt = 0;
		int lineCnt = 0;
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
			
			charCnt += line.length();
			//if(비어있는 줄이 아니라면)
			//if(!line.trim().isEnpty())
			//if(!line.isBlank())
			if(line.trim().length() > 0) {
				lineCnt++;
			}
		}
		br.close();
		
		System.out.println();
		System.out.println("총 글자 수 : " + charCnt);
		System.out.println("총 줄 수  : " + lineCnt);

	}

}
