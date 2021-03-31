package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test06 {
	public static void main(String[] args) throws IOException {
		//목표 : 내가 만든 클래스의 객체를 입출력
		
		//객체 준비
		Student s = new Student("홍길동", 90, "010-1212-3434");
		
		//파일 출력
		File target = new File("kh", "student.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream obout = new ObjectOutputStream(buffer);
		
		obout.writeObject(s);
		
		obout.close();
	}
}
