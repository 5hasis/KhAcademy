package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		목표 : file이라는 폴더안에 single.kh라는 이름의 파일을 만들고 원하는 내용을 byte 단위로 출력
//		(유니코드 불가능)

//		준비물 : 파일객체, 출력통로

		File target = new File("file", "single.kh");
		FileOutputStream out = new FileOutputStream(target); //덮어쓰기
//		FileOutputStream out = new FileOutputStream(target, true); //이어쓰기

//		프로그램 -> out -> target -> [single.kh]
		out.write(65); // out으로 65라는 byte 데이터를 출력해라
		out.write('B'); // out으로 'B'라는 byte 데이터를 출력해라
		out.write(9); //tab
		out.write(104); //h
		out.write(101); //e
		out.write(108); //l
		out.write(108); //l
		out.write(111); //o
		out.write(10); // enter = \n
		
		out.write(30000); //byte를 벗어난값
//		byte를 벗어나도 byte로 강제변환됨
		
//		통로는 마지막에 close()
		out.close();

	}

}
