package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//문자열을 바이트로 바꿔서 싱글바이트 출력 수행
		
		//준비물 : 파일 객체, 출력스트림
		File target = new File("kh", "string.kh");
		FileOutputStream out = new FileOutputStream(target);
		
		//출력
		String str = "Hello 자바1";
		byte[] by = str.getBytes();
		out.write(by);
		
		str = "Hello 자바2";
		by = str.getBytes();
		out.write(by);
		
		out.close();
		
		//문제점
		//1. byte로의 변환과 인코딩 처리를 자동화 할 수 없을까?
		//2. 개행 문자를 직접 추가하지 않을 수 없을까?
		//3. 문자열 외의 데이터들은 출력할 수 없을까?
		
		
	}

}
