package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws IOException {
//		목표 : 싱글바이트 입력을 여러개 묶어서 처리
//		=여러개를 한번에 가져오면 빠르다는 것은 알지만
//		=몇개씩 가져올지 어떻게 정할까? (버퍼 크기 설정)
		
//		ex) 버퍼의 크기를 5로 설정하고 진행
		
//		준비물 : 파일, 스트림, 버퍼
		File target = new File("file", "single2.kh");
		FileInputStream in = new FileInputStream(target);
		
		byte[] buffer = new byte[5];
		
		int n = in.read(buffer); //buffer에 입력 가능한 모든 데이터를 순서대로 채워라!
		System.out.println("n = " + n);
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer); 
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer); 
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer); 
		System.out.println(Arrays.toString(buffer));
		
		in.close();
		
	}

}
