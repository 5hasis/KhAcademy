package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//모든 클래스의 객체가 출력 가능한 것은 아님!
		//=java.io.Serializable의 자식클래스만 출력 가능 
		//=마킹 인터페이스(인증마크...)
		
		//객체 생성
		Runtime r = Runtime.getRuntime();
		
		//파일 출력
		//객체 -(직렬화)-> 바이너리 -(분해)-> 바이드 -(출력)-> 통로 
		
		File target = new File("kh", "object.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream obout = new ObjectOutputStream(buffer);
		
		//[프로그램] -> obout(직렬화+분해) -> buffer(대기실) -> out(통로) -> target -> [object.kh]
		obout.writeObject(r); //d라는 객체를 알아서 출력해라
		
		//통로정리
		obout.close();
		
	}
	
	
	
	
	
	
	
	
	
	

}
