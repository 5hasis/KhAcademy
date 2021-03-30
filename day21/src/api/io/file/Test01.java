package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
//		목표 : 프로젝트에 잇는 file폴더의 hello.txt의 정보를 확인
//		=java.io.File 클래스 활용
		
//		파일을 제어할 수 있는 객체 생성
		File a = new File("file/hello.txt");
		File b = new File("file", "hello.txt");
		
//		각종 명령을 이용해서 파일의 정보를 분석
		System.out.println(a.exists()); //존재 유무
		System.out.println(b.exists());
		
		System.out.println(a.length()); //파일크기 = 파일글자수(ascii)
		
		System.out.println(a.getName()); //파일 이름
		System.out.println(a.getPath()); //파일 경로(프로젝트기준) : 상대경로
		System.out.println(a.getAbsolutePath()); //파일 전체경로 : 절대경로
		
		System.out.println(a.lastModified()); //최종 수정 시간
		
		Date d = new Date(a.lastModified());
		Format f = new SimpleDateFormat("y년 M월 d일 E요일, a H:mm:ss");
		System.out.println(f.format(d));
		
	}

}
