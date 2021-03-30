package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
//		single byte 입력
//		목표 : file 폴더 안에 있는 single.kh 파일의 내용을 읽어와 콘솔에 출력

//		준비물 : 파일객체, 입력통로
		File target = new File("file", "single.kh");

		FileInputStream in = new FileInputStream(target);

//		프로그램 <- in <- target <- [single.kh]

//		권장하지 않는 방법
		for (long i = 0; i < target.length(); i++) {
			int n = in.read();
			System.out.println(n);
		}

//		-1이 입력되면 더이상 남은 데이터가 없다는 뜻(파일의 끝)
//		=-1과 같은 값들을 EOF라고 부름(End Of File)
		while (true) {
			int n = in.read();
			if (n == -1)break;
			System.out.println(n);
		}

		in.close();

	}

}
