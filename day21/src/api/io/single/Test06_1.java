package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test06_1 {
	public static void main(String[] args) throws IOException {
//		복사 프로그램에 버퍼를 적용시켜 성능을 향상시킨 버전
		
//		준비물 : 파일2개 , 스트림2개 , 버퍼
		File origin = new File("D:/", "test.mp4");//입력용
		File copy = new File("D:/", "copy.mp4");//출력용
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(copy);
		
		//버퍼의 크기는 어느정도가 적당할까?
		//8192 = 2의 13제곱
		byte[] buffer = new byte[8192];

//		진행상황 표시용 변수
		long total = origin.length();
		long count = 0L;
		Format f = new DecimalFormat("0.00");
		
//		반복
		while(true) {
			int size = in.read(buffer);
			if(size == -1) break;
			out.write(buffer, 0, size);
			
			count += size;
			
			double percent = count * 100.0 / total;
			System.out.print("총 "+total+" 중 "+count+"byte 이동 완료");
			System.out.println("("+f.format(percent)+"%)");
		}
		
//		정리
		in.close();
		out.close();
	}
}
