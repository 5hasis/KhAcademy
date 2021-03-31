package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//multi byte(int, long, float, double, ..) 출력
		
		File target = new File("kh", "multi.kh");
		
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data =new DataOutputStream(buffer);
		
		//[프로그램] -> data(분해) -> buffer(대기실) -> out(통로) -> target -> multi.kh
		data.writeInt(100); //100을 int의 방식으로 분해
		data.writeDouble(100); //100을 double의 방식으로 분해
		data.writeChar(100); //100을 char의 방식으로 분해
		
		//출력이 이루어지는 상황
		//1. 대기실을 비워야 출력이 이루어짐(수동)
		//2. 대기실을 가득 채워도 출력이 이루어짐(자동)
		data.flush();
		
		//(참고) close() 기능에 flush()가 포함되어 있음
		data.close();
	}

}
