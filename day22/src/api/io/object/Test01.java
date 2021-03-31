package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//목표 : 객체를 만들어서 파일에 출력
		
		//객체 생성
		Date d = new Date();
		
		//파일 출력
		//객체 -(직렬화)-> 바이너리 -(분해)-> 바이드 -(출력)-> 통로 
		
		File target = new File("kh", "object.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream obout = new ObjectOutputStream(buffer);
		
		//[프로그램] -> obout(직렬화+분해) -> buffer(대기실) -> out(통로) -> target -> [object.kh]
		obout.writeObject(d); //d라는 객체를 알아서 출력해라
		
		//통로정리
		obout.close();
		
	}
	
	
	
	
	
	
	
	
	
	

}
